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
    CommandLineRunner initDatabase(StudentService studentService) {
        return args -> {
            studentService.saveStudent(new Student(null, "Hafsa", "hafsa@gmail.com", LocalDate.of(2000, 1, 15)));
            studentService.saveStudent(new Student(null, "Yasmine", "yasmine@gmail.com", LocalDate.of(1998, 6, 20)));
            studentService.saveStudent(new Student(null, "Mohamed", "mohamed@gmail.com", LocalDate.of(2001, 3, 10)));
            studentService.saveStudent(new Student(null, "Meriem", "meriem@gmail.com", LocalDate.of(1999, 8, 25)));

            System.out.println("Étudiants ajoutés avec succès dans la base de données.");
        };
    }

}
