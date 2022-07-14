package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "comongDB", catalog = "")
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "storename")
    private String storename;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "mobile")
    private String mobile;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "gender")
    private Short gender;
    @Basic
    @Column(name = "birthday")
    private Date birthday;
    @Basic
    @Column(name = "role")
    private short role;
    @Basic
    @Column(name = "myimg_src")
    private String myimgSrc;
    @Basic
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<BookmarkEntity> bookmarksById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<CategoryHasUserEntity> categoryHasUsersById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<ChatHasUserEntity> chatHasUsersById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<ItemEntity> itemsById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<ItemReviewEntity> itemReviewsById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<KeywordEntity> keywordsById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<NotificationEntity> notificationsById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<OrderEntity> ordersById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<OrderDetailEntity> orderDetailsById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<RefreshtokenEntity> refreshtokensById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<ReplaceRefundEntity> replaceRefundsById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<UserAddressEntity> userAddressesById;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<UserPaymentEntity> userPaymentsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public short getRole() {
        return role;
    }

    public void setRole(short role) {
        this.role = role;
    }

    public String getMyimgSrc() {
        return myimgSrc;
    }

    public void setMyimgSrc(String myimgSrc) {
        this.myimgSrc = myimgSrc;
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
        UserEntity that = (UserEntity) o;
        return id == that.id && role == that.role && Objects.equals(name, that.name) && Objects.equals(storename, that.storename) && Objects.equals(email, that.email) && Objects.equals(mobile, that.mobile) && Objects.equals(password, that.password) && Objects.equals(gender, that.gender) && Objects.equals(birthday, that.birthday) && Objects.equals(myimgSrc, that.myimgSrc) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, storename, email, mobile, password, gender, birthday, role, myimgSrc, createdAt, updatedAt);
    }

    public Collection<BookmarkEntity> getBookmarksById() {
        return bookmarksById;
    }

    public void setBookmarksById(Collection<BookmarkEntity> bookmarksById) {
        this.bookmarksById = bookmarksById;
    }

    public Collection<CategoryHasUserEntity> getCategoryHasUsersById() {
        return categoryHasUsersById;
    }

    public void setCategoryHasUsersById(Collection<CategoryHasUserEntity> categoryHasUsersById) {
        this.categoryHasUsersById = categoryHasUsersById;
    }

    public Collection<ChatHasUserEntity> getChatHasUsersById() {
        return chatHasUsersById;
    }

    public void setChatHasUsersById(Collection<ChatHasUserEntity> chatHasUsersById) {
        this.chatHasUsersById = chatHasUsersById;
    }

    public Collection<ItemEntity> getItemsById() {
        return itemsById;
    }

    public void setItemsById(Collection<ItemEntity> itemsById) {
        this.itemsById = itemsById;
    }

    public Collection<ItemReviewEntity> getItemReviewsById() {
        return itemReviewsById;
    }

    public void setItemReviewsById(Collection<ItemReviewEntity> itemReviewsById) {
        this.itemReviewsById = itemReviewsById;
    }

    public Collection<KeywordEntity> getKeywordsById() {
        return keywordsById;
    }

    public void setKeywordsById(Collection<KeywordEntity> keywordsById) {
        this.keywordsById = keywordsById;
    }

    public Collection<NotificationEntity> getNotificationsById() {
        return notificationsById;
    }

    public void setNotificationsById(Collection<NotificationEntity> notificationsById) {
        this.notificationsById = notificationsById;
    }

    public Collection<OrderEntity> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<OrderEntity> ordersById) {
        this.ordersById = ordersById;
    }

    public Collection<OrderDetailEntity> getOrderDetailsById() {
        return orderDetailsById;
    }

    public void setOrderDetailsById(Collection<OrderDetailEntity> orderDetailsById) {
        this.orderDetailsById = orderDetailsById;
    }

    public Collection<RefreshtokenEntity> getRefreshtokensById() {
        return refreshtokensById;
    }

    public void setRefreshtokensById(Collection<RefreshtokenEntity> refreshtokensById) {
        this.refreshtokensById = refreshtokensById;
    }

    public Collection<ReplaceRefundEntity> getReplaceRefundsById() {
        return replaceRefundsById;
    }

    public void setReplaceRefundsById(Collection<ReplaceRefundEntity> replaceRefundsById) {
        this.replaceRefundsById = replaceRefundsById;
    }

    public Collection<UserAddressEntity> getUserAddressesById() {
        return userAddressesById;
    }

    public void setUserAddressesById(Collection<UserAddressEntity> userAddressesById) {
        this.userAddressesById = userAddressesById;
    }

    public Collection<UserPaymentEntity> getUserPaymentsById() {
        return userPaymentsById;
    }

    public void setUserPaymentsById(Collection<UserPaymentEntity> userPaymentsById) {
        this.userPaymentsById = userPaymentsById;
    }
}
