package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.SaloonEntity;
import com.beautysalon.beautyadminapi.repository.SaloonEntityRepository;
import com.beautysalon.beautyadminapi.service.SaloonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaloonServiceImpl implements SaloonService {

    @Autowired
    private SaloonEntityRepository saloonEntityRepository;

    @Override
    public SaloonEntity doRead(Integer id) {
        return saloonEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<SaloonEntity> doReadAll() {
        return (List<SaloonEntity>) saloonEntityRepository.findAll();
    }

    @Override
    @Transactional
    public SaloonEntity doCreate(SaloonEntity saloonEntity) {
        return saloonEntityRepository.create(saloonEntity);
    }

    @Override
    @Transactional
    public SaloonEntity doUpdate(SaloonEntity saloonEntity) {
        return saloonEntityRepository.update(saloonEntity);
    }

    @Override
    @Transactional
    public void doDelete(SaloonEntity botMessageEntity) {
        saloonEntityRepository.delete(botMessageEntity);
    }

}
