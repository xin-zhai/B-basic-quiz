package com.thoughtworks.webapp.service;

import com.thoughtworks.webapp.dao.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<Integer, User> userMap= new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "zx", 20, "https://lh3.googleusercontent.com/proxy/eGwXKWXbarNoGffdwqUrulm2ygcFn2YcVEes9GP2y0Rrmwy9wfU9RFNQqNd6TA1vqh3wFSQgarkSWhJmxOV3wkc6a43mVrgiBuwmCtK85FTmPzHqGgtklow", "like something"));
    }

    public User findUserById(Integer id) {
        for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
           if(entry.getValue().getId() == id) {
               return entry.getValue();
           }
        }
        return null;
    }

    public Integer createUser(User user) {
        for (Map.Entry<Integer, User> entry : userMap.entrySet()) {
            if(entry.getValue().getName().equals(user.getName())) {
                return 0;
            }
        }
        int id = userMap.size()+1;
        user.setId(id);
        userMap.put(id, user);

        return id;
    }
}
