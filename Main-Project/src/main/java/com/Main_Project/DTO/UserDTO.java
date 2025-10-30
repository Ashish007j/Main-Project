package com.Main_Project.DTO;


import com.Main_Project.ENTITY.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String  id ;
    private String Name;
    private String email;
    private String password;
    private AccountType accountType;

    public User toEntity() {
        return  new User(this.id , this.Name, this.email ,this.password , this.accountType);
    }
}
