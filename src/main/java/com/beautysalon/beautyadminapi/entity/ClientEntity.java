package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "client", schema = "beauty_saloon")
public class ClientEntity extends PersistenceEntity {

    @Column(name = "telegram_user_id")
    private Integer telegramUserId;

    @Column(name = "telegram_chat_id")
    private Integer telegramChatId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "telegram_username")
    private String telegramUsername;

    @Column(name = "telegram_name")
    private String telegramName;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "comment")
    private String comment;

    @Column(name = "default_saloon")
    private Integer defaultSaloon;

    @Column(name = "last_visit")
    private LocalDateTime lastVisit;

    @Column(name = "confirmed")
    private Boolean confirmed;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "mailing_on")
    private Boolean mailingOn;

    @Column(name = "blocked")
    private Boolean blocked;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<ClientCommentEntity> clientCommentEntities;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "clientEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<OrderEntity> orderEntities;

    public Integer getTelegramUserId() {
        return telegramUserId;
    }

    public void setTelegramUserId(Integer telegramUserId) {
        this.telegramUserId = telegramUserId;
    }

    public Integer getTelegramChatId() {
        return telegramChatId;
    }

    public void setTelegramChatId(Integer telegramChatId) {
        this.telegramChatId = telegramChatId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTelegramUsername() {
        return telegramUsername;
    }

    public void setTelegramUsername(String telegramUsername) {
        this.telegramUsername = telegramUsername;
    }

    public String getTelegramName() {
        return telegramName;
    }

    public void setTelegramName(String telegramName) {
        this.telegramName = telegramName;
    }

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getDefaultSaloon() {
        return defaultSaloon;
    }

    public void setDefaultSaloon(Integer defaultSaloon) {
        this.defaultSaloon = defaultSaloon;
    }

    public LocalDateTime getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(LocalDateTime lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getMailingOn() {
        return mailingOn;
    }

    public void setMailingOn(Boolean mailingOn) {
        this.mailingOn = mailingOn;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public List<ClientCommentEntity> getClientCommentEntities() {
        return clientCommentEntities;
    }

    public void setClientCommentEntities(List<ClientCommentEntity> clientCommentEntities) {
        this.clientCommentEntities = clientCommentEntities;
    }

    public List<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(List<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
    }
}
