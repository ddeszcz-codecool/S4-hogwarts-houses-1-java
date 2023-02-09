package com.codecool.hogwartshouses.repositories.DAO;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.model.types.PetType;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class RoomMemory implements RoomDAO {

    private final Set<Room> rooms;
    private final StudentDAO studentDAO;

    public RoomMemory(Set<Room> rooms, StudentDAO studentDAO) {
        this.rooms = rooms;
        this.studentDAO = studentDAO;
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

    @Override
    public Set<Room> getAvailableRooms() {
        Set<Room> availableRooms = new HashSet<>();
        for (Room room:rooms) {
            int numberOfStudentsCurrentlyInRoom = List.copyOf(studentDAO.getAllStudents())
                    .stream().filter(s -> s.getRoomIdForStudent() == room.getId()).collect(Collectors.toList()).size();
            if(numberOfStudentsCurrentlyInRoom < room.getCapacity()){
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    @Override
    public Set<Room> getAvailableRoomsForRatOwners() {
        Set<Room> availableRoomsForRatOwners = new HashSet<>();
        for (Room room:rooms) {
            List<Student> studentsHousedInRoom = List.copyOf(studentDAO.getAllStudents())
                    .stream().filter(s -> s.getRoomIdForStudent() == room.getId()).collect(Collectors.toList());

            if(petsDangerousForRats(studentsHousedInRoom)==0){
                availableRoomsForRatOwners.add(room);
            }
        }
        return availableRoomsForRatOwners;
    }


    public int petsDangerousForRats(List<Student> studentsHousedInRoom){
        int petsDangerousForRats = 0;
        for (Student student:studentsHousedInRoom) {
            if(student.getPetType().equals(PetType.CAT) || student.getPetType().equals(PetType.OWL)){
                petsDangerousForRats++;
            }
        }
        return petsDangerousForRats;

    }
}
