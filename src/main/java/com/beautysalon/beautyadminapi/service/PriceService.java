package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.PriceEntity;

import java.util.List;

public interface PriceService {

    PriceEntity doRead(Integer id);

    List<PriceEntity> doReadAll();

    PriceEntity doCreate(PriceEntity priceEntity);

    PriceEntity doUpdate(PriceEntity priceEntity);

    void doDelete(PriceEntity priceEntity);
}
