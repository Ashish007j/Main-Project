package com.Main_Project.API;

import com.Main_Project.DTO.UserDto;
import com.Main_Project.SERVICES.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserAPI {
    @Autowired
    private UserServices userServices;
    @PostMapping("/register")
    public ResponseEntity<UserDto> registerUser (@RequestBody UserDto userDto){
        userDto = userServices.registerUser(userDto);
        return new ResponseEntity<>(userDto , HttpStatus.CREATED);
    }
}
