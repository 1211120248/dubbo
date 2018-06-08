package com.github.provider;

import com.github.api.IUserService;
import com.github.api.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements IUserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public Map<String,User> userMap = new HashMap<>();

    public UserServiceImpl() {
        userMap.put("1",new User("1","admin","admin"));
    }

    public User findById(String id) {
        System.out.println("UserServiceImpl.findById id=" + id);
        return userMap.get(id);
    }
}
