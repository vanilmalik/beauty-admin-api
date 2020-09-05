package com.beautysalon.beautyadminapi.repository;

import com.beautysalon.beautyadminapi.entity.BotMessageTypeEntity;
import com.beautysalon.beautyadminapi.repository.custom.CrudRepositoryCustom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotMessageTypeEntityRepository extends CrudRepository<BotMessageTypeEntity, Integer>, CrudRepositoryCustom<BotMessageTypeEntity> {
}
