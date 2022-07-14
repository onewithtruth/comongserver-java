package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "item", schema = "comongDB", catalog = "")
public class ItemEntity {
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
    @Column(name = "price")
    private Integer price;
    @Basic
    @Column(name = "createdAt")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updatedAt")
    private Timestamp updatedAt;
    @Basic
    @Column(name = "image_src")
    private String imageSrc;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @OneToMany(mappedBy = "itemByItemId")
    private Collection<BookmarkEntity> bookmarksById;
    @OneToMany(mappedBy = "itemByItemId")
    private Collection<ChatHasItemEntity> chatHasItemsById;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private UserEntity userByUserId;
    @OneToMany(mappedBy = "itemByItemId")
    private Collection<ItemHasCategoryEntity> itemHasCategoriesById;
    @OneToMany(mappedBy = "itemByItemId")
    private Collection<ItemInventoryEntity> itemInventoriesById;
    @OneToMany(mappedBy = "itemByItemId")
    private Collection<OrderDetailEntity> orderDetailsById;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
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
        ItemEntity that = (ItemEntity) o;
        return id == that.id && userId == that.userId && Objects.equals(title, that.title) && Objects.equals(contents, that.contents) && Objects.equals(price, that.price) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(imageSrc, that.imageSrc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, contents, price, createdAt, updatedAt, imageSrc, userId);
    }

    public Collection<BookmarkEntity> getBookmarksById() {
        return bookmarksById;
    }

    public void setBookmarksById(Collection<BookmarkEntity> bookmarksById) {
        this.bookmarksById = bookmarksById;
    }

    public Collection<ChatHasItemEntity> getChatHasItemsById() {
        return chatHasItemsById;
    }

    public void setChatHasItemsById(Collection<ChatHasItemEntity> chatHasItemsById) {
        this.chatHasItemsById = chatHasItemsById;
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Collection<ItemHasCategoryEntity> getItemHasCategoriesById() {
        return itemHasCategoriesById;
    }

    public void setItemHasCategoriesById(Collection<ItemHasCategoryEntity> itemHasCategoriesById) {
        this.itemHasCategoriesById = itemHasCategoriesById;
    }

    public Collection<ItemInventoryEntity> getItemInventoriesById() {
        return itemInventoriesById;
    }

    public void setItemInventoriesById(Collection<ItemInventoryEntity> itemInventoriesById) {
        this.itemInventoriesById = itemInventoriesById;
    }

    public Collection<OrderDetailEntity> getOrderDetailsById() {
        return orderDetailsById;
    }

    public void setOrderDetailsById(Collection<OrderDetailEntity> orderDetailsById) {
        this.orderDetailsById = orderDetailsById;
    }
}
