package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.DAO.RoomDAO;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RoomService {


    private final RoomDAO roomDAO;

    public RoomService(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    public Set<Room> getAllRooms() {
        return roomDAO.getAllRooms();
    }

    public void addRoom(Room room) {roomDAO.addRoom(room);
    }

    public Room getRoomById(Long id) {
        return roomDAO.getRoomById(id);
    }

    public void deleteRoomById(Long id) {
        roomDAO.deleteRoomById(id);
    }
}
