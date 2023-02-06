package com.codecool.hogwartshouses.controllers;

import com.codecool.hogwartshouses.entities.Room;
import com.codecool.hogwartshouses.services.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {


    RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> getAllRooms(){return roomService.getAllRooms();}

    @PostMapping()
    public void addRoom(@RequestBody Room room) {
        roomService.addLesson(room);
    }

    
}
