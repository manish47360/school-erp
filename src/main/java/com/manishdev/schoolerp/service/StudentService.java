package com.manishdev.schoolerp.service;

import com.manishdev.schoolerp.model.dto.StudentDTO;
import com.manishdev.schoolerp.model.entity.Student;
import com.manishdev.schoolerp.repository.StudentRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRecordRepository repository;

    public Student save(StudentDTO dto) {
        Student student = new Student(dto);
        Student saved = repository.save(student);
        return saved;
    }
    public StudentDTO findId(long id){
        Student byId = repository.findById(id).orElseThrow();
        return new StudentDTO(byId);
    }
    public List<StudentDTO> findByClazz(String clazz){
        List<StudentDTO> byClazz = repository.findByClas(clazz).stream().map(StudentDTO::new).toList();
        return byClazz;
    }
}
