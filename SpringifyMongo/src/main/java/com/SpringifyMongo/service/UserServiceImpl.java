package com.SpringifyMongo.service;

import com.SpringifyMongo.model.User;
import com.SpringifyMongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }
    @Override
    public User createUser(User newUser) { //create a new user using user object
        return userRepository.save(newUser);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
