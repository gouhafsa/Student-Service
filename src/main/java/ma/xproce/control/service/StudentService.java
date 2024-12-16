package ma.xproce.control.service;

import ma.xproce.control.entities.Student;

import java.time.LocalDate;
import java.util.List;

public interface StudentService {
    // Méthode pour sauvegarder un étudiant
    Student saveStudent(Student student);

    // Méthode pour récupérer les étudiants par date de naissance
    List<Student> getStudentsByDateNaissance(LocalDate dateNaissance);

    // Méthode pour récupérer tous les étudiants
    List<Student> getAllStudents();
}