package com.tmldemo.commonservice.service.impl;

import com.tmldemo.commonservice.dto.User;
import com.tmldemo.commonservice.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> listUserByName(String userName) {
        return null;
    }
}
