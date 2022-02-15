package com.userservice.user_service.service;

import java.util.List;

import com.userservice.user_service.entity.User;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // fake user list
    List<User> list = List.of(
            new User(1311L, "User First", "905553366"),
            new User(1312L, "User Second", "905773366"),
            new User(1313L, "User Third", "905553006"));

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }

}
