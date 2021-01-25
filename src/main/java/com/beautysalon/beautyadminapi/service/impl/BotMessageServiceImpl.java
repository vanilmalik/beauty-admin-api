package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.BotMessageEntity;
import com.beautysalon.beautyadminapi.repository.BotMessageEntityRepository;
import com.beautysalon.beautyadminapi.service.BotMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BotMessageServiceImpl implements BotMessageService {

    @Autowired
    private BotMessageEntityRepository botMessageEntityRepository;

    @Override
    public BotMessageEntity doRead(Integer id) {
        return botMessageEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<BotMessageEntity> doReadAll() {
        return (List<BotMessageEntity>) botMessageEntityRepository.findAll();
    }

    @Override
    @Transactional
    public BotMessageEntity doCreate(BotMessageEntity botMessageEntity) {
        return botMessageEntityRepository.create(botMessageEntity);
    }

    @Override
    @Transactional
    public BotMessageEntity doUpdate(BotMessageEntity botMessageEntity) {
        return botMessageEntityRepository.update(botMessageEntity);
    }

    @Override
    @Transactional
    public void doDelete(BotMessageEntity botMessageEntity) {
        botMessageEntityRepository.delete(botMessageEntity);
    }

}
