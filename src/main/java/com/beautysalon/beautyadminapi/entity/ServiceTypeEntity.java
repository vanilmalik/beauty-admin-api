package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type", schema = "beauty_saloon")
public class ServiceTypeEntity extends PersistenceEntity {

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "price")
    private Integer price;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceTypeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<EmployeeEntity> employeeEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceTypeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<OrderEntity> orderEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceTypeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<RemainderEntity> remainderEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceTypeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<SaloonServiceTypeEntity> saloonServiceTypeEntities;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<EmployeeEntity> getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }

    public List<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(List<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
    }

    public List<RemainderEntity> getRemainderEntities() {
        return remainderEntities;
    }

    public void setRemainderEntities(List<RemainderEntity> remainderEntities) {
        this.remainderEntities = remainderEntities;
    }

    public List<SaloonServiceTypeEntity> getSaloonServiceTypeEntities() {
        return saloonServiceTypeEntities;
    }

    public void setSaloonServiceTypeEntities(List<SaloonServiceTypeEntity> saloonServiceTypeEntities) {
        this.saloonServiceTypeEntities = saloonServiceTypeEntities;
    }
}
