package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role", schema = "beauty_saloon")
public class RoleEntity extends PersistenceEntity {

    @Column(name = "name")
    private String name;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "roleEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<UserEntity> userEntities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserEntity> getUserEntities() {
        return userEntities;
    }

    public void setUserEntities(List<UserEntity> userEntities) {
        this.userEntities = userEntities;
    }
}
