package com.Main_Project.SERVICES;
import com.Main_Project.DTO.UserDTO;
import com.Main_Project.ENTITY.User;
import com.Main_Project.EXCEPTION.jobPortalException;
import com.Main_Project.REPOSITRY.UserRepositry;
import com.Main_Project.UTILITY.Utilitities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Utilities;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositry userRepositry;

     @Override
     public UserDTO registerUser(UserDTO userDTO) throws jobPortalException {
         userDTO.setId(Utilitities.getNextSequence("user"));
        User user = userDTO.toEntity();
        userRepositry.save(user);
        return user.toDTO();
    }

}
