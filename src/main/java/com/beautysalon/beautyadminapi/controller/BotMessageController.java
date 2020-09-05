package com.beautysalon.beautyadminapi.controller;

import com.beautysalon.beautyadminapi.entity.BotMessageEntity;
import com.beautysalon.beautyadminapi.service.BotMessageService;
import com.beautysalon.beautyadminapi.validator.BotMessageValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bot-messages")
public class BotMessageController {

    private final static Logger LOGGER = LoggerFactory.getLogger(BotMessageController.class);

    @Autowired
    private BotMessageService botMessageService;

    @Autowired
    private BotMessageValidator botMessageValidator;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BotMessageEntity read(@PathVariable Integer id) {
        LOGGER.debug("Attributes: {}", id);
        botMessageValidator.validateId(id);
        BotMessageEntity result = botMessageService.doRead(id);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<BotMessageEntity> readAll() {
        LOGGER.debug("Attributes: none");
        List<BotMessageEntity> result = botMessageService.doReadAll();
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public BotMessageEntity update(@RequestBody BotMessageEntity botMessageEntity) {
        LOGGER.debug("Attributes: {}", botMessageEntity);
        botMessageValidator.validateId(botMessageEntity.getId());
        BotMessageEntity result = botMessageService.doUpdate(botMessageEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public BotMessageEntity create(@RequestBody BotMessageEntity botMessageEntity) {
        LOGGER.debug("Attributes: {}", botMessageEntity);
        BotMessageEntity result = botMessageService.doCreate(botMessageEntity);
        LOGGER.debug("Result: {}", result);
        return result;
    }

}
