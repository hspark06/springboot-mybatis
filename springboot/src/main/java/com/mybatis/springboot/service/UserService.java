package com.mybatis.springboot.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mybatis.springboot.entity.User;
import com.mybatis.springboot.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    public void insertUser() {
        User user = new User();
        user.setFirstName("kim");
        user.setLastName("seoul");
        user.setEmail("test@dsic.co.kr");
    
        userMapper.insertUser(user);
    }
}
