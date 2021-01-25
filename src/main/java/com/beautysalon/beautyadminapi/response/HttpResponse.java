package com.beautysalon.beautyadminapi.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class HttpResponse {

    @JsonProperty
    private String message;

    @JsonProperty
    private Integer status = HttpStatus.OK.value();

    @JsonProperty
    private List<Object> response = new ArrayList<>();

    public HttpResponse(String message, Integer status) {
        this.message = message;
        this.status = status;
    }

    public HttpResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Object> getResponse() {
        return response;
    }

    public void setResponse(List<Object> response) {
        this.response = response;
    }

}
