package com.stuff.NasaApiJava.controllers;

import com.stuff.NasaApiJava.models.Picture;
import com.stuff.NasaApiJava.services.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PictureController {
    @Autowired
    PictureService picService;

    //postman of the day
    @RequestMapping(path="/picture", method= RequestMethod.GET)
    public Picture getPic() {
        return picService.getPicOfDay();
    }

    //postman specific

}
