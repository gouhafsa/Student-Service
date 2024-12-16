package ma.xproce.control.web;

import ma.xproce.control.dto.StudentDTO;
import ma.xproce.control.entities.Student;
import ma.xproce.control.service.StudentService;
import ma.xproce.control.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class StudentGraphQLController {
    private final StudentService studentService;
    private final StudentMapper studentMapper;


    public StudentGraphQLController(StudentService studentService, StudentMapper studentMapper) {
        this.studentService = studentService;
        this.studentMapper = studentMapper;
    }

    @QueryMapping
    public List<StudentDTO> allStudents() {
        List<Student> students = studentService.getAllStudents();
        return students.stream().map(studentMapper::toDTO).toList();
    }

    @QueryMapping
    public List<StudentDTO> getStudentByDateNaissance(String date) {
        LocalDate localDate = LocalDate.parse(date);
        List<Student> students = studentService.getStudentsByDateNaissance(localDate);
        return students.stream().map(studentMapper::toDTO).toList();
    }

    @MutationMapping
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = studentMapper.toEntity(studentDTO);
        Student savedStudent = studentService.saveStudent(student);
        return studentMapper.toDTO(savedStudent);
    }

}
