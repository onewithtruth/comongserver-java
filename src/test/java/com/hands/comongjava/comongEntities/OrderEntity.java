package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "comongDB", catalog = "")
public class OrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "total_amount")
    private Integer totalAmount;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "shipping_status")
    private String shippingStatus;
    @Basic
    @Column(name = "shipping_company")
    private String shippingCompany;
    @Basic
    @Column(name = "shipping_code")
    private String shippingCode;
    @Basic
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "address_line1")
    private String addressLine1;
    @Basic
    @Column(name = "address_line2")
    private String addressLine2;
    @Basic
    @Column(name = "postal_code")
    private String postalCode;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "contact")
    private String contact;
    @Basic
    @Column(name = "buyer_name")
    private String buyerName;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity userByUserId;
    @OneToMany(mappedBy = "orderByOrderId")
    private Collection<OrderDetailHasOrderEntity> orderDetailHasOrdersById;
    @OneToMany(mappedBy = "orderByOrderId")
    private Collection<UserPaymentEntity> userPaymentsById;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
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

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getShippingCompany() {
        return shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
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

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderEntity that = (OrderEntity) o;
        return userId == that.userId && Objects.equals(id, that.id) && Objects.equals(totalAmount, that.totalAmount) && Objects.equals(status, that.status) && Objects.equals(shippingStatus, that.shippingStatus) && Objects.equals(shippingCompany, that.shippingCompany) && Objects.equals(shippingCode, that.shippingCode) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(addressLine1, that.addressLine1) && Objects.equals(addressLine2, that.addressLine2) && Objects.equals(postalCode, that.postalCode) && Objects.equals(email, that.email) && Objects.equals(contact, that.contact) && Objects.equals(buyerName, that.buyerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, totalAmount, status, userId, shippingStatus, shippingCompany, shippingCode, createdAt, updatedAt, addressLine1, addressLine2, postalCode, email, contact, buyerName);
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Collection<OrderDetailHasOrderEntity> getOrderDetailHasOrdersById() {
        return orderDetailHasOrdersById;
    }

    public void setOrderDetailHasOrdersById(Collection<OrderDetailHasOrderEntity> orderDetailHasOrdersById) {
        this.orderDetailHasOrdersById = orderDetailHasOrdersById;
    }

    public Collection<UserPaymentEntity> getUserPaymentsById() {
        return userPaymentsById;
    }

    public void setUserPaymentsById(Collection<UserPaymentEntity> userPaymentsById) {
        this.userPaymentsById = userPaymentsById;
    }
}
