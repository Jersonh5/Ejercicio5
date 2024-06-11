package com.example.demo.services;

import com.example.demo.dtos.UserDto;
import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
}
