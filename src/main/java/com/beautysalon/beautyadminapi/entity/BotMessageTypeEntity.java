package com.beautysalon.beautyadminapi.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bot_message_type", schema = "beauty_saloon")
public class BotMessageTypeEntity extends PersistenceEntity {

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "botMessageTypeEntity")
    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    private List<BotMessageEntity> botMessages;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
