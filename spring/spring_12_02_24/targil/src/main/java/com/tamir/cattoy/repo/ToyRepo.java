package com.tamir.cattoy.repo;

import com.tamir.cattoy.beans.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ToyRepo extends JpaRepository<Toy,Integer> {
}
