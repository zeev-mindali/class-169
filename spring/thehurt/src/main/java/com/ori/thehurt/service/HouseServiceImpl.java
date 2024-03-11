package com.ori.thehurt.service;

import com.ori.thehurt.beans.Rooms;
import com.ori.thehurt.beans.SmartModule;
import com.ori.thehurt.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    RoomRepository repository;
    @Override
    public void addRoom(Rooms newRoom) {
        repository.save(newRoom);
    }

    @Override
    public void deleteRoom(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Rooms> getAllRooms() {
        return repository.findAll();
    }

    @Override
    public List<SmartModule> roomsModules(int roomId) {
        return getSingleRoom(roomId).getModules();
    }

    @Override
    public Rooms getSingleRoom(int id) {
        return repository.findById(id).get();
    }

    @Override
    public void updateRoom(Rooms updateRoom) {
        repository.saveAndFlush(updateRoom);
    }
}
