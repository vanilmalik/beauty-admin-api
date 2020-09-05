package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.SaloonServiceTypeEntity;
import com.beautysalon.beautyadminapi.repository.SaloonServiceTypeEntityRepository;
import com.beautysalon.beautyadminapi.service.SaloonServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaloonServiceTypeServiceImpl implements SaloonServiceTypeService {

    @Autowired
    private SaloonServiceTypeEntityRepository saloonServiceTypeEntityRepository;

    @Override
    public SaloonServiceTypeEntity doRead(Integer id) {
        return saloonServiceTypeEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<SaloonServiceTypeEntity> doReadAll() {
        return (List<SaloonServiceTypeEntity>) saloonServiceTypeEntityRepository.findAll();
    }

    @Override
    @Transactional
    public SaloonServiceTypeEntity doCreate(SaloonServiceTypeEntity serviceTypeEntity) {
        return saloonServiceTypeEntityRepository.create(serviceTypeEntity);
    }

    @Override
    @Transactional
    public SaloonServiceTypeEntity doUpdate(SaloonServiceTypeEntity serviceTypeEntity) {
        return saloonServiceTypeEntityRepository.update(serviceTypeEntity);
    }

    @Override
    @Transactional
    public void doDelete(SaloonServiceTypeEntity saloonServiceTypeEntity) {
        saloonServiceTypeEntityRepository.delete(saloonServiceTypeEntity);
    }

}
