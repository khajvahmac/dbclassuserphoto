package uni.homework.userphoto.repositories;

import uni.homework.userphoto.model.User;

import java.util.List;

/**
 * Created by khajvah on 12/10/17.
 */
public interface UserRepository {
    User insertOne(User user);
    List<User> findUsersByUsername(String username);
    List<User> searchUsers(String searchTerm);
}
