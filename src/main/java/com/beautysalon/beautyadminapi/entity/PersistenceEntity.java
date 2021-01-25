package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
public abstract class PersistenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public PersistenceEntity() {
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            PersistenceEntity that = (PersistenceEntity) o;
            return this.getId().equals(that.getId());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.getId());
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
