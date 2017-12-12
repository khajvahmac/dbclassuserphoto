package uni.homework.userphoto.repositories;

import uni.homework.userphoto.model.User;

import java.util.List;

public interface UserRepository {
    User insertOne(User user);
    List<User> findUsersByUsername(String username);
    List<User> searchUsers(String searchTerm);
}
