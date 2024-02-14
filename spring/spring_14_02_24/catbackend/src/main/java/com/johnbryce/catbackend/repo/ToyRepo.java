package com.johnbryce.catbackend.repo;

import com.johnbryce.catbackend.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepo extends JpaRepository<Toy, Integer> {
}
