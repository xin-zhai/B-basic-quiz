package com.thoughtworks.webapp.service;

import com.thoughtworks.webapp.dao.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private Map<Integer, User> userMap= new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "zx", 20, "https://lh3.googleusercontent.com/proxy/J2j7_MpOZ0KbaD1-_W7MZXcgP1LEXNptkiZYZ1yAAomR9QzS0IxOs6e-kVI7wgeEBZ_wmZC68JIu3mwTLK21HkQmRseS6skx3Q4ADkoAAHULqCw11WtXK7M", "like something"));
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
