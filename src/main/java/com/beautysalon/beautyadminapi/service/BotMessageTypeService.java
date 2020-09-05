package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.BotMessageTypeEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BotMessageTypeService {

    BotMessageTypeEntity doRead(Integer id);

    List<BotMessageTypeEntity> doReadAll();

    BotMessageTypeEntity doCreate(BotMessageTypeEntity botMessageEntity);

    BotMessageTypeEntity doUpdate(BotMessageTypeEntity botMessageEntity);

    void doDelete(BotMessageTypeEntity botMessageTypeEntity);
}
