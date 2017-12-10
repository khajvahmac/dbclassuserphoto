package uni.homework.userphoto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import uni.homework.userphoto.conf.SpringConfig;
import uni.homework.userphoto.model.User;
import uni.homework.userphoto.model.UserRequest;
import uni.homework.userphoto.repositories.UserRepository;

/**
 * Created by khajvah on 12/10/17.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
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
}
