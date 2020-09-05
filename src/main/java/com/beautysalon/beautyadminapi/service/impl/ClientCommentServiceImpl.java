package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.ClientCommentEntity;
import com.beautysalon.beautyadminapi.repository.ClientCommentEntityRepository;
import com.beautysalon.beautyadminapi.service.ClientCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientCommentServiceImpl implements ClientCommentService {

    @Autowired
    private ClientCommentEntityRepository clientCommentEntityRepository;

    @Override
    public ClientCommentEntity doRead(Integer id) {
        return clientCommentEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClientCommentEntity> doReadAll() {
        return (List<ClientCommentEntity>) clientCommentEntityRepository.findAll();
    }

    @Override
    @Transactional
    public ClientCommentEntity doCreate(ClientCommentEntity clientCommentEntity) {
        return clientCommentEntityRepository.create(clientCommentEntity);
    }

    @Override
    @Transactional
    public ClientCommentEntity doUpdate(ClientCommentEntity clientCommentEntity) {
        return clientCommentEntityRepository.update(clientCommentEntity);
    }

    @Override
    @Transactional
    public void doDelete(ClientCommentEntity botMessageEntity) {
        clientCommentEntityRepository.delete(botMessageEntity);
    }

}
