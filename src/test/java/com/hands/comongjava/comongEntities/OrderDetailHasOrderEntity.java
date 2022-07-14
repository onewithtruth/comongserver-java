package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order_detail_has_order", schema = "comongDB", catalog = "")
@IdClass(OrderDetailHasOrderEntityPK.class)
public class OrderDetailHasOrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_detail_id")
    private int orderDetailId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "order_id")
    private String orderId;
    @ManyToOne
    @JoinColumn(name = "order_detail_id", referencedColumnName = "id", nullable = false)
    private OrderDetailEntity orderDetailByOrderDetailId;
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    private OrderEntity orderByOrderId;

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailHasOrderEntity that = (OrderDetailHasOrderEntity) o;
        return orderDetailId == that.orderDetailId && Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderDetailId, orderId);
    }

    public OrderDetailEntity getOrderDetailByOrderDetailId() {
        return orderDetailByOrderDetailId;
    }

    public void setOrderDetailByOrderDetailId(OrderDetailEntity orderDetailByOrderDetailId) {
        this.orderDetailByOrderDetailId = orderDetailByOrderDetailId;
    }

    public OrderEntity getOrderByOrderId() {
        return orderByOrderId;
    }

    public void setOrderByOrderId(OrderEntity orderByOrderId) {
        this.orderByOrderId = orderByOrderId;
    }
}
