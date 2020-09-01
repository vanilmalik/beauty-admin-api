package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bot_message", schema = "beauty_saloon")
public class BotMessageEntity {
    private Integer id;
    private String messageKey;
    private String message;
    private Integer messageTypeId;
    private Integer localeId;
    private String description;

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
    @Column(name = "message_key")
    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "message_type_id")
    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    @Basic
    @Column(name = "locale_id")
    public Integer getLocaleId() {
        return localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BotMessageEntity that = (BotMessageEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(messageKey, that.messageKey) &&
                Objects.equals(message, that.message) &&
                Objects.equals(messageTypeId, that.messageTypeId) &&
                Objects.equals(localeId, that.localeId) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, messageKey, message, messageTypeId, localeId, description);
    }
}
