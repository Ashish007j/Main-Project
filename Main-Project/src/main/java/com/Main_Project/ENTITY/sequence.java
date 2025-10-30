package com.Main_Project.ENTITY;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
public class sequence {
    @Id
    private String id;
    private Long seq ;


    public Long getseq() {
        return null;
    }
}
