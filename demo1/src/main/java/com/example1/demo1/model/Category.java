package com.example1.demo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;

    /**
     * @return the title
     */
    public String getName() {
        return name;
    }

    /**
     * @return the title
     */
    public void setName(String name) {
        this.name = name;
    }

}
