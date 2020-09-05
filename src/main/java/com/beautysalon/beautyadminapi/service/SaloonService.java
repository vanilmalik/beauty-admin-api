package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.SaloonEntity;

import java.util.List;

public interface SaloonService {

    SaloonEntity doRead(Integer id);

    List<SaloonEntity> doReadAll();

    SaloonEntity doCreate(SaloonEntity saloonEntity);

    SaloonEntity doUpdate(SaloonEntity saloonEntity);

    void doDelete(SaloonEntity saloonEntity);
}
