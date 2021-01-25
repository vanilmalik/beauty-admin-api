package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.SaloonServiceTypeEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaloonServiceTypeEntityRepository extends CrudRepository<SaloonServiceTypeEntity, Integer>, CrudRepositoryCustom<SaloonServiceTypeEntity> {
}
