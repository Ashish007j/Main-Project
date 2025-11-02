package com.Main_Project.ENTITY;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
@Data
public class sequence {
    @Id
    private String id;
    private Long seq ;


}
