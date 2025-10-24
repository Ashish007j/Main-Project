package com.Main_Project.SERVICES;

import com.Main_Project.DTO.UserDto;
import com.Main_Project.ENTITY.User;
import com.Main_Project.REPOSITRY.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userServices")
public class UserServicesIm implements UserServices {
    @Autowired
    private UserRepositry userRepositry;

    @Override
    public UserDto registerUser(UserDto userDto) {
        User user = userDto.toEntity();
        user = userRepositry.save(user);
        return user.toDTO();
    }
}
