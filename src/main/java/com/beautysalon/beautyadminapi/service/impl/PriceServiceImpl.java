package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.PriceEntity;
import com.beautysalon.beautyadminapi.repository.PriceEntityRepository;
import com.beautysalon.beautyadminapi.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceEntityRepository priceEntityRepository;

    @Override
    public PriceEntity doRead(Integer id) {
        return priceEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<PriceEntity> doReadAll() {
        return (List<PriceEntity>) priceEntityRepository.findAll();
    }

    @Override
    @Transactional
    public PriceEntity doCreate(PriceEntity priceEntity) {
        return priceEntityRepository.create(priceEntity);
    }

    @Override
    @Transactional
    public PriceEntity doUpdate(PriceEntity priceEntity) {
        return priceEntityRepository.update(priceEntity);
    }

    @Override
    @Transactional
    public void doDelete(PriceEntity botMessageEntity) {
        priceEntityRepository.delete(botMessageEntity);
    }

}
