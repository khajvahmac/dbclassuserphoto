package uni.homework.userphoto.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import uni.homework.userphoto.model.User;
import uni.homework.userphoto.repositories.UserRepository;

/**
 * Created by khajvah on 12/10/17.
 */
public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User insertOne(User user) {
        mongoTemplate.insert(user);
        return user;
    }
}
