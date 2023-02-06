package com.codecool.hogwartshouses.services.DAO;

import com.codecool.hogwartshouses.entities.Room;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class RoomMemory implements RoomDAO {

    private Set<Room> rooms;

    public RoomMemory(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
