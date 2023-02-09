package com.codecool.hogwartshouses.repositories.DAO;


import com.codecool.hogwartshouses.model.Student;

import java.util.Set;

public interface StudentDAO {

    Set<Student> getAllStudents();

    void add(Student dracoMalfoy);
}
