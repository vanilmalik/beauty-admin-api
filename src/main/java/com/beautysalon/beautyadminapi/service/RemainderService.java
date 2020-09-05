package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.RemainderEntity;

import java.util.List;

public interface RemainderService {

    RemainderEntity doRead(Integer id);

    List<RemainderEntity> doReadAll();

    RemainderEntity doCreate(RemainderEntity remainderEntity);

    RemainderEntity doUpdate(RemainderEntity remainderEntity);

    void doDelete(RemainderEntity remainderEntity);
}
