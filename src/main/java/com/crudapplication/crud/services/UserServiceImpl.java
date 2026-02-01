package com.crudapplication.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapplication.crud.dao.UserDao;
import com.crudapplication.crud.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUser(long userId) {
        return userDao.findById(userId).orElse(null);
    }

    @Override
    public User updateUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User deleteUser(Long userId) {
        User user = userDao.findById(userId).orElse(null);
        if (user != null) {
            userDao.delete(user);
        }
        return user;
    }
}
