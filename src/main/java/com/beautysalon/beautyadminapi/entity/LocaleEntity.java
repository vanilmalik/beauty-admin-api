package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locale", schema = "beauty_saloon")
public class LocaleEntity extends PersistenceEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "localeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<BotMessageEntity> botMessages;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BotMessageEntity> getBotMessages() {
        return botMessages;
    }

    public void setBotMessages(List<BotMessageEntity> botMessages) {
        this.botMessages = botMessages;
    }
}
