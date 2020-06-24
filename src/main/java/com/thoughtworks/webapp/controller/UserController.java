package com.thoughtworks.webapp.controller;

import com.thoughtworks.webapp.dao.User;
import com.thoughtworks.webapp.dao.dto.UserRequest;
import com.thoughtworks.webapp.dao.dto.UserResponse;
import com.thoughtworks.webapp.service.UserService;
import com.thoughtworks.webapp.service.exception.UserHasExistException;
import com.thoughtworks.webapp.service.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/users/{userId}")
    public ResponseEntity<UserResponse> findUserById(@PathVariable Integer userId) {
        if (userService.findUserById(userId) == null) {
            throw new UserNotFoundException("Cannot find basic info for user with id: " + userId);
        }
        UserResponse userResponse = UserResponse.toUserResponse(userService.findUserById(userId));
        return ResponseEntity.ok().body(userResponse);
    }

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody UserRequest userRequest) {
        User user = userRequest.toUser();
        int id = userService.createUser(user);
        if(id == 0) {
            throw new UserHasExistException("user has exist");
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
