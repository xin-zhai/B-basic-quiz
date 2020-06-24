package com.thoughtworks.webapp.dao.dto;

import com.thoughtworks.webapp.dao.User;

public class UserRequest {
    private String name;
    private long age;
    private String avatar;
    private String description;

    public UserRequest(String name, long age, String avatar, String description) {
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.description = description;
    }

    public User toUser() {
        User user = new User();
        user.setName(this.name);
        user.setAge(this.age);
        user.setDescription(this.description);
        user.setAvatar(this.avatar);

        return user;
    }
}
