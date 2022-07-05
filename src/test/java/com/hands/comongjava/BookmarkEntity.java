package com.hands.comongjava;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bookmark", schema = "comongDB", catalog = "")
public class BookmarkEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "item_id")
    private int itemId;
    @Basic
    @Column(name = "ismarked")
    private Byte ismarked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Byte getIsmarked() {
        return ismarked;
    }

    public void setIsmarked(Byte ismarked) {
        this.ismarked = ismarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookmarkEntity that = (BookmarkEntity) o;
        return id == that.id && userId == that.userId && itemId == that.itemId && Objects.equals(ismarked, that.ismarked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, itemId, ismarked);
    }
}
