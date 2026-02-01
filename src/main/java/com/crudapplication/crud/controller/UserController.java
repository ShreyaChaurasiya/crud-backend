package com.crudapplication.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crudapplication.crud.model.User;
import com.crudapplication.crud.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(
	    origins = {
	        "http://localhost:3000",
	        "https://crud-frontend-murex.vercel.app"
	    }
	)
public class UserController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // READ ALL
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // READ ONE
    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        return userService.getUser(userId);
    }

    // UPDATE
    @PutMapping("/{userId}")
    public User updateUser(@PathVariable Long userId, @RequestBody User user) {
        user.setId(userId);
        return userService.updateUser(user);
    }

    // DELETE
    @DeleteMapping("/{userId}")
    public User deleteUser(@PathVariable Long userId) {
        return userService.deleteUser(userId);
    }
}
