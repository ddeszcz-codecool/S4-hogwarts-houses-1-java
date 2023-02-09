package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.types.HouseType;
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

    public void addNewRoom() {
        int currentRoomsNumber = roomDAO.getAllRooms().size();
        int room_id = currentRoomsNumber +1;
        Room newRoom = new Room(room_id, HouseType.GRYFFINDOR, 3,"Number " + room_id);
        roomDAO.addRoom(newRoom);
    }

    public void markRoomForRenovation(Long id) {
        Room markRoomForRenovation = roomDAO.findRoomById(id);
        markRoomForRenovation.setCapacity(0);
    }
}
