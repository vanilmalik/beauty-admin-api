package com.beautysalon.beautyadminapi.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "client_comment", schema = "beauty_saloon")
public class ClientCommentEntity extends PersistenceEntity {

    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "comment_text")
    private String commentText;

    @Column(name = "positive")
    private Boolean positive;

    @Column(name = "stars")
    private Integer stars;

    @Column(name = "sent_to_director")
    private Boolean sentToDirector;

    @Column(name = "reviewed")
    private Boolean reviewed;

    @Column(name = "saloon_comment")
    private String saloonComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "client_id"))
    @Fetch(FetchMode.JOIN)
    private ClientEntity clientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "order_id"))
    @Fetch(FetchMode.JOIN)
    private OrderEntity orderEntity;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Boolean getPositive() {
        return positive;
    }

    public void setPositive(Boolean positive) {
        this.positive = positive;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Boolean getSentToDirector() {
        return sentToDirector;
    }

    public void setSentToDirector(Boolean sentToDirector) {
        this.sentToDirector = sentToDirector;
    }

    public Boolean getReviewed() {
        return reviewed;
    }

    public void setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
    }

    public String getSaloonComment() {
        return saloonComment;
    }

    public void setSaloonComment(String saloonComment) {
        this.saloonComment = saloonComment;
    }

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

}
