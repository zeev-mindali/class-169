package com.johnbryce.catbackend.controllers;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.beans.Toy;
import com.johnbryce.catbackend.exceptions.CatSystemException;
import com.johnbryce.catbackend.services.CatService;
import com.johnbryce.catbackend.util.JWT;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;
    private final JWT jwt;
    @GetMapping
    public List<Cat> getAllCats(){
    return catService.getAllCats();
    }

//    public ResponseEntity<?> getAllCats(@RequestHeader(HttpHeaders.AUTHORIZATION) String token){
//        System.out.println("old token:\n"+token+"\n");
//        //check token
//
//        //generate a new token
//        String newToken = jwt.checkUser(token);
//        System.out.println("new token:\n"+newToken+"\n");
//        return ResponseEntity.ok()
//                .header("Authorization",newToken)
//                .body(catService.getAllCats()); //בבקששה
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCat(@Validated @RequestBody Cat cat) throws CatSystemException{
        catService.addCat(cat);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCat(@PathVariable int id,@RequestBody Cat cat) throws CatSystemException {
        catService.updateCat(id, cat);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCat(@PathVariable int id) throws CatSystemException {
        catService.deleteCat(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cat getSingleCat(@PathVariable int id) throws CatSystemException {
        return catService.getSingleCat(id);
    }

    @GetMapping("/toys/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Toy> getCatToys(@PathVariable int id) throws CatSystemException{
        return catService.getCatToys(id);
    }
}
