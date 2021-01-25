package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.RoleEntity;

import java.util.List;

public interface RoleService {

    RoleEntity doRead(Integer id);

    List<RoleEntity> doReadAll();

    RoleEntity doCreate(RoleEntity roleEntity);

    RoleEntity doUpdate(RoleEntity roleEntity);

    void doDelete(RoleEntity roleEntity);
}
