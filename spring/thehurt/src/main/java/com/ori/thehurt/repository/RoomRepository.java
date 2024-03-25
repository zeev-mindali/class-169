package com.ori.thehurt.repository;

import com.ori.thehurt.beans.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Rooms, Integer> {
}
