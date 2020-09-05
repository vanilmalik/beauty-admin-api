package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.ClientEntity;
import com.beautysalon.beautyadminapi.repository.ClientEntityRepository;
import com.beautysalon.beautyadminapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientEntityRepository clientEntityRepository;

    @Override
    @Cacheable(cacheNames = "clients")
    public ClientEntity doRead(Integer id) {
        return clientEntityRepository.findById(id).orElse(null);
    }

    @Override
    @Cacheable(cacheNames = "clients")
    public List<ClientEntity> doReadAll() {
        return (List<ClientEntity>) clientEntityRepository.findAll();
    }

    @Override
    @Transactional
    public ClientEntity doCreate(ClientEntity clientEntity) {
        return clientEntityRepository.create(clientEntity);
    }

    @Override
    @Transactional
    public ClientEntity doUpdate(ClientEntity clientEntity) {
        return clientEntityRepository.update(clientEntity);
    }

    @Override
    @Transactional
    public void doDelete(ClientEntity clientEntity) {
        clientEntityRepository.delete(clientEntity);
    }

    @Override
    @Cacheable(cacheNames = "clients")
    public Page<ClientEntity> doReadAll(Pageable pageable) {
        return clientEntityRepository.findAll(pageable);
    }
}
