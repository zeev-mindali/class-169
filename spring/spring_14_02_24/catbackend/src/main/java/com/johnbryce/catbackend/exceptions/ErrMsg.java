package com.johnbryce.catbackend.exceptions;

import lombok.Getter;

@Getter
public enum ErrMsg {
    ID_NOT_FOUND("id not found...."),
    ID_ALREADY_EXISTS("Id already exists..."),
    WEIGHT_ERROR("Weight should be a positive number");
    private String msg;
    ErrMsg(String msg){this.msg=msg;}
}
