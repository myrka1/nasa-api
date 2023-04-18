package com.stuff.NasaApiJava.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.stuff.NasaApiJava.models.Picture;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

@Component
public class PictureService {

    @Value("${nasa.key}")
    private String key;

    private RestTemplate restTemplate = new RestTemplate();

    public ArrayList<Picture> getPicOfDay() {
        ArrayList<Picture> pictureList = new ArrayList<>();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(httpHeaders);

        String url = "https://api.nasa.gov/planetary/apod?api_key=" + key;
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                String.class
        );
        Picture picture = responseToPicture(response);
        pictureList.add(picture);
        return pictureList;
    }

    //method for specific date
    public ArrayList<Picture> getSpecificDate(String dateInput) {
        ArrayList<Picture> pictureList = new ArrayList<>();
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(httpHeaders);

        //https://api.nasa.gov/planetary/apod?api_key= + API_Key +
        // &date= + (specific date YYYY-MM-DD) 2021-08-01
        String url = "https://api.nasa.gov/planetary/apod?api_key=" + key +
                "&date=" + dateInput;
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                String.class
        );

        Picture picture = responseToPicture(response);
        pictureList.add(picture);
        return pictureList;
    }

    public Picture responseToPicture(ResponseEntity<String> response) {
        Picture picture = null;
        try {
            ObjectMapper oM = new ObjectMapper();
            JsonNode jsonNode = oM.readTree(response.getBody());
            String date = jsonNode.path("date").asText();
            String explanation = jsonNode.path("explanation").asText();
            String title = jsonNode.path("title").asText();
            String image = jsonNode.path("url").asText();

            picture = new Picture(date, explanation, title, image);
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return picture;
    }
}
