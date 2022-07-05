package com.hands.comongjava;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category_has_user", schema = "comongDB", catalog = "")
@IdClass(CategoryHasUserEntityPK.class)
public class CategoryHasUserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id")
    private int categoryId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private int userId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
        CategoryHasUserEntity that = (CategoryHasUserEntity) o;
        return categoryId == that.categoryId && userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, userId);
    }
}
