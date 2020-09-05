package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.PriceEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceEntityRepository extends CrudRepository<PriceEntity, Integer>, CrudRepositoryCustom<PriceEntity> {
}
