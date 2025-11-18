package com.Main_Project.REPOSITRY;

import com.Main_Project.ENTITY.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepositry extends MongoRepository<User , Long> {

       public Optional<User> findByEmail(String email);
}
