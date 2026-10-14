package com.puttam.lokesh.IntroductionToSpringFrameWork.impl;

import com.puttam.lokesh.IntroductionToSpringFrameWork.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class SmsNotificationService implements NotificationService {
    public void send(String message) {
        System.out.println("SMS Notification Service: " + message);
    }
}
