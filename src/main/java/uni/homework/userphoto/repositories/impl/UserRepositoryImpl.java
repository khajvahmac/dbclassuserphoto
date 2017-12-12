package uni.homework.userphoto.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import uni.homework.userphoto.model.User;
import uni.homework.userphoto.repositories.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User insertOne(User user) {
        mongoTemplate.insert(user);
        return user;
    }

    @Override
    public List<User> findUsersByUsername(String username) {
        return mongoTemplate.find(new Query(Criteria.where("username").is(username)), User.class);
    }

    @Override
    public List<User> searchUsers(String searchTerm) {
        return mongoTemplate.find(new Query(Criteria.where("username").regex(searchTerm)), User.class);
    }
}
