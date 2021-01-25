package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.entity.RoleEntity;
import com.beautysalon.beautyadminapi.repository.RoleEntityRepository;
import com.beautysalon.beautyadminapi.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleEntityRepository roleEntityRepository;

    @Override
    public RoleEntity doRead(Integer id) {
        return roleEntityRepository.findById(id).orElse(null);
    }

    @Override
    public List<RoleEntity> doReadAll() {
        return (List<RoleEntity>) roleEntityRepository.findAll();
    }

    @Override
    @Transactional
    public RoleEntity doCreate(RoleEntity roleEntity) {
        return roleEntityRepository.create(roleEntity);
    }

    @Override
    @Transactional
    public RoleEntity doUpdate(RoleEntity roleEntity) {
        return roleEntityRepository.update(roleEntity);
    }

    @Override
    @Transactional
    public void doDelete(RoleEntity botMessageEntity) {
        roleEntityRepository.delete(botMessageEntity);
    }

}
