package com.johnbryce.cats.repositories;

import com.johnbryce.cats.beans.Cat;
import com.johnbryce.cats.beans.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat,Integer> {
    List<Cat> findByName(String name);
    List<Cat> findByNameAndWeight(String name, double weight);
    List<Cat> findByNameOrWeight(String name, double weight);
    List<Cat> findByWeightGreaterThan(double weight);
    List<Cat> findByWeightLessThan(double weight);
    boolean existsByNameAndColor(String name, Color color);
    Cat findTop1ByName(String name);
    List<Cat> findByNameLike(String name);
    List<Cat> findByNameStartsWith(String name);
    List<Cat> findByNameEndsWith(String name);

    @Query(value = "select avg(weight) from cats",nativeQuery = true)
    double avg();
}
