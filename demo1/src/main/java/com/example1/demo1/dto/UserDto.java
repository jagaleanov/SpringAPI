package com.example1.demo1.dto;

import com.example1.demo1.model.User;

public class UserDto {
    public UserDto (){
        super();
    }

    private String name;
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
    public User getUserFromDto(){
        User user = new User();
        user.setName(this.name);
        return user;
    }
}
