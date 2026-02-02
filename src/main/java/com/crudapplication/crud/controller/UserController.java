package com.crudapplication.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crudapplication.crud.model.User;
import com.crudapplication.crud.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")   // ✅ FIXED
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        user.setId(userId);
        return userService.updateUser(user);
    }

    @DeleteMapping("/{userId}")
    public User deleteUser(@PathVariable Long userId) {
        return userService.deleteUser(userId);
    }
}
