package ru.lesson.studentservice.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lesson.studentservice.entity.Student;
import ru.lesson.studentservice.service.StudentService;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    @PostMapping("/save")
    public Student getStudent(@RequestBody @Valid Student student) {
     return studentService.save(student);
    }

}
