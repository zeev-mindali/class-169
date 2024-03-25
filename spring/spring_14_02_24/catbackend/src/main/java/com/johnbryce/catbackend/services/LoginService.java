package com.johnbryce.catbackend.services;

import com.johnbryce.catbackend.beans.Credentials;
import com.johnbryce.catbackend.beans.UserRole;
import com.johnbryce.catbackend.repo.UsersRepo;
import com.johnbryce.catbackend.util.JWT;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;

@Service
@RequiredArgsConstructor
public class LoginService {
    //repository to check user name against DB
    private final JWT jwt;
    private final UsersRepo usersRepo;
    public String login(String userName, String userPass, UserRole role) throws LoginException {
        Credentials credentials = usersRepo.findByUserNameAndUserPass(userName,userPass);
        if (credentials==null){
            throw new LoginException("User not found !!!");
        }
        return jwt.generateToken(credentials, role.getRoleName());
    }
}
