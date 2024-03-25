package com.ori.thehurt.clr;

import com.ori.thehurt.beans.Rooms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
public class TestRest implements CommandLineRunner {
    @Autowired
    RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception {
        //get all rooms :)
        System.out.println(restTemplate.getForObject("http://localhost:8080/api/home", String.class));

        //get all rooms as object :)
        Rooms[] myRooms=restTemplate.getForEntity("http://localhost:8080/api/home", Rooms[].class).getBody();
        Arrays.stream(myRooms).toList().forEach(System.out::println);

        Rooms newRoom = Rooms.builder()
                .id(0)
                .roomName("Ori Bathroom")
                .floorNumber(1)
                .build();

        restTemplate.postForEntity("http://localhost:8080/api/home",newRoom, Rooms.class);

        myRooms=restTemplate.getForEntity("http://localhost:8080/api/home", Rooms[].class).getBody();
        Arrays.stream(myRooms).toList().forEach(System.out::println);

    }
}
