package com.codecool.hogwartshouses.repositories.DAO;

import com.codecool.hogwartshouses.model.Room;

import java.util.Set;

public interface RoomDAO {

    Set<Room> getAllRooms();
    void addRoom(Room room);

    Room getRoomById(Long id);

    void deleteRoomById(Long id);

    Room findRoomById(Long id);

    Set<Room> getAvailableRooms();

    Set<Room> getAvailableRoomsForRatOwners();
}