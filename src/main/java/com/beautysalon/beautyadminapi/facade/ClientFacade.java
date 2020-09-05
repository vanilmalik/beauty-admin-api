package com.beautysalon.beautyadminapi.facade;

import com.beautysalon.beautyadminapi.converter.PageableConverter;
import com.beautysalon.beautyadminapi.dto.PageableDto;
import com.beautysalon.beautyadminapi.entity.ClientEntity;
import com.beautysalon.beautyadminapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ClientFacade {

    @Autowired
    private PageableConverter pageableConverter;

    @Autowired
    private ClientService clientService;

    public Page<ClientEntity> doFindAllPageable(PageableDto pageableDto) {
        Pageable pageable = pageableConverter.apply(pageableDto);
        return clientService.doReadAll(pageable);
    }
}
