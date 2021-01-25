package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.ServiceTypeEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceTypeEntityRepository extends CrudRepository<ServiceTypeEntity, Integer>, CrudRepositoryCustom<ServiceTypeEntity> {
}
