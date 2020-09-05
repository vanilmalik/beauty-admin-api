package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.OrderEntity;

import java.util.List;

public interface OrderService {

    OrderEntity doRead(Integer id);

    List<OrderEntity> doReadAll();

    OrderEntity doCreate(OrderEntity orderEntity);

    OrderEntity doUpdate(OrderEntity orderEntity);

    void doDelete(OrderEntity orderEntity);
}
