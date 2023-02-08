package com.codecool.hogwartshouses.data_sample;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.types.HouseType;
import com.codecool.hogwartshouses.service.DAO.RoomMemory;
import org.springframework.stereotype.Component;

@Component
public class RoomCreator {


    private final RoomMemory roomMemory;

    public RoomCreator(RoomMemory roomMemory) {
        this.roomMemory = roomMemory;
        initialize();
    }


    public void initialize() {
    Room roomGryffindorNumber1 = new Room(1, HouseType.GRYFFINDOR, 2);
    Room roomGryffindorNumber2 = new Room(2, HouseType.GRYFFINDOR, 2);
    Room roomHufflepuffNumber1 = new Room(3, HouseType.HUFFLEPUFF, 2);
    Room roomHufflepuffNumber2 = new Room(4, HouseType.HUFFLEPUFF, 2);
    Room roomRavenClawNumber1 = new Room(5, HouseType.HUFFLEPUFF, 4);
    Room roomSlytherinNumber1 = new Room(6, HouseType.HUFFLEPUFF, 1);
    }


}
