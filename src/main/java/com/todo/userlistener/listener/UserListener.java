package com.todo.userlistener.listener;

import com.todo.userlistener.models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mahesh Bansode
 */
@Service
public class UserListener {
    private static final Logger logger = LogManager.getLogger(UserListener.class);

    /**
     * Listens to the event produced by todo-demo-api
     * @param user
     */
    @KafkaListener(topics = "UserTopic", groupId = "user_group")
    public void consumeUser(List<User> user) {
        logger.info("User consumed : " + user);
    }
}
