package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "remainder", schema = "beauty_saloon")
public class RemainderEntity {
    private Integer id;
    private Integer serviceTypeId;
    private String remainderText;
    private Integer delayDays;

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
    @Column(name = "service_type_id")
    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    @Basic
    @Column(name = "remainder_text")
    public String getRemainderText() {
        return remainderText;
    }

    public void setRemainderText(String remainderText) {
        this.remainderText = remainderText;
    }

    @Basic
    @Column(name = "delay_days")
    public Integer getDelayDays() {
        return delayDays;
    }

    public void setDelayDays(Integer delayDays) {
        this.delayDays = delayDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RemainderEntity that = (RemainderEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(serviceTypeId, that.serviceTypeId) &&
                Objects.equals(remainderText, that.remainderText) &&
                Objects.equals(delayDays, that.delayDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceTypeId, remainderText, delayDays);
    }
}
