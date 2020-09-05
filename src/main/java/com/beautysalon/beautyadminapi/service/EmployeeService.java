package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    EmployeeEntity doRead(Integer id);

    List<EmployeeEntity> doReadAll();

    EmployeeEntity doCreate(EmployeeEntity employeeEntity);

    EmployeeEntity doUpdate(EmployeeEntity employeeEntity);

    void doDelete(EmployeeEntity employeeEntity);
}
