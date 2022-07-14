package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "item_review", schema = "comongDB", catalog = "")
public class ItemReviewEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "contents")
    private String contents;
    @Basic
    @Column(name = "image_src")
    private String imageSrc;
    @Basic
    @Column(name = "score")
    private Short score;
    @Basic
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "order_detail_id")
    private int orderDetailId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity userByUserId;
    @ManyToOne
    @JoinColumn(name = "order_detail_id", referencedColumnName = "id", nullable = false)
    private OrderDetailEntity orderDetailByOrderDetailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemReviewEntity that = (ItemReviewEntity) o;
        return id == that.id && userId == that.userId && orderDetailId == that.orderDetailId && Objects.equals(contents, that.contents) && Objects.equals(imageSrc, that.imageSrc) && Objects.equals(score, that.score) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contents, imageSrc, score, createdAt, updatedAt, userId, orderDetailId);
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    public OrderDetailEntity getOrderDetailByOrderDetailId() {
        return orderDetailByOrderDetailId;
    }

    public void setOrderDetailByOrderDetailId(OrderDetailEntity orderDetailByOrderDetailId) {
        this.orderDetailByOrderDetailId = orderDetailByOrderDetailId;
    }
}
