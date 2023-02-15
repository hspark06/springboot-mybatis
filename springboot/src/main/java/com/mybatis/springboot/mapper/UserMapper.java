package com.mybatis.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.mybatis.springboot.entity.User;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> findAll();

    @Insert("insert into user values(#{firstName}, #{lastName}, #{email})")
    void insertUser(User user);
}
