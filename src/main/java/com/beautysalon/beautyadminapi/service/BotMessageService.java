package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.BotMessageEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BotMessageService {

    BotMessageEntity doRead(Integer id);

    List<BotMessageEntity> doReadAll();

    BotMessageEntity doCreate(BotMessageEntity botMessageEntity);

    @Transactional
    BotMessageEntity doUpdate(BotMessageEntity botMessageEntity);

    void doDelete(BotMessageEntity botMessageEntity);
}
