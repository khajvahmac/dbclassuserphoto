package uni.homework.userphoto.repositories;

import uni.homework.userphoto.model.Photo;

import java.util.List;

public interface PhotoRepository {
    Photo insertOne(Photo user);
    List<Photo> searchPhotos(String tag);
}
