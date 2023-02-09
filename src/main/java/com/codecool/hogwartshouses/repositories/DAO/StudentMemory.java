package com.codecool.hogwartshouses.repositories.DAO;


import com.codecool.hogwartshouses.model.Student;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class StudentMemory implements StudentDAO{

    private final Set<Student> students;

    public StudentMemory(Set<Student> students) {
        this.students = students;
    }


    @Override
    public Set<Student> getAllStudents() {
        return this.students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }
}
