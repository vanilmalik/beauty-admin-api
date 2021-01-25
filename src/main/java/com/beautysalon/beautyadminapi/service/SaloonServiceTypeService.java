package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.SaloonServiceTypeEntity;

import java.util.List;

public interface SaloonServiceTypeService {

    SaloonServiceTypeEntity doRead(Integer id);

    List<SaloonServiceTypeEntity> doReadAll();

    SaloonServiceTypeEntity doCreate(SaloonServiceTypeEntity serviceTypeEntity);

    SaloonServiceTypeEntity doUpdate(SaloonServiceTypeEntity serviceTypeEntity);

    void doDelete(SaloonServiceTypeEntity saloonServiceTypeEntity);
}
