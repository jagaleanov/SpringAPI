package com.example1.demo1.dto;

import com.example1.demo1.model.Category;

public class CategoryDto {
    private String name;

    public CategoryDto() {
        super();
    }

    /**
     * @return the categoryname
     */
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Category getCategoryFromDto() {
        Category category = new Category();
        category.setName(this.name);
        return category;
    }
}
