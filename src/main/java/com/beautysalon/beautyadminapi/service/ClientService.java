package com.beautysalon.beautyadminapi.service;

import com.beautysalon.beautyadminapi.entity.ClientEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ClientService {

    ClientEntity doRead(Integer id);

    List<ClientEntity> doReadAll();

    ClientEntity doCreate(ClientEntity clientEntity);

    ClientEntity doUpdate(ClientEntity clientEntity);

    void doDelete(ClientEntity clientEntity);

    Page<ClientEntity> doReadAll(Pageable pageable);
}
