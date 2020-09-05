package com.beautysalon.beautyadminapi.controller;

import com.beautysalon.beautyadminapi.dto.PageableDto;
import com.beautysalon.beautyadminapi.entity.ClientEntity;
import com.beautysalon.beautyadminapi.facade.ClientFacade;
import com.beautysalon.beautyadminapi.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final static Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
    
    @Autowired
    private ClientFacade clientFacade;
    
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/pageable", method = RequestMethod.GET)
    public Page<ClientEntity> findAllPageable(PageableDto pageableDto) {
        LOGGER.debug("Attributes: {}", pageableDto);
        Page<ClientEntity> result = clientFacade.doFindAllPageable(pageableDto);
        LOGGER.debug("Result:{}", result);
        return result;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ClientEntity read(@PathVariable Integer id) {
        LOGGER.debug("Attributes: {}", id);
        ClientEntity result = clientService.doRead(id);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<ClientEntity> readAll() {
        LOGGER.debug("Attributes: none");
        List<ClientEntity> result = clientService.doReadAll();
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ClientEntity update(@RequestBody ClientEntity ClientEntity) {
        LOGGER.debug("Attributes: {}", ClientEntity);
        ClientEntity result = clientService.doUpdate(ClientEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ClientEntity create(@RequestBody ClientEntity ClientEntity) {
        LOGGER.debug("Attributes: {}", ClientEntity);
        ClientEntity result = clientService.doCreate(ClientEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }
}
