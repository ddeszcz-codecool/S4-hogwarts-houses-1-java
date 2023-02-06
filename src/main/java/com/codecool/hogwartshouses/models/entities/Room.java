package com.codecool.hogwartshouses.models.entities;

import com.codecool.hogwartshouses.models.types.HouseType;
import com.codecool.hogwartshouses.models.types.PetType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue
    @Column(name = "room_id", nullable = false)
    private Long id;


    private HouseType houseType;
    private Student student;
    private PetType petType;



}
