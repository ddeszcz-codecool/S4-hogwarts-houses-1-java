package com.codecool.hogwartshouses.repositories.DAO;

import com.codecool.hogwartshouses.model.Room;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class RoomMemory implements RoomDAO {

    private final Set<Room> rooms;

    public RoomMemory(Set<Room> rooms) {
        this.rooms = rooms;
    }


    @Override
    public Set<Room> getAllRooms() {
        return this.rooms;
    }

    @Override
    public void addRoom(Room room) {
        this.rooms.add(room);

    }

    @Override
    public Room getRoomById(Long id) {
        return rooms.stream()
                .filter(room -> id.equals(room.getId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public void deleteRoomById(Long id) {
        rooms.removeIf(room -> room.getId() == id);
    }

    @Override
    public Room findRoomById(Long id) {
        Room roomToBeUpdated = null;
        for (Room room : rooms) {
            if(room.getId() == id){
                roomToBeUpdated = room;
            }
        }
        return roomToBeUpdated;
    }
}
