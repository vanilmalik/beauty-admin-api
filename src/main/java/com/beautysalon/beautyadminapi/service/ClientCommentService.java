package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.ClientCommentEntity;

import java.util.List;

public interface ClientCommentService {

    ClientCommentEntity doRead(Integer id);

    List<ClientCommentEntity> doReadAll();

    ClientCommentEntity doCreate(ClientCommentEntity clientCommentEntity);

    ClientCommentEntity doUpdate(ClientCommentEntity clientCommentEntity);

    void doDelete(ClientCommentEntity clientCommentEntity);
}
