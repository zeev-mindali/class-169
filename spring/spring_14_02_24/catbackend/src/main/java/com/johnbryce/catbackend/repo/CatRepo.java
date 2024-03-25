package com.johnbryce.catbackend.repo;

import com.johnbryce.catbackend.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepo extends JpaRepository<Cat, Integer> {
    List<Cat> findByNameAndWeight(String name, Float weight);
    List<Cat> findByNameOrWeight(String name, Float weight);
    List<Cat> findAllByOrderByWeightAsc();
    List<Cat> findAllByOrderByWeightDesc();
    List<Cat> findByNameStartingWith(String name);
}
