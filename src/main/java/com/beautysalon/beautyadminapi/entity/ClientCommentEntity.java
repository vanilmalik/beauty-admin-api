package com.beautysalon.beautyadminapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client_comment", schema = "beauty_saloon")
public class ClientCommentEntity {
    private Integer id;
    private Integer clientId;
    private Integer orderId;
    private String commentText;
    private Byte positive;
    private Integer stars;
    private Byte sentToDirector;
    private Byte reviewed;
    private String saloonComment;

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
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "comment_text")
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Basic
    @Column(name = "positive")
    public Byte getPositive() {
        return positive;
    }

    public void setPositive(Byte positive) {
        this.positive = positive;
    }

    @Basic
    @Column(name = "stars")
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Basic
    @Column(name = "sent_to_director")
    public Byte getSentToDirector() {
        return sentToDirector;
    }

    public void setSentToDirector(Byte sentToDirector) {
        this.sentToDirector = sentToDirector;
    }

    @Basic
    @Column(name = "reviewed")
    public Byte getReviewed() {
        return reviewed;
    }

    public void setReviewed(Byte reviewed) {
        this.reviewed = reviewed;
    }

    @Basic
    @Column(name = "saloon_comment")
    public String getSaloonComment() {
        return saloonComment;
    }

    public void setSaloonComment(String saloonComment) {
        this.saloonComment = saloonComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientCommentEntity that = (ClientCommentEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(clientId, that.clientId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(commentText, that.commentText) &&
                Objects.equals(positive, that.positive) &&
                Objects.equals(stars, that.stars) &&
                Objects.equals(sentToDirector, that.sentToDirector) &&
                Objects.equals(reviewed, that.reviewed) &&
                Objects.equals(saloonComment, that.saloonComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, orderId, commentText, positive, stars, sentToDirector, reviewed, saloonComment);
    }
}
