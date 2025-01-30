package ru.lesson.studentservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.lesson.studentservice.dto.UserCarDTO;
import ru.lesson.studentservice.entity.User;
import ru.lesson.studentservice.mapper.UserMapper;
import ru.lesson.studentservice.repository.UserRepository;


@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    public User save(UserCarDTO userCarDTO) {
        User user = userMapper.toUser(userCarDTO);
        return userRepository.save(user);

    }


}
