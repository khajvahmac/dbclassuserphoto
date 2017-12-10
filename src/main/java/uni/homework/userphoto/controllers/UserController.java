package uni.homework.userphoto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uni.homework.userphoto.model.User;
import uni.homework.userphoto.model.UserRequest;
import uni.homework.userphoto.repositories.UserRepository;

import java.util.List;

/**
 * Created by khajvah on 12/10/17.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "API user endpoint.";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public User create(@RequestBody UserRequest userRequest) {

        User user = new User();

        user.setName(userRequest.getName());
        user.setPassword(userRequest.getPassword());
        user.setUsername(userRequest.getUsername());

        userRepository.insertOne(user);
        return user;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<User> userSearch(@RequestParam String query) {
        return userRepository.searchUsers(query);
    }
}
