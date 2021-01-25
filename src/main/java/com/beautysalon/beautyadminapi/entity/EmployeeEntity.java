package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee", schema = "beauty_saloon")
public class EmployeeEntity extends PersistenceEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "saloon_id")
    private Integer saloonId;

    @Column(name = "service_type_id")
    private Integer serviceTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "saloon_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "saloon_id"))
    @Fetch(FetchMode.JOIN)
    private SaloonEntity saloonEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_type_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "service_type_id"))
    @Fetch(FetchMode.JOIN)
    private ServiceTypeEntity serviceTypeEntity;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<CalendarEntity> calendarEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<OrderEntity> orderEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employeeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<TimeSlotEntity> timeSlotEntities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

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

    public List<CalendarEntity> getCalendarEntities() {
        return calendarEntities;
    }

    public void setCalendarEntities(List<CalendarEntity> calendarEntities) {
        this.calendarEntities = calendarEntities;
    }

    public List<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(List<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
    }

    public List<TimeSlotEntity> getTimeSlotEntities() {
        return timeSlotEntities;
    }

    public void setTimeSlotEntities(List<TimeSlotEntity> timeSlotEntities) {
        this.timeSlotEntities = timeSlotEntities;
    }
}
