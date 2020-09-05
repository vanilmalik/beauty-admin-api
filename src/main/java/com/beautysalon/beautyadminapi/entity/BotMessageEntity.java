package com.beautysalon.beautyadminapi.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bot_message", schema = "beauty_saloon")
public class BotMessageEntity extends PersistenceEntity {

    @Column(name = "message_key")
    private String messageKey;

    @Column(name = "message")
    private String message;

    @Column(name = "message_type_id")
    private Integer messageTypeId;

    @Column(name = "locale_id")
    private Integer localeId;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "message_type_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "message_type_id"))
    @Fetch(FetchMode.JOIN)
    private BotMessageTypeEntity botMessageTypeEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locale_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "locale_id"))
    @Fetch(FetchMode.JOIN)
    private LocaleEntity localeEntity;

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public Integer getLocaleId() {
        return localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BotMessageTypeEntity getBotMessageTypeEntity() {
        return botMessageTypeEntity;
    }

    /**
     * Sets botMessageTypeEntity.
     *
     * @param botMessageTypeEntity the botMessageTypeEntity
     */
    public void setBotMessageTypeEntity(BotMessageTypeEntity botMessageTypeEntity) {
        if (Objects.nonNull(botMessageTypeEntity)) {
            this.messageTypeId = botMessageTypeEntity.getId();
        }

        this.botMessageTypeEntity = botMessageTypeEntity;
    }

    public LocaleEntity getLocaleEntity() {
        return localeEntity;
    }

    /**
     * Sets localeEntity.
     *
     * @param localeEntity the localeEntity
     */
    public void setLocaleEntity(LocaleEntity localeEntity) {
        if (Objects.nonNull(localeEntity)) {
            this.localeId = localeEntity.getId();
        }

        this.localeEntity = localeEntity;
    }
}
