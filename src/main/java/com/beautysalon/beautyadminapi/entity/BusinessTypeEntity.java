package com.beautysalon.beautyadminapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "business_type", schema = "beauty_saloon")
public class BusinessTypeEntity extends PersistenceEntity{

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
