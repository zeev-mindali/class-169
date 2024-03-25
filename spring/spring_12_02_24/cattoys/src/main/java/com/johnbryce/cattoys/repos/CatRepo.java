package com.johnbryce.cattoys.repos;

import com.johnbryce.cattoys.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepo extends JpaRepository<Cat,Integer> {
    List<Cat> findByName(String name);
}
