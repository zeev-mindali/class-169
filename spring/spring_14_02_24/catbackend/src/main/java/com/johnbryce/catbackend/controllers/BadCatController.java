package com.johnbryce.catbackend.controllers;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.exceptions.CatSystemException;
import com.johnbryce.catbackend.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("api/cats")
public class BadCatController {
    @Autowired
    private CatService catService;

    @PostMapping
    public ResponseEntity<?> addCat(@RequestBody Cat cat){
        try{
            catService.addCat(cat);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (CatSystemException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}/{name}") //<= path variable named id
    public ResponseEntity<?> updateCat(@PathVariable int id, @PathVariable String name, @RequestBody Cat cat){
        try{
            catService.updateCat(id,cat);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (CatSystemException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
