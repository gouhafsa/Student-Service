package ma.xproce.control.web;

import ma.xproce.control.dto.StudentInput;
import ma.xproce.control.entities.Student;
import ma.xproce.control.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.List;

@Controller
public class StudentGraphQLController {

    @Autowired
    private StudentService studentService;

    @QueryMapping
    public List<Student> getStudentByDateNaissance(@Argument String date) {
        return studentService.getStudentsByDateNaissance(LocalDate.parse(date));
    }


    @MutationMapping
    public Student saveStudent(@Argument StudentInput studentInput) {
        Student student = new Student(null, studentInput.getName(), studentInput.getEmail(), studentInput.getDateNaissance());
        return studentService.saveStudent(student);
    }
}