package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.LocaleEntity;

import java.util.List;

public interface LocaleService {

    LocaleEntity doRead(Integer id);

    List<LocaleEntity> doReadAll();

    LocaleEntity doCreate(LocaleEntity localeEntity);

    LocaleEntity doUpdate(LocaleEntity localeEntity);

    void doDelete(LocaleEntity localeEntity);
}
