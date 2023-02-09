package com.codecool.hogwartshouses.model;

import com.codecool.hogwartshouses.model.types.HouseType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private long id;

    @Column(name = "house_type")
    private HouseType houseType;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "room_name")
    private String roomName;


}
