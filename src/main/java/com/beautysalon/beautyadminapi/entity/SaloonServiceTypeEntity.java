package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "saloon_service_type", schema = "beauty_saloon")
public class SaloonServiceTypeEntity {
    private Integer id;
    private Integer saloonId;
    private Integer serviceTypeId;


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "saloon_id")
    public Integer getSaloonId() {
        return saloonId;
    }

    public void setSaloonId(Integer saloonId) {
        this.saloonId = saloonId;
    }

    @Basic
    @Column(name = "service_type_id")
    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SaloonServiceTypeEntity that = (SaloonServiceTypeEntity) o;
        return Objects.equals(saloonId, that.saloonId) &&
                Objects.equals(serviceTypeId, that.serviceTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saloonId, serviceTypeId);
    }
}
