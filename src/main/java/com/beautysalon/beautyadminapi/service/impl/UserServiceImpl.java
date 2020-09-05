package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.UserEntity;
import com.beautysalon.beautyadminapi.entity.UserEntity;
import com.beautysalon.beautyadminapi.repository.UserEntityRepository;
import com.beautysalon.beautyadminapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Override
    public UserEntity doRead(Integer id) {
        return userEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserEntity> doReadAll() {
        return (List<UserEntity>) userEntityRepository.findAll();
    }

    @Override
    @Transactional
    public UserEntity doCreate(UserEntity userEntity) {
        return userEntityRepository.create(userEntity);
    }

    @Override
    @Transactional
    public UserEntity doUpdate(UserEntity userEntity) {
        return userEntityRepository.update(userEntity);
    }

    @Override
    @Transactional
    public void doDelete(UserEntity botMessageEntity) {
        userEntityRepository.delete(botMessageEntity);
    }

}
