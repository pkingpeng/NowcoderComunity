package com.nowcoder.community.service;

import com.nowcoder.community.DAO.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @file: UserService.java
 * @time: 2022/4/19 17:56
 * @Author by Pking
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
