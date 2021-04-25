package com.todo.userlistener.listener;

import com.todo.userlistener.models.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserListener {

    @KafkaListener(topics = "UserTopic", groupId = "user_group")
    public void consumeUser(List<User> user) {
        System.out.println("Consumed user : " + user);
    }
}
