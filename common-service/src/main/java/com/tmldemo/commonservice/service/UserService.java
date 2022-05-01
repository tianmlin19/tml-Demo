package com.tmldemo.commonservice.service;

import com.tmldemo.commonservice.dto.User;

import java.util.List;

public interface UserService {

    List<User> listUserByName(String userName);
}
