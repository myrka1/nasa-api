package com.stuff.NasaApiJava.controllers;

import com.stuff.NasaApiJava.models.Picture;
import com.stuff.NasaApiJava.services.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class PictureController {
    @Autowired
    PictureService picService;

    @RequestMapping(path="/daily", method= RequestMethod.GET)
    public ArrayList<Picture> getPic() {
        return picService.getPicOfDay();
    }

    @RequestMapping(path="/specific/{date}", method= RequestMethod.GET)
    public ArrayList<Picture> getSpecific(@PathVariable String date) {
        return picService.getSpecificDate(date);
    }
}
