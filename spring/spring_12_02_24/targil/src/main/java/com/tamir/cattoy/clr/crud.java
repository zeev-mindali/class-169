package com.tamir.cattoy.clr;

import com.tamir.cattoy.beans.Cat;
import com.tamir.cattoy.repo.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@Component
@Order(2)
public class crud implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        //update cat
//        Optional<Cat> david = catRepo.findById(3);
//        //System.out.println(david);
//        david.ifPresent((myCat)->{
//            myCat.setName("David the Ars");
//            catRepo.saveAndFlush(myCat);
//        });

        //delete cat :( no more david
//        Optional<Cat> david = catRepo.findById(3);
//        //System.out.println(david);
//        david.ifPresent((myCat)->{
//            myCat.setToys(null);
//            catRepo.saveAndFlush(myCat);
//            catRepo.delete(myCat);
//        });

        List<Cat> allCats = catRepo.findAll();
        allCats.forEach(System.out::println);
    }
}
