package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.LocaleEntity;
import com.beautysalon.beautyadminapi.repository.LocaleEntityRepository;
import com.beautysalon.beautyadminapi.service.LocaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LocaleServiceImpl implements LocaleService {

    @Autowired
    private LocaleEntityRepository localeEntityRepository;

    @Override
    public LocaleEntity doRead(Integer id) {
        return localeEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<LocaleEntity> doReadAll() {
        return (List<LocaleEntity>) localeEntityRepository.findAll();
    }

    @Override
    @Transactional
    public LocaleEntity doCreate(LocaleEntity localeEntity) {
        return localeEntityRepository.create(localeEntity);
    }

    @Override
    @Transactional
    public LocaleEntity doUpdate(LocaleEntity localeEntity) {
        return localeEntityRepository.update(localeEntity);
    }

    @Override
    @Transactional
    public void doDelete(LocaleEntity botMessageEntity) {
        localeEntityRepository.delete(botMessageEntity);
    }

}
