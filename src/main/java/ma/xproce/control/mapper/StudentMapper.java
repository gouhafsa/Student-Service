package ma.xproce.control.mapper;

import ma.xproce.control.dto.StudentDTO;
import ma.xproce.control.entities.Student;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class StudentMapper {
    private final ModelMapper modelMapper =new ModelMapper();


    public StudentDTO toDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }

    public Student toEntity(StudentDTO studentDTO) {
        return modelMapper.map(studentDTO, Student.class);
    }
}
