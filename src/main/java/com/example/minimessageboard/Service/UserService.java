package com.example.minimessageboard.Service;

import com.example.minimessageboard.Model.User;
import com.example.minimessageboard.Repository.UserRepository;

import java.util.List;

public interface UserService {


    List<User> getUser();
}
