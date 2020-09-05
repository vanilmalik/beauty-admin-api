package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.LocaleEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocaleEntityRepository extends CrudRepository<LocaleEntity, Integer>, CrudRepositoryCustom<LocaleEntity> {
}
