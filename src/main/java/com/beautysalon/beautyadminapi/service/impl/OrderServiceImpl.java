package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.OrderEntity;
import com.beautysalon.beautyadminapi.repository.OrderEntityRepository;
import com.beautysalon.beautyadminapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderEntityRepository orderEntityRepository;

    @Override
    public OrderEntity doRead(Integer id) {
        return orderEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<OrderEntity> doReadAll() {
        return (List<OrderEntity>) orderEntityRepository.findAll();
    }

    @Override
    @Transactional
    public OrderEntity doCreate(OrderEntity orderEntity) {
        return orderEntityRepository.create(orderEntity);
    }

    @Override
    @Transactional
    public OrderEntity doUpdate(OrderEntity orderEntity) {
        return orderEntityRepository.update(orderEntity);
    }

    @Override
    @Transactional
    public void doDelete(OrderEntity botMessageEntity) {
        orderEntityRepository.delete(botMessageEntity);
    }

}
