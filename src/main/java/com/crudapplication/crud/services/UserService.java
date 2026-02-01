package com.crudapplication.crud.services;

import java.util.List;

import com.crudapplication.crud.model.User;

public interface UserService {

    User addUser(User user);

    List<User> getUsers();

    User getUser(long userId);

    User updateUser(User user);

    User deleteUser(Long userId);
}

