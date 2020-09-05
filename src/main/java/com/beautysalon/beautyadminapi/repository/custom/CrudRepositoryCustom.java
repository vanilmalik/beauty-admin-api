package com.beautysalon.beautyadminapi.repository.custom;

import org.springframework.data.jpa.domain.Specification;

import java.util.Map;

public interface CrudRepositoryCustom<K> {

    K update(K entity);

    K create(K entity);

    void delete (Specification<K> specification);

    K patch(Integer id, Map<String, Object> attributes, Class<K> clazz);
}
