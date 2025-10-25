package com.Main_Project.API;

import com.Main_Project.DTO.UserDTO;
import com.Main_Project.SERVICES.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserAPI {
    @Autowired
    private UserService userService ;
    @PostMapping("/register")
    public ResponseEntity<UserDTO>registerUser( @RequestBody UserDTO userDTO){
        userDTO = userService.registerUser(userDTO);
        return new ResponseEntity<>(userDTO , HttpStatus.CREATED);
    }

}
