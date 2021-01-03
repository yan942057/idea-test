package com.baizhi.entity;

/**
 * @author Category
 * @time 2021/1/3-15:18
 */
public class Category {

    private String id;
    private String name;

    public Category() {
        super();
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
