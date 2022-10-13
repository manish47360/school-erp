package com.manishdev.schoolerp.model.dto;

import com.manishdev.schoolerp.model.entity.Student;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDTO {
    private Long id;
    private String name;
    private String clazz;
    private int rollNumber;

    public StudentDTO(Student student) {
        setId(student.getId());
        setName(student.getName());
        setClazz(student.getClas());
        setRollNumber(student.getRollNumber());
    }
}
