package com.example.userservice.messaging;

import com.example.userservice.payload.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEventProducer {
//    private final RabbitTemplate rabbitTemplate;
//
//    public void userCreatedEvent(UserDTO userDTO){
//        rabbitTemplate.convertAndSend("user-queue",userDTO);
//    }
}
