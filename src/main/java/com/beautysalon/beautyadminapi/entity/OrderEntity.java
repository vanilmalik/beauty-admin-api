package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order", schema = "beauty_saloon")
public class OrderEntity extends PersistenceEntity {

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "time_slot_id")
    private Integer timeSlotId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "service_id")
    private Integer serviceId;

    @Column(name = "comment")
    private String comment;

    @Column(name = "executed")
    private Boolean executed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "order_client_id"))
    @Fetch(FetchMode.JOIN)
    private ClientEntity clientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_slot_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "order_time_slot_id"))
    @Fetch(FetchMode.JOIN)
    private TimeSlotEntity timeSlotEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "order_employee_id"))
    @Fetch(FetchMode.JOIN)
    private EmployeeEntity employeeEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "order_service_id"))
    @Fetch(FetchMode.JOIN)
    private ServiceTypeEntity serviceTypeEntity;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orderEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<ClientCommentEntity> clientCommentEntities;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(Integer timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getExecuted() {
        return executed;
    }

    public void setExecuted(Boolean executed) {
        this.executed = executed;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public TimeSlotEntity getTimeSlotEntity() {
        return timeSlotEntity;
    }

    public void setTimeSlotEntity(TimeSlotEntity timeSlotEntity) {
        this.timeSlotEntity = timeSlotEntity;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public ServiceTypeEntity getServiceTypeEntity() {
        return serviceTypeEntity;
    }

    public void setServiceTypeEntity(ServiceTypeEntity serviceTypeEntity) {
        this.serviceTypeEntity = serviceTypeEntity;
    }

    public List<ClientCommentEntity> getClientCommentEntities() {
        return clientCommentEntities;
    }

    public void setClientCommentEntities(List<ClientCommentEntity> clientCommentEntities) {
        this.clientCommentEntities = clientCommentEntities;
    }
}
