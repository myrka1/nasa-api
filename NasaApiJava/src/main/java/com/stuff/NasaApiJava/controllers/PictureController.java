package com.stuff.NasaApiJava.controllers;

import com.stuff.NasaApiJava.models.Picture;
import com.stuff.NasaApiJava.services.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PictureController {
    @Autowired
    PictureService picService;

    //daily     localhost:8080/daily
    @RequestMapping(path="/daily", method= RequestMethod.GET)
    public Picture getPic() {
        return picService.getPicOfDay();
    }

    //postman specific      localhost:8080/specific/2023-04-01
    @RequestMapping(path="/specific/{date}", method= RequestMethod.GET)
    public Picture getSpecific(@PathVariable String date) {
        return picService.getSpecificDate(date);
    }
}
