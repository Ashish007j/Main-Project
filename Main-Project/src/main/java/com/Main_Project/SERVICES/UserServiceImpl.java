package com.Main_Project.SERVICES;

import com.Main_Project.DTO.UserDTO;
import com.Main_Project.ENTITY.User;
import com.Main_Project.EXCEPTION.jobPortalException;
import com.Main_Project.REPOSITRY.UserRepositry;
import com.Main_Project.UTILITY.Utilitities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositry userRepositry;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDTO registerUser(UserDTO userDTO) throws jobPortalException {
        Optional<User> optional = userRepositry.findByEmail(userDTO.getEmail());
        if(optional.isPresent()) throw new jobPortalException("USER_FOUND");
        userDTO.setId(Utilitities.getNextSequence("user"));
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user = userDTO.toEntity();
        userRepositry.save(user);
        return user.toDTO();
    }

    @Override
    public <LoginDTO> UserDTO loginUser(LoginDTO loginDTO) throws jobPortalException {
        User user = userRepositry.findByEmail(loginDTO.getEmail()).orElseThrow(() -> new  jobPortalException("USER_NOT_FOUND"));
        if (passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())) throw new jobPortalException("INVALID_");
        return user.toDTO();
    }
}
