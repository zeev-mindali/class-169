package com.johnbryce.catbackend.services;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.beans.Toy;
import com.johnbryce.catbackend.exceptions.CatSystemException;

import java.util.List;

public interface CatService {
    void addCat(Cat cat) throws CatSystemException;
    void updateCat(int catId,Cat cat) throws CatSystemException;
    void deleteCat(int catId) throws CatSystemException;
    List<Cat> getAllCats();
    Cat getSingleCat(int catId) throws CatSystemException;
    List<Toy> getCatToys(int catId);
}
