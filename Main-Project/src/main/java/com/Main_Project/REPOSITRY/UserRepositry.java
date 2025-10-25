package com.Main_Project.REPOSITRY;

import com.Main_Project.ENTITY.User;
import org.springframework.data.mongodb.repository.MongoRepository;

 public interface UserRepositry extends MongoRepository<User , String> {

}
