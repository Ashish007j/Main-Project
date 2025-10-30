package com.Main_Project.ENTITY;

import com.Main_Project.DTO.AccountType;
import com.Main_Project.DTO.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {
    @Id
     private String  id ;
     private String Name;
     @Indexed(unique = true)
     private String email;
     private String password;
     private AccountType accountType;

     public UserDTO toDTO() {
         return  new UserDTO(this.id , this.Name, this.email ,this.password , this.accountType);
     }

}
