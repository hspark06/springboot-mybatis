package com.mybatis.springboot.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mybatis.springboot.entity.User;
import com.mybatis.springboot.mapper.UserExMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserExServiceImpl implements UserExService {
    private final UserExMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteUser(id);
    }

}