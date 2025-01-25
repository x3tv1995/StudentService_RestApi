package ru.lesson.studentservice.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lesson.studentservice.dto.UserCarDTO;
import ru.lesson.studentservice.entity.Car;
import ru.lesson.studentservice.entity.Student;
import ru.lesson.studentservice.entity.User;
import ru.lesson.studentservice.service.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    @PostMapping("/save") public User getUserAndForCarUser(@RequestBody UserCarDTO userCarDTO) {
        return userService.save(userCarDTO.getUser(), userCarDTO.getCar()); }






}
