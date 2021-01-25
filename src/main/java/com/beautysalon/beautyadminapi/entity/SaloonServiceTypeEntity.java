package com.beautysalon.beautyadminapi.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "saloon_service_type", schema = "beauty_saloon")
public class SaloonServiceTypeEntity extends PersistenceEntity {

    @Column(name = "saloon_id")
    private Integer saloonId;

    @Column(name = "service_type_id")
    private Integer serviceTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "saloon_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "saloon_service_type_saloon_id"))
    @Fetch(FetchMode.JOIN)
    private SaloonEntity saloonEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_type_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "saloon_service_type_service_type_id"))
    @Fetch(FetchMode.JOIN)
    private ServiceTypeEntity serviceTypeEntity;

    public Integer getSaloonId() {
        return saloonId;
    }

    public void setSaloonId(Integer saloonId) {
        this.saloonId = saloonId;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public SaloonEntity getSaloonEntity() {
        return saloonEntity;
    }

    public void setSaloonEntity(SaloonEntity saloonEntity) {
        this.saloonEntity = saloonEntity;
    }

    public ServiceTypeEntity getServiceTypeEntity() {
        return serviceTypeEntity;
    }

    public void setServiceTypeEntity(ServiceTypeEntity serviceTypeEntity) {
        this.serviceTypeEntity = serviceTypeEntity;
    }
}
