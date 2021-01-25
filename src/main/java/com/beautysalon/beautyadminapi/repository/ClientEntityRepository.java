package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.ClientEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientEntityRepository extends CrudRepository<ClientEntity, Integer>, CrudRepositoryCustom<ClientEntity> {

    Page<ClientEntity> findAll(Pageable pageable);
}
