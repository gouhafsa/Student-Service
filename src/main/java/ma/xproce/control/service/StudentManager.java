package ma.xproce.control.service;

import ma.xproce.control.dao.StudentRepository;
import ma.xproce.control.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentManager implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentManager(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentsByDateNaissance(LocalDate date) {
        return studentRepository.findByDateNaissance(date);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
