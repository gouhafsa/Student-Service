package ma.xproce.control;

import ma.xproce.control.entities.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ma.xproce.control.service.StudentService;

import java.time.LocalDate;

@SpringBootApplication
public class ControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControlApplication.class, args);
    }
    @Bean
    CommandLineRunner start(StudentService studentService) {
        return args -> {
            studentService.saveStudent(new Student(null, "Hafsa", "Hafsa@gmail.com", LocalDate.of(2000, 1, 15)));
            studentService.saveStudent(new Student(null, "Ali", "Ali@gmail.com", LocalDate.of(1998, 6, 20)));
            studentService.saveStudent(new Student(null, "Yasmine", "Yasmine@gmail.com", LocalDate.of(2001, 3, 10)));
            studentService.saveStudent(new Student(null, "Meriem", "Meriem@gmail.com", LocalDate.of(1999, 8, 25)));
        };
    }

}
