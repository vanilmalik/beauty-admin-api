package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.EmployeeEntity;
import com.beautysalon.beautyadminapi.repository.EmployeeEntityRepository;
import com.beautysalon.beautyadminapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeEntityRepository employeeEntityRepository;

    @Override
    public EmployeeEntity doRead(Integer id) {
        return employeeEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeEntity> doReadAll() {
        return (List<EmployeeEntity>) employeeEntityRepository.findAll();
    }

    @Override
    @Transactional
    public EmployeeEntity doCreate(EmployeeEntity employeeEntity) {
        return employeeEntityRepository.create(employeeEntity);
    }

    @Override
    @Transactional
    public EmployeeEntity doUpdate(EmployeeEntity employeeEntity) {
        return employeeEntityRepository.update(employeeEntity);
    }

    @Override
    @Transactional
    public void doDelete(EmployeeEntity botMessageEntity) {
        employeeEntityRepository.delete(botMessageEntity);
    }

}
