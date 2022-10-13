package com.manishdev.schoolerp.repository;

import com.manishdev.schoolerp.model.dto.StudentDTO;
import com.manishdev.schoolerp.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRecordRepository extends JpaRepository<Student, Long> {

    List<Student> findByClas(String clazz);

}
