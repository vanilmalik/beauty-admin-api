package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.DiscountEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountEntityRepository extends CrudRepository<DiscountEntity, Integer>, CrudRepositoryCustom<DiscountEntity> {
}
