package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "order_detail", schema = "comongDB", catalog = "")
public class OrderDetailEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "order_amount")
    private Integer orderAmount;
    @Basic
    @Column(name = "peritem_price")
    private Integer peritemPrice;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "item_id")
    private int itemId;
    @Basic
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "orderDetailByOrderDetailId")
    private Collection<ItemReviewEntity> itemReviewsById;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity userByUserId;
    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    private ItemEntity itemByItemId;
    @OneToMany(mappedBy = "orderDetailByOrderDetailId")
    private Collection<OrderDetailHasOrderEntity> orderDetailHasOrdersById;
    @OneToMany(mappedBy = "orderDetailByOrderDetailId")
    private Collection<ReplaceRefundEntity> replaceRefundsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getPeritemPrice() {
        return peritemPrice;
    }

    public void setPeritemPrice(Integer peritemPrice) {
        this.peritemPrice = peritemPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailEntity that = (OrderDetailEntity) o;
        return id == that.id && userId == that.userId && itemId == that.itemId && Objects.equals(orderAmount, that.orderAmount) && Objects.equals(peritemPrice, that.peritemPrice) && Objects.equals(status, that.status) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderAmount, peritemPrice, status, userId, itemId, createdAt, updatedAt);
    }

    public Collection<ItemReviewEntity> getItemReviewsById() {
        return itemReviewsById;
    }

    public void setItemReviewsById(Collection<ItemReviewEntity> itemReviewsById) {
        this.itemReviewsById = itemReviewsById;
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    public ItemEntity getItemByItemId() {
        return itemByItemId;
    }

    public void setItemByItemId(ItemEntity itemByItemId) {
        this.itemByItemId = itemByItemId;
    }

    public Collection<OrderDetailHasOrderEntity> getOrderDetailHasOrdersById() {
        return orderDetailHasOrdersById;
    }

    public void setOrderDetailHasOrdersById(Collection<OrderDetailHasOrderEntity> orderDetailHasOrdersById) {
        this.orderDetailHasOrdersById = orderDetailHasOrdersById;
    }

    public Collection<ReplaceRefundEntity> getReplaceRefundsById() {
        return replaceRefundsById;
    }

    public void setReplaceRefundsById(Collection<ReplaceRefundEntity> replaceRefundsById) {
        this.replaceRefundsById = replaceRefundsById;
    }
}
