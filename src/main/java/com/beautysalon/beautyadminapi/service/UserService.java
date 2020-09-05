package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity doRead(Integer id);

    List<UserEntity> doReadAll();

    UserEntity doCreate(UserEntity userEntity);

    UserEntity doUpdate(UserEntity userEntity);

    void doDelete(UserEntity userEntity);
}
