package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.BotMessageTypeEntity;
import com.beautysalon.beautyadminapi.repository.BotMessageTypeEntityRepository;
import com.beautysalon.beautyadminapi.service.BotMessageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BotMessageTypeServiceImpl implements BotMessageTypeService {

    @Autowired
    private BotMessageTypeEntityRepository botMessageTypeEntityRepository;

    @Override
    public BotMessageTypeEntity doRead(Integer id) {
        return botMessageTypeEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<BotMessageTypeEntity> doReadAll() {
        return (List<BotMessageTypeEntity>) botMessageTypeEntityRepository.findAll();
    }

    @Override
    @Transactional
    public BotMessageTypeEntity doCreate(BotMessageTypeEntity botMessageEntity) {
        return botMessageTypeEntityRepository.create(botMessageEntity);
    }

    @Override
    @Transactional
    public BotMessageTypeEntity doUpdate(BotMessageTypeEntity botMessageEntity) {
        return botMessageTypeEntityRepository.update(botMessageEntity);
    }

    @Override
    @Transactional
    public void doDelete(BotMessageTypeEntity botMessageEntity) {
        botMessageTypeEntityRepository.delete(botMessageEntity);
    }

}
