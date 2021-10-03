package com.example1.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;


@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Lob
    @Column(columnDefinition="TEXT")
    private String content;

    @OneToOne
    private Category category;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    } 

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    } 

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }  
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    } 
    
    /**
     * @param category_id the content to set
     */
    public void setCategoryId(Category category) {
        this.category = category;
    } 
    
}
