package com.codecool.hogwartshouses.database_dump;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.types.HouseType;
import com.codecool.hogwartshouses.repositories.DAO.RoomMemory;
import org.springframework.stereotype.Component;

@Component
public class RoomCreator {


    private final RoomMemory roomMemory;

    public RoomCreator(RoomMemory roomMemory) {
        this.roomMemory = roomMemory;
        createRooms();
    }


    public void createRooms() {
    Room roomGryffindorNumber1 = new Room(1, HouseType.GRYFFINDOR, 2, "Number 1");
    Room roomGryffindorNumber2 = new Room(2, HouseType.GRYFFINDOR, 2,"Number 2");
    Room roomHufflepuffNumber1 = new Room(3, HouseType.HUFFLEPUFF, 2, "Number 1");
    Room roomHufflepuffNumber2 = new Room(4, HouseType.HUFFLEPUFF, 2, "Number 2");
    Room roomRavenClawNumber1 = new Room(5, HouseType.RAVENCLAW, 4, "Number 1");
    Room roomSlytherinNumber1 = new Room(6, HouseType.SLYTHERIN, 1,"Number 1");
    roomMemory.addRoom(roomGryffindorNumber1);
    roomMemory.addRoom(roomGryffindorNumber2);
    roomMemory.addRoom(roomHufflepuffNumber1);
    roomMemory.addRoom(roomHufflepuffNumber2);
    roomMemory.addRoom(roomRavenClawNumber1);
    roomMemory.addRoom(roomSlytherinNumber1);
    }


}
