package com.example.pp_3_1_1_springboot.service;



import com.example.pp_3_1_1_springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    void add(User user);

    void remove(User user);

    void update(User user);
    User getUserById(Long id);
    List<User> getUsers();
}
