package com.example.userservice.mapper;

import com.example.userservice.model.User;
import com.example.userservice.payload.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserDTO mapToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setFullName(user.getFullName());
        userDTO.setRole(String.valueOf(user.getRole()));

        return userDTO;
    }
}
