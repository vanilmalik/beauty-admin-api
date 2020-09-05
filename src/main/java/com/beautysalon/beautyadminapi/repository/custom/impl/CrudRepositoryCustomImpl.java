package com.beautysalon.beautyadminapi.repository.custom.impl;

import com.beautysalon.beautyadminapi.entity.PersistenceEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;
import org.springframework.util.ReflectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Map;

import static java.util.Objects.nonNull;

@Repository
public class CrudRepositoryCustomImpl<K> implements CrudRepositoryCustom<K> {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public K update(K entity) {
        K mergedEntity = entityManager.merge(entity);
        entityManager.flush();
        if (entity instanceof PersistenceEntity) {
            entityManager.clear();
            mergedEntity = (K) entityManager.find(mergedEntity.getClass(), ((PersistenceEntity) mergedEntity).getId());
        }
        return mergedEntity;
    }

    @SuppressWarnings("unchecked")
    @Override
    public K create(K entity) {
        entityManager.persist(entity);
        entityManager.flush();
        if (entity instanceof PersistenceEntity) {
            entityManager.clear();
            return  (K) entityManager.find(entity.getClass(), ((PersistenceEntity) entity).getId());
        }
        return entity;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void delete(Specification<K> specification) {
        Class<K> clazz = (Class<K>) ((ParameterizedType) specification.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaDelete<K> criteriaDelete = builder.createCriteriaDelete(clazz);
        Root<K> root = criteriaDelete.from(clazz);
        Predicate condition = specification.toPredicate(root, builder.createQuery(), builder);
        criteriaDelete.where(condition);
        entityManager.createQuery(criteriaDelete).executeUpdate();
        entityManager.flush();
    }

    @Override
    public K patch(Integer id, Map<String, Object> attributes, Class<K> clazz) {
        K entity = entityManager.find(clazz, id);

        attributes.forEach((name, value) -> {
            Field field = ReflectionUtils.findField(clazz, name);

            if (nonNull(field)) {
                field.setAccessible(true);
                ReflectionUtils.setField(field, entity, value);
            }
        });

        return update(entity);
    }

}
