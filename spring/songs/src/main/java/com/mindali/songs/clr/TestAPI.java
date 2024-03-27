package com.mindali.songs.clr;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindali.songs.beans.YoutubeData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class TestAPI implements CommandLineRunner {
    private final RestTemplate restTemplate;

    @Value("${youtube.api}")
    private String API_KEY;

    private String URL = "https://www.googleapis.com/youtube/v3/videos?part=snippet&key=AIzaSyB_rfFikBTjch9lqoaaLuqX_ETqsGGTvN8&id=";
    @Override
    public void run(String... args) throws Exception {
        //to get data for song id WeYsTmIzjkw
        //get all meta data from google as string
        String myMetaData = restTemplate.getForObject(URL+"WeYsTmIzjkw",String.class);
//       gh auth l
        //use object mapper , to map our item in the json object
        ObjectMapper mapper = new ObjectMapper();
        //get snippet data, by using items field, and since it's array, get first data (0)
        var myData = mapper.readTree(myMetaData).get("items").get(0).get("snippet");
        //create new bean of YouTubeData -> name,description, image
        YoutubeData youtubeData = YoutubeData.builder()
                .id("WeYsTmIzjkw")
                .name(myData.get("title").asText())
                .description(myData.get("description").asText())
                .imageURL(myData.get("thumbnails").get("standard").get("url").asText())
                .build();

        System.out.println(youtubeData);
    }
}
