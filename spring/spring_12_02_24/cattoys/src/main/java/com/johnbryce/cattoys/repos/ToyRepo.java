package com.johnbryce.cattoys.repos;

import com.johnbryce.cattoys.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepo extends JpaRepository<Toy,Integer> {
}
