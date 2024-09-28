package com.example.pp_3_1_1_springboot.service;

import com.example.pp_3_1_1_springboot.model.User;
import com.example.pp_3_1_1_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class UserServiceImp implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void remove(User user) {
        userRepository.delete(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }


}
