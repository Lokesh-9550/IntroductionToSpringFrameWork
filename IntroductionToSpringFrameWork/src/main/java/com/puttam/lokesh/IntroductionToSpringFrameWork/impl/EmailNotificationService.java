package com.puttam.lokesh.IntroductionToSpringFrameWork.impl;

import com.puttam.lokesh.IntroductionToSpringFrameWork.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Email Notification Service: " + message);
    }
}
