package com.ori.thehurt.exceptions;

import lombok.Data;
import lombok.Getter;


@Getter
public enum ExceptionMessages {
    ROOM_ALREADY_EXISTS("Room is on fire"),
    ROOM_NOT_FOUND("Room not found"),
    HOUSE_ON_FIRE("The roof, the roof , the roof is on fire, we don't need no ......"),
    HOUSE_IS_CRAZY("Roni and sons");

    private final String message;

    ExceptionMessages(String message) {
        this.message = message;
    }
}
