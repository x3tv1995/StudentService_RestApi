package ru.lesson.studentservice.mapper;

import org.springframework.stereotype.Component;
import ru.lesson.studentservice.dto.UserCarDTO;
import ru.lesson.studentservice.entity.User;

@Component
public class UserMapper {
    public User toUser(UserCarDTO userCarDTO) {
        User user = new User();
        user.setCars(userCarDTO.getCars());
        user.setAge(userCarDTO.getUser().getAge());
        user.setFirstName(userCarDTO.getUser().getFirstName());
        return user;
    }
}
