package com.johnbryce.catbackend.repo;

import com.johnbryce.catbackend.beans.Credentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Credentials,Integer> {
    Credentials findByUserNameAndUserPass(String userName,String userPass);
}
