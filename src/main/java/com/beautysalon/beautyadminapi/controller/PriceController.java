package com.beautysalon.beautyadminapi.controller;

import com.beautysalon.beautyadminapi.entity.PriceEntity;
import com.beautysalon.beautyadminapi.service.PriceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    private final static Logger LOGGER = LoggerFactory.getLogger(PriceController.class);

    @Autowired
    private PriceService priceService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PriceEntity read(@PathVariable Integer id) {
        LOGGER.debug("Attributes: {}", id);
        PriceEntity result = priceService.doRead(id);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<PriceEntity> readAll() {
        LOGGER.debug("Attributes: none");
        List<PriceEntity> result = priceService.doReadAll();
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public PriceEntity update(@RequestBody PriceEntity PriceEntity) {
        LOGGER.debug("Attributes: {}", PriceEntity);
        PriceEntity result = priceService.doUpdate(PriceEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public PriceEntity create(@RequestBody PriceEntity PriceEntity) {
        LOGGER.debug("Attributes: {}", PriceEntity);
        PriceEntity result = priceService.doCreate(PriceEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }
}
