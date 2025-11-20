package com.Main_Project.SERVICES;

import com.Main_Project.DTO.LoginDTO;
import com.Main_Project.DTO.UserDTO;
import com.Main_Project.EXCEPTION.jobPortalException;

public interface UserService {
    public UserDTO registerUser(UserDTO userDTO)  throws jobPortalException;

//<LoginDTO> UserDTO loginUser( LoginDTO loginDTO) throws jobPortalException;

    UserDTO loginUser(LoginDTO loginDTO) throws jobPortalException;
}
