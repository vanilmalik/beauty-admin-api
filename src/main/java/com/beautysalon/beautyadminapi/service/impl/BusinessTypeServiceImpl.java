package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.BusinessTypeEntity;
import com.beautysalon.beautyadminapi.repository.BusinessTypeEntityRepository;
import com.beautysalon.beautyadminapi.service.BusinessTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BusinessTypeServiceImpl implements BusinessTypeService {

    @Autowired
    private BusinessTypeEntityRepository businessTypeEntityRepository;

    @Override
    public BusinessTypeEntity doRead(Integer id) {
        return businessTypeEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<BusinessTypeEntity> doReadAll() {
        return (List<BusinessTypeEntity>) businessTypeEntityRepository.findAll();
    }

    @Override
    @Transactional
    public BusinessTypeEntity doCreate(BusinessTypeEntity businessTypeEntity) {
        return businessTypeEntityRepository.create(businessTypeEntity);
    }

    @Override
    @Transactional
    public BusinessTypeEntity doUpdate(BusinessTypeEntity businessTypeEntity) {
        return businessTypeEntityRepository.update(businessTypeEntity);
    }

    @Override
    @Transactional
    public void doDelete(BusinessTypeEntity botMessageEntity) {
        businessTypeEntityRepository.delete(botMessageEntity);
    }

}
