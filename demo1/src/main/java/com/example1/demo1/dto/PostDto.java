package com.example1.demo1.dto;

import com.example1.demo1.model.Post;
import com.example1.demo1.model.Category;

public class PostDto {
    private String title;
    private String content;
    private Category category;

    public PostDto() {
        super();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the username to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    public Post getPostFromDto() {
        Post post = new Post();
        post.setTitle(this.title);
        post.setContent(this.content);
        post.setCategoryId(this.category);
        return post;
    }
}
