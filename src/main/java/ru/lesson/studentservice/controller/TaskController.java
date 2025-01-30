package ru.lesson.studentservice.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.lesson.studentservice.dto.TaskDTO;
import ru.lesson.studentservice.entity.Task;
import ru.lesson.studentservice.repository.TaskRepository;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor

public class TaskController {
    private ModelMapper modelMapper = new ModelMapper();
    private final TaskRepository taskRepository;


    @PostMapping("/new")
    public Task postMapping(@RequestBody TaskDTO taskDTO) {
        System.out.println(taskDTO);
        Task task = modelMapper.map(taskDTO, Task.class);
        return taskRepository.save(task);

    }

}
