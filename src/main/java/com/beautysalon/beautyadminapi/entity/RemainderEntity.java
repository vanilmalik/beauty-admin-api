package com.beautysalon.beautyadminapi.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "remainder", schema = "beauty_saloon")
public class RemainderEntity extends PersistenceEntity {

    @Column(name = "service_type_id")
    private Integer serviceTypeId;

    @Column(name = "remainder_text")
    private String remainderText;

    @Column(name = "delay_days")
    private Integer delayDays;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_type_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "service_type_id"))
    @Fetch(FetchMode.JOIN)
    private ServiceTypeEntity serviceTypeEntity;

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getRemainderText() {
        return remainderText;
    }

    public void setRemainderText(String remainderText) {
        this.remainderText = remainderText;
    }

    public Integer getDelayDays() {
        return delayDays;
    }

    public void setDelayDays(Integer delayDays) {
        this.delayDays = delayDays;
    }

    public ServiceTypeEntity getServiceTypeEntity() {
        return serviceTypeEntity;
    }

    public void setServiceTypeEntity(ServiceTypeEntity serviceTypeEntity) {
        this.serviceTypeEntity = serviceTypeEntity;
    }
}
