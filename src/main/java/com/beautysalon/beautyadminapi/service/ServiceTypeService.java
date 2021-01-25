package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.ServiceTypeEntity;

import java.util.List;

public interface ServiceTypeService {

    ServiceTypeEntity doRead(Integer id);

    List<ServiceTypeEntity> doReadAll();

    ServiceTypeEntity doCreate(ServiceTypeEntity serviceTypeEntity);

    ServiceTypeEntity doUpdate(ServiceTypeEntity serviceTypeEntity);

    void doDelete(ServiceTypeEntity serviceTypeEntity);
}
