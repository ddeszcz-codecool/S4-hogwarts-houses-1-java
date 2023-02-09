package com.codecool.hogwartshouses.controller;


import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;


    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getRooms(Model model) {
        Set<Room> rooms = roomService.getAllRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }


    @PostMapping
    public String addRoom() {
        roomService.addNewRoom();
        return "redirect:";
    }

    @GetMapping("/{room_id}")
    public String getRoom(@PathVariable("room_id") Long id, Model model){
        Room room = roomService.getRoomById(id);
        model.addAttribute("room", room);
        return "rooms";
    }

    @DeleteMapping("/{room_id}")
    public String deleteRoom(@PathVariable("room_id") Long id) {
        roomService.deleteRoomById(id);
        return "redirect:";
    }
}
