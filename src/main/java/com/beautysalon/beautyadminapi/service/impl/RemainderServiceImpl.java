package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.RemainderEntity;
import com.beautysalon.beautyadminapi.repository.RemainderEntityRepository;
import com.beautysalon.beautyadminapi.service.RemainderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RemainderServiceImpl implements RemainderService {

    @Autowired
    private RemainderEntityRepository remainderEntityRepository;

    @Override
    public RemainderEntity doRead(Integer id) {
        return remainderEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<RemainderEntity> doReadAll() {
        return (List<RemainderEntity>) remainderEntityRepository.findAll();
    }

    @Override
    @Transactional
    public RemainderEntity doCreate(RemainderEntity remainderEntity) {
        return remainderEntityRepository.create(remainderEntity);
    }

    @Override
    @Transactional
    public RemainderEntity doUpdate(RemainderEntity remainderEntity) {
        return remainderEntityRepository.update(remainderEntity);
    }

    @Override
    @Transactional
    public void doDelete(RemainderEntity botMessageEntity) {
        remainderEntityRepository.delete(botMessageEntity);
    }

}
