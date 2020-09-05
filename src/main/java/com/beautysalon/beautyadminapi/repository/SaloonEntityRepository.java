package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.SaloonEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaloonEntityRepository extends CrudRepository<SaloonEntity, Integer>, CrudRepositoryCustom<SaloonEntity> {
}
