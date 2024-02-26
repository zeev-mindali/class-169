package com.johnbryce.catbackend.clr;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.beans.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@Order(1)
public class RestTests implements CommandLineRunner {

    @Autowired
    RestTemplate restTemplate;
    @Override
    public void run(String... args) throws Exception {
        //how to get an object by using resetTemplate
        try{
            //Cat response = restTemplate.getForObject("http://localhost:8080/api/cats/5",Cat.class);
            //System.out.println(response);
            //System.out.println(response.getToys());
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        //old way to get statusCode (deprecated)
        try{
            //ResponseEntity<String> res2 = restTemplate.getForEntity("http://localhost:8080/api/cats/1",String.class);
            //System.out.println(res2.getStatusCodeValue()== HttpStatus.OK.value()?"sababa":"not sababa");
        } catch(Exception err){
            System.out.println(err.getMessage());
        }

        //building an instance of a cat
        Cat toAdd = Cat.builder()
                .id(0)
                .name("David")
                .weight(30.0f)
                .toy(new Toy("Snake"))
                .build();

        //how to post a data with restTemplate
        try{
            //ResponseEntity<String> responsePost = restTemplate.postForEntity("http://localhost:8080/api/cats",toAdd,String.class);
            //System.out.println(responsePost.getStatusCode().value()==HttpStatus.CREATED.value()?"sabba":"not sababa");
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

        //how to delete a data from our sql server using post
        try{
            //restTemplate.delete("http://localhost:8080/api/cats/5");
            //System.out.println("Second david was tarminted by pagosh");
        } catch(Exception err){
            System.out.println(err.getMessage());
        }

        //how to get an array of data and convert it to list of objects.
        try{
            Cat[] cats = restTemplate.getForObject("http://localhost:8080/api/cats", Cat[].class);
            List<Cat> catsList = Arrays.stream(cats).toList();
            catsList.forEach(System.out::println);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }

        //for using put (update), first GET Data and then POST data
    }
}
