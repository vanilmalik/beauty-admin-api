package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.ClientCommentEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCommentEntityRepository extends CrudRepository<ClientCommentEntity, Integer>, CrudRepositoryCustom<ClientCommentEntity> {
}
