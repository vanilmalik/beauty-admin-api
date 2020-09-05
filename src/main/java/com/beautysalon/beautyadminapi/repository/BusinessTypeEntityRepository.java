package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.BusinessTypeEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessTypeEntityRepository extends CrudRepository<BusinessTypeEntity, Integer>, CrudRepositoryCustom<BusinessTypeEntity> {
}
