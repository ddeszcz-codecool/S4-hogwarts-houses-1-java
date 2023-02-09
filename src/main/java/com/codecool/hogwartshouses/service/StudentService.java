package com.codecool.hogwartshouses.service;

import com.codecool.hogwartshouses.model.Room;
import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.repositories.DAO.RoomDAO;
import com.codecool.hogwartshouses.repositories.DAO.StudentDAO;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentService {

    private final StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public Set<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }


}
