package com.codecool.hogwartshouses.database_dump;

import com.codecool.hogwartshouses.model.Student;
import com.codecool.hogwartshouses.model.types.HouseType;
import com.codecool.hogwartshouses.repositories.DAO.StudentMemory;
import org.springframework.stereotype.Component;

@Component
public class StudentCreator {
    private final StudentMemory studentMemory;


    public StudentCreator(StudentMemory studentMemory) {
        this.studentMemory = studentMemory;
        createStudents();
    }

    private void createStudents() {
        Student hermioneGranger = new Student(101, "Hermione Granger", HouseType.GRYFFINDOR, 1L);
        Student hermioneGrangerTwinSister = new Student(101, "Hermione Twin Granger", HouseType.GRYFFINDOR, 1L);
        Student dracoMalfoy = new Student(102, "Draco Malfoy", HouseType.SLYTHERIN, 6L);
        studentMemory.add(hermioneGranger);
        studentMemory.add(hermioneGrangerTwinSister);
        studentMemory.add(dracoMalfoy);
    }


}
