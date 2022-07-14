package com.hands.comongjava.comongEntities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "category", schema = "comongDB", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "pid")
    private Integer pid;
    @Basic
    @Column(name = "depth")
    private Integer depth;
    @Basic
    @Column(name = "category")
    private String category;
    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<CategoryHasUserEntity> categoryHasUsersById;
    @OneToMany(mappedBy = "categoryByCategoryId")
    private Collection<ItemHasCategoryEntity> itemHasCategoriesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id == that.id && Objects.equals(pid, that.pid) && Objects.equals(depth, that.depth) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, depth, category);
    }

    public Collection<CategoryHasUserEntity> getCategoryHasUsersById() {
        return categoryHasUsersById;
    }

    public void setCategoryHasUsersById(Collection<CategoryHasUserEntity> categoryHasUsersById) {
        this.categoryHasUsersById = categoryHasUsersById;
    }

    public Collection<ItemHasCategoryEntity> getItemHasCategoriesById() {
        return itemHasCategoriesById;
    }

    public void setItemHasCategoriesById(Collection<ItemHasCategoryEntity> itemHasCategoriesById) {
        this.itemHasCategoriesById = itemHasCategoriesById;
    }
}
