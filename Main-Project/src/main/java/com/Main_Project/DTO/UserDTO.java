package com.Main_Project.DTO;


import com.Main_Project.ENTITY.User;
// import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long  id ;
    private String Name;
    @NotBlank(message = "user.email.absent")
    //@Email(message = "user.email.invalid")
    private String email;
    @NotBlank(message = "user.password.absent")
    private String password;
    private AccountType accountType;

    public User toEntity() {
        return  new User(this.id , this.Name, this.email ,this.password , this.accountType);
    }
}
