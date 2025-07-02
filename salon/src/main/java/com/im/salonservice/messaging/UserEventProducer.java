package com.im.salonservice.messaging;

import com.im.salonservice.payload.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEventProducer {
//    private final RabbitTemplate rabbitTemplate;

    public void userCreatedEvent(UserDTO userDTO){
        System.out.println("rabbit mq");
    }
}
