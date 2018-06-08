package com.github.provider;

import com.github.api.IUserService;
import com.github.api.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements IUserService {

    public Map<String,User> userMap = new HashMap<>();

    public UserServiceImpl() {
        userMap.put("1",new User("1","admin","admin"));
    }

    public User findById(String id) {
        return userMap.get(id);
    }
}
