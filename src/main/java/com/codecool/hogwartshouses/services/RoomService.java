package com.codecool.hogwartshouses.services;

import com.codecool.hogwartshouses.services.DAO.RoomDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomDAO roomDAO;

}
