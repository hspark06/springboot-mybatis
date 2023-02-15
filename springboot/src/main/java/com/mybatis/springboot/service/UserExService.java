package com.mybatis.springboot.service;

import java.util.List;
import com.mybatis.springboot.entity.User;

public interface UserExService {
    public List<User> getUserList();
    public int insertUser(User user);
    public int updateUser(User user);
    public int deleteUser(Long id);
}
