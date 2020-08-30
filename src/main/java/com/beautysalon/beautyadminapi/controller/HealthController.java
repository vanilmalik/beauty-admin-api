package com.beautysalon.beautyadminapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HealthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthController.class);

    @RequestMapping(method = RequestMethod.GET, value = "PING")
    public String pingPong() {
        LOGGER.info("Ping method was called.");
        return "PONG";
    }

}

