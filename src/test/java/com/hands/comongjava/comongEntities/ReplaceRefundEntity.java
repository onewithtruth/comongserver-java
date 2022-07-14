package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "replace_refund", schema = "comongDB", catalog = "")
public class ReplaceRefundEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "contents")
    private String contents;
    @Basic
    @Column(name = "image_src")
    private String imageSrc;
    @Basic
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "order_detail_id")
    private int orderDetailId;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @ManyToOne
    @JoinColumn(name = "order_detail_id", referencedColumnName = "id", nullable = false)
    private OrderDetailEntity orderDetailByOrderDetailId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity userByUserId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplaceRefundEntity that = (ReplaceRefundEntity) o;
        return id == that.id && orderDetailId == that.orderDetailId && userId == that.userId && Objects.equals(title, that.title) && Objects.equals(contents, that.contents) && Objects.equals(imageSrc, that.imageSrc) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, contents, imageSrc, createdAt, updatedAt, orderDetailId, userId);
    }

    public OrderDetailEntity getOrderDetailByOrderDetailId() {
        return orderDetailByOrderDetailId;
    }

    public void setOrderDetailByOrderDetailId(OrderDetailEntity orderDetailByOrderDetailId) {
        this.orderDetailByOrderDetailId = orderDetailByOrderDetailId;
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }
}
