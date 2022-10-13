package com.manishdev.schoolerp.model.entity;

import com.manishdev.schoolerp.model.dto.StudentDTO;
import lombok.*;

import javax.persistence.*;

@Table(name= "student")
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "class")
    private String clas;
    @Column(name ="roll_number")
    private int rollNumber;

    public Student(StudentDTO dto) {
        setName(dto.getName());
        setClas(dto.getClazz());
        setRollNumber(dto.getRollNumber());
    }

}
