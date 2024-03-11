package com.johnbryce.catbackend.services;

import com.johnbryce.catbackend.beans.Cat;
import com.johnbryce.catbackend.beans.Toy;
import com.johnbryce.catbackend.exceptions.CatSystemException;
import com.johnbryce.catbackend.exceptions.ErrMsg;
import com.johnbryce.catbackend.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatServiceImpl implements CatService{
    @Autowired
    CatRepo catRepo;
    @Override
    public void addCat(Cat cat) throws CatSystemException {
        int id = cat.getId();
        if (catRepo.existsById(id)){
            throw new CatSystemException(ErrMsg.ID_ALREADY_EXISTS);
        }
        catRepo.save(cat);
    }

    @Override
    public void updateCat(int catId, Cat cat) throws CatSystemException {
        if (!catRepo.existsById(cat.getId())){
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        catRepo.saveAndFlush(cat);
    }

    @Override
    public void deleteCat(int catId) throws CatSystemException {
        if (!catRepo.existsById(catId)){
            throw new CatSystemException(ErrMsg.ID_NOT_FOUND);
        }
        catRepo.deleteById(catId);
    }

    @Override
    public List<Cat> getAllCats() {
        return catRepo.findAll();
    }

    @Override
    public Cat getSingleCat(int catId) throws CatSystemException {
        return catRepo.findById(catId).orElseThrow(()->new CatSystemException(ErrMsg.ID_NOT_FOUND));
    }

    @Override
    public List<Toy> getCatToys(int catId) {
//        List<Toy> catToys = new ArrayList<>();
//        catToys = catRepo.findById(catId).get().getToys();
//        return catToys;
        return catRepo.findById(catId).get().getToys();
    }
}
