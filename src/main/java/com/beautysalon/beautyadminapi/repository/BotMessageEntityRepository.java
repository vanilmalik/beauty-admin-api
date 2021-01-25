package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.BotMessageEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotMessageEntityRepository extends CrudRepository<BotMessageEntity, Integer>, CrudRepositoryCustom<BotMessageEntity> {
}
