package com.ori.thehurt.controller;

import com.ori.thehurt.beans.Rooms;
import com.ori.thehurt.beans.SmartModule;
import com.ori.thehurt.exceptions.HouseExceptions;
import com.ori.thehurt.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/home")
public class HouseController implements HouseService {

    @Autowired
    HouseService service;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addRoom(@RequestBody Rooms newRoom) throws HouseExceptions {
        service.addRoom(newRoom);
    }

    @Override
    @DeleteMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteRoom(int id) {
        service.deleteRoom(id);
    }

    @Override
    @PutMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateRoom(@RequestBody Rooms rooms) {
        service.updateRoom(rooms);
    }

    @Override
    @GetMapping
    public List<Rooms> getAllRooms() {
        return service.getAllRooms();
    }

    @Override
    @GetMapping("/modules/{id}")
    public List<SmartModule> roomsModules(@PathVariable int roomId) {
        return service.roomsModules(roomId);
    }

    @Override
    @GetMapping("/{id}")
    public Rooms getSingleRoom(@PathVariable int id) {
        return service.getSingleRoom(id);
    }
}
