package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.EmployeeEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeEntityRepository extends CrudRepository<EmployeeEntity, Integer>, CrudRepositoryCustom<EmployeeEntity> {
}
