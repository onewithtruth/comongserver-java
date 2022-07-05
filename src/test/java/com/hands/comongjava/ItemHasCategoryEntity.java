package com.hands.comongjava;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "item_has_category", schema = "comongDB", catalog = "")
@IdClass(ItemHasCategoryEntityPK.class)
public class ItemHasCategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "item_id")
    private int itemId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id")
    private int categoryId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemHasCategoryEntity that = (ItemHasCategoryEntity) o;
        return itemId == that.itemId && categoryId == that.categoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, categoryId);
    }
}
