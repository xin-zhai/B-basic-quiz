package com.thoughtworks.webapp.dao.dto;

import com.thoughtworks.webapp.dao.User;

public class UserResponse {

    private long id;
    private String name;
    private long age;
    private String avatar;
    private String description;

    public UserResponse() {
    }

    public UserResponse(long id, String name, long age, String avatar, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.description = description;
    }

    public static UserResponse toUserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setAge(user.getAge());
        userResponse.setName(user.getName());
        userResponse.setAvatar(user.getAvatar());
        userResponse.setDescription(user.getDescription());

        return userResponse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
