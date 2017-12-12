package uni.homework.userphoto.repositories.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import uni.homework.userphoto.model.Photo;
import uni.homework.userphoto.model.User;
import uni.homework.userphoto.repositories.PhotoRepository;

import java.util.List;

public class PhotoRepositoryImpl implements PhotoRepository{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Photo insertOne(Photo photo) {
        mongoTemplate.insert(photo);
        return photo;
    }

    @Override
    public List<Photo> searchPhotos(String tag) {
        return mongoTemplate.find(new Query(Criteria.where("tags").is(tag)), Photo.class);
    }
}
