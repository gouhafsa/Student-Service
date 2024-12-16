package ma.xproce.control.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDTO {
    private String name;

    private String email;

    private LocalDate dateNaissance;
}
