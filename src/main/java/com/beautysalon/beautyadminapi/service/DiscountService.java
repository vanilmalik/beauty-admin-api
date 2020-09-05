package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.DiscountEntity;

import java.util.List;

public interface DiscountService {

    DiscountEntity doRead(Integer id);

    List<DiscountEntity> doReadAll();

    DiscountEntity doCreate(DiscountEntity discountEntity);

    DiscountEntity doUpdate(DiscountEntity discountEntity);

    void doDelete(DiscountEntity discountEntity);
}
