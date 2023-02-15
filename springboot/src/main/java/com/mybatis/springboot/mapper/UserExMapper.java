package com.mybatis.springboot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.mybatis.springboot.entity.User;

@Mapper
@Repository
public interface UserExMapper {
    List<User> getUserList();
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Long id);

}
