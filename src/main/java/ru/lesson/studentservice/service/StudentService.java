package ru.lesson.studentservice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import ru.lesson.studentservice.entity.Student;
import ru.lesson.studentservice.repository.StudentRepository;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public Student save(Student student) {
       return studentRepository.save(student);
    }
}
