package com.manishdev.schoolerp.controller;


import com.manishdev.schoolerp.model.dto.StudentDTO;
import com.manishdev.schoolerp.model.entity.Student;
import com.manishdev.schoolerp.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
      public final StudentService studentService;

      @PostMapping
      public ResponseEntity<Void> post(@RequestBody StudentDTO student, UriComponentsBuilder uriComponentsBuilder) {
            Student save = studentService.save(student);
            return ResponseEntity.created(uriComponentsBuilder.path("/students/{id}").build(save.getId())).build();
      }
      @GetMapping("/{id}/identity")
      public ResponseEntity<StudentDTO> get(@PathVariable long id){
         StudentDTO findId = studentService.findId(id);
         return ResponseEntity.ok(findId);
      }
      @GetMapping("/{clazz}")
      public ResponseEntity<List<StudentDTO>> getAll(@PathVariable String clazz){
            List<StudentDTO> findClazz = studentService.findByClazz(clazz);
            return ResponseEntity.ok(findClazz);
      }
}
