package uni.homework.userphoto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import uni.homework.userphoto.model.Photo;
import uni.homework.userphoto.model.PhotoRequest;
import uni.homework.userphoto.repositories.PhotoRepository;

import java.util.List;

@Controller
@RequestMapping("/photos")
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "API user endpoint.";
    }

    @RequestMapping(value = "/add_photo", method = RequestMethod.POST)
    @ResponseBody
    public Photo create(@RequestBody PhotoRequest photoRequest) {

        Photo user = new Photo();

        user.setTags(photoRequest.getTags());
        user.setUrl(photoRequest.getUrl());

        photoRepository.insertOne(user);
        return user;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public List<Photo> userSearch(@RequestParam String query) {
        return photoRepository.searchPhotos(query);
    }
}