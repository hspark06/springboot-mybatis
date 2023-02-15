package com.mybatis.springboot.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.springboot.entity.User;
import com.mybatis.springboot.service.UserExService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {
    private final UserExService userService;

    // Build Get All Users REST API
    // http://localhost:8080/api/users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getUserList();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    // build create User REST API
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println("User = " + user.toString());
        int nRet = userService.insertUser(user);
        System.out.println("Ret = " + nRet);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // Build Update User REST API
    @PutMapping("{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<User> updateUser(@PathVariable("id") Long userId,
            @RequestBody User user) {
        user.setId(userId);
        int nRet =  userService.updateUser(user);
        System.out.println("Ret = " + nRet);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
    // Build Delete User REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
    }

    /* 
    // build get user by id REST API
    // http://localhost:8080/api/users/1
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId) {
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    

    

    
    */
}
