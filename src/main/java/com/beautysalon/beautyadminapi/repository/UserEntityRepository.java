package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.UserEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends CrudRepository<UserEntity, Integer>, CrudRepositoryCustom<UserEntity> {
}
