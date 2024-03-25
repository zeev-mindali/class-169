package com.johnbryce.catbackend.exceptions;

public class CatSystemException extends Exception{
    public CatSystemException(ErrMsg errMsg){super (errMsg.getMsg());}
}
