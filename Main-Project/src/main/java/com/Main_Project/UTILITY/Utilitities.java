package com.Main_Project.UTILITY;

import com.Main_Project.ENTITY.sequence;
import com.Main_Project.EXCEPTION.jobPortalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;


@Component
public class Utilitities {

    private  static MongoOperations mongoOperation;

    @Autowired
    public void SetMongoOperation(MongoOperations mongoOperation){
        Utilitities.mongoOperation = mongoOperation;
    }

    public static Long getNextSequence(String key ) throws jobPortalException {
        Query query = new Query(Criteria.where("_id").is(key));
        Update update = new Update();
        update.inc("seq" , 1 );
        FindAndModifyOptions options = new FindAndModifyOptions();
        options.returnNew(true);
        sequence seq = mongoOperation.findAndModify(query , update , options , sequence.class);
        if(seq == null) throw new jobPortalException("unable to get sequence id for the key " + key);
        return seq.getSeq();
    }
}
