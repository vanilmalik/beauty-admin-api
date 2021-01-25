package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.ServiceTypeEntity;
import com.beautysalon.beautyadminapi.repository.ServiceTypeEntityRepository;
import com.beautysalon.beautyadminapi.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private ServiceTypeEntityRepository serviceTypeEntityRepository;

    @Override
    public ServiceTypeEntity doRead(Integer id) {
        return serviceTypeEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<ServiceTypeEntity> doReadAll() {
        return (List<ServiceTypeEntity>) serviceTypeEntityRepository.findAll();
    }

    @Override
    @Transactional
    public ServiceTypeEntity doCreate(ServiceTypeEntity serviceTypeEntity) {
        return serviceTypeEntityRepository.create(serviceTypeEntity);
    }

    @Override
    @Transactional
    public ServiceTypeEntity doUpdate(ServiceTypeEntity serviceTypeEntity) {
        return serviceTypeEntityRepository.update(serviceTypeEntity);
    }

    @Override
    @Transactional
    public void doDelete(ServiceTypeEntity botMessageEntity) {
        serviceTypeEntityRepository.delete(botMessageEntity);
    }

}
