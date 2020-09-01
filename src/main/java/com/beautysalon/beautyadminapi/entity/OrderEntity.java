package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "beauty_saloon")
public class OrderEntity {
    private Integer id;
    private Integer clientId;
    private Integer timeSlotId;
    private Integer employeeId;
    private Integer serviceId;
    private String comment;
    private Byte executed;

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
    @Column(name = "client_id")
    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "time_slot_id")
    public Integer getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(Integer timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    @Basic
    @Column(name = "employee_id")
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "service_id")
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "executed")
    public Byte getExecuted() {
        return executed;
    }

    public void setExecuted(Byte executed) {
        this.executed = executed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(timeSlotId, that.timeSlotId) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(serviceId, that.serviceId) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(executed, that.executed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, timeSlotId, employeeId, serviceId, comment, executed);
    }
}
