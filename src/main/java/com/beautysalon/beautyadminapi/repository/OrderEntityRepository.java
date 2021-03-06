package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.OrderEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderEntityRepository extends CrudRepository<OrderEntity, Integer>, CrudRepositoryCustom<OrderEntity> {
}
