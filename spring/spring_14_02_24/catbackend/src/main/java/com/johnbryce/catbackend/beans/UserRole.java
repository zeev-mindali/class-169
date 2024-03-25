package com.johnbryce.catbackend.beans;

import lombok.Data;
import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("admin"),
    COMPANY("company"),
    CUSTOMER("customer"),
    GUEST("gust");

    private String roleName;

    UserRole(String role) {
        this.roleName=role;
    }
}
