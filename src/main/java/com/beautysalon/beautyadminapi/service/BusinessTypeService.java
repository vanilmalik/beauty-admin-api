package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.BusinessTypeEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BusinessTypeService {

    BusinessTypeEntity doRead(Integer id);

    List<BusinessTypeEntity> doReadAll();

    BusinessTypeEntity doCreate(BusinessTypeEntity businessTypeEntity);

    BusinessTypeEntity doUpdate(BusinessTypeEntity businessTypeEntity);

    void doDelete(BusinessTypeEntity businessTypeEntity);
}
