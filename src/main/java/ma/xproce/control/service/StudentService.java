package ma.xproce.control.service;

import ma.xproce.control.entities.Student;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    List<Student> getStudentsByDateNaissance(LocalDate date);

    Student saveStudent(Student student);
}
