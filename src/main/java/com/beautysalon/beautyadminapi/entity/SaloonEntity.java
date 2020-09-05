package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "saloon", schema = "beauty_saloon")
public class SaloonEntity extends PersistenceEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "saloonEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<EmployeeEntity> employeeEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "saloonEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<SaloonServiceTypeEntity> saloonServiceTypeEntities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<EmployeeEntity> getEmployeeEntities() {
        return employeeEntities;
    }

    public void setEmployeeEntities(List<EmployeeEntity> employeeEntities) {
        this.employeeEntities = employeeEntities;
    }

    public List<SaloonServiceTypeEntity> getSaloonServiceTypeEntities() {
        return saloonServiceTypeEntities;
    }

    public void setSaloonServiceTypeEntities(List<SaloonServiceTypeEntity> saloonServiceTypeEntities) {
        this.saloonServiceTypeEntities = saloonServiceTypeEntities;
    }
}
