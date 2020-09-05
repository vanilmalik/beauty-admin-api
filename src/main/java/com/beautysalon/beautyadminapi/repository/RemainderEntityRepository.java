package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.RemainderEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainderEntityRepository extends CrudRepository<RemainderEntity, Integer>, CrudRepositoryCustom<RemainderEntity> {
}
