package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "client", schema = "beauty_saloon")
public class ClientEntity {
    private Integer id;
    private Integer telegramUserId;
    private Integer telegramChatId;
    private String phoneNumber;
    private String telegramUsername;
    private String telegramName;
    private String name;
    private String surname;
    private String comment;
    private Integer defaultSaloon;
    private Timestamp lastVisit;
    private Byte confirmed;
    private Byte active;
    private Byte mailingOn;
    private Byte blocked;

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
    @Column(name = " telegram_user_id")
    public Integer getTelegramUserId() {
        return telegramUserId;
    }

    public void setTelegramUserId(Integer telegramUserId) {
        this.telegramUserId = telegramUserId;
    }

    @Basic
    @Column(name = " telegram_chat_id")
    public Integer getTelegramChatId() {
        return telegramChatId;
    }

    public void setTelegramChatId(Integer telegramChatId) {
        this.telegramChatId = telegramChatId;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "telegram_username")
    public String getTelegramUsername() {
        return telegramUsername;
    }

    public void setTelegramUsername(String telegramUsername) {
        this.telegramUsername = telegramUsername;
    }

    @Basic
    @Column(name = "telegram_name")
    public String getTelegramName() {
        return telegramName;
    }

    public void setTelegramName(String telegramName) {
        this.telegramName = telegramName;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    @Column(name = "default_saloon")
    public Integer getDefaultSaloon() {
        return defaultSaloon;
    }

    public void setDefaultSaloon(Integer defaultSaloon) {
        this.defaultSaloon = defaultSaloon;
    }

    @Basic
    @Column(name = "last_visit")
    public Timestamp getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Timestamp lastVisit) {
        this.lastVisit = lastVisit;
    }

    @Basic
    @Column(name = "confirmed")
    public Byte getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Byte confirmed) {
        this.confirmed = confirmed;
    }

    @Basic
    @Column(name = "active")
    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    @Basic
    @Column(name = "mailing_on")
    public Byte getMailingOn() {
        return mailingOn;
    }

    public void setMailingOn(Byte mailingOn) {
        this.mailingOn = mailingOn;
    }

    @Basic
    @Column(name = "blocked")
    public Byte getBlocked() {
        return blocked;
    }

    public void setBlocked(Byte blocked) {
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientEntity that = (ClientEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(telegramUserId, that.telegramUserId) &&
                Objects.equals(telegramChatId, that.telegramChatId) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(telegramUsername, that.telegramUsername) &&
                Objects.equals(telegramName, that.telegramName) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(defaultSaloon, that.defaultSaloon) &&
                Objects.equals(lastVisit, that.lastVisit) &&
                Objects.equals(confirmed, that.confirmed) &&
                Objects.equals(active, that.active) &&
                Objects.equals(mailingOn, that.mailingOn) &&
                Objects.equals(blocked, that.blocked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, telegramUserId, telegramChatId, phoneNumber, telegramUsername, telegramName, name, surname, comment, defaultSaloon, lastVisit, confirmed, active, mailingOn, blocked);
    }
}
