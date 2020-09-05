package com.beautysalon.beautyadminapi.controller;

import com.beautysalon.beautyadminapi.entity.DiscountEntity;
import com.beautysalon.beautyadminapi.service.DiscountService;
import com.beautysalon.beautyadminapi.validator.BotMessageValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discounts")
public class DiscountController {

    private final static Logger LOGGER = LoggerFactory.getLogger(DiscountController.class);

    @Autowired
    private DiscountService discountService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DiscountEntity read(@PathVariable Integer id) {
        LOGGER.debug("Attributes: {}", id);
        DiscountEntity result = discountService.doRead(id);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<DiscountEntity> readAll() {
        LOGGER.debug("Attributes: none");
        List<DiscountEntity> result = discountService.doReadAll();
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public DiscountEntity update(@RequestBody DiscountEntity DiscountEntity) {
        LOGGER.debug("Attributes: {}", DiscountEntity);
        DiscountEntity result = discountService.doUpdate(DiscountEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public DiscountEntity create(@RequestBody DiscountEntity DiscountEntity) {
        LOGGER.debug("Attributes: {}", DiscountEntity);
        DiscountEntity result = discountService.doCreate(DiscountEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }
}
