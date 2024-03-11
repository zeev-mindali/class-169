package com.ori.thehurt.service;

import com.ori.thehurt.beans.Rooms;
import com.ori.thehurt.beans.SmartModule;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface HouseService {
    void addRoom(Rooms newRoom);
    void deleteRoom(int id);
    List<Rooms> getAllRooms();
    List<SmartModule> roomsModules(int roomId);
    Rooms getSingleRoom(int id);

    void updateRoom(Rooms rooms);
}
