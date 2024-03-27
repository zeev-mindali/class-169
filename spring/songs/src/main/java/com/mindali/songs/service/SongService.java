package com.mindali.songs.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mindali.songs.beans.YoutubeData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class SongService {
    private final RestTemplate restTemplate;
    private String URL = "https://www.googleapis.com/youtube/v3/videos?part=snippet&key=AIzaSyB_rfFikBTjch9lqoaaLuqX_ETqsGGTvN8&id=";

    public YoutubeData getSongData(String id) throws JsonProcessingException {
        //get all meta data from google as string
        String myMetaData = restTemplate.getForObject(URL+id,String.class);
//       gh auth l
        //use object mapper , to map our item in the json object
        ObjectMapper mapper = new ObjectMapper();
        //get snippet data, by using items field, and since it's array, get first data (0)
        var myData = mapper.readTree(myMetaData).get("items").get(0).get("snippet");
        //create new bean of YouTubeData -> name,description, image
        return YoutubeData.builder()
                .id(id)
                .name(myData.get("title").asText())
                .description(myData.get("description").asText())
                .imageURL(myData.get("thumbnails").get("standard").get("url").asText())
                .build();


    }
}
