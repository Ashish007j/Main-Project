package com.Main_Project.DTO;

import com.Main_Project.ENTITY.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserDto {

    public UserDto(String id, String name, String email, String password, AccountType accountType) {



    }

    public User toEntity() {
        return null;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class userDto {
        private String id;
        private String name;
        private  String email;
        private String password;
        private AccountType accountType;

        public User toEntity(){
            return new User (this.id,this.name,this.email,this.password,this.accountType);
        }
    }
}
