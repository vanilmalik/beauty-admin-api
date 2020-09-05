package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.DiscountEntity;
import com.beautysalon.beautyadminapi.repository.DiscountEntityRepository;
import com.beautysalon.beautyadminapi.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountEntityRepository discountEntityRepository;

    @Override
    public DiscountEntity doRead(Integer id) {
        return discountEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<DiscountEntity> doReadAll() {
        return (List<DiscountEntity>) discountEntityRepository.findAll();
    }

    @Override
    @Transactional
    public DiscountEntity doCreate(DiscountEntity discountEntity) {
        return discountEntityRepository.create(discountEntity);
    }

    @Override
    @Transactional
    public DiscountEntity doUpdate(DiscountEntity discountEntity) {
        return discountEntityRepository.update(discountEntity);
    }

    @Override
    @Transactional
    public void doDelete(DiscountEntity botMessageEntity) {
        discountEntityRepository.delete(botMessageEntity);
    }

}
