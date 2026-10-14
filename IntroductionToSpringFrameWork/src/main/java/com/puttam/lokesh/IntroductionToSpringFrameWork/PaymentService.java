package com.puttam.lokesh.IntroductionToSpringFrameWork;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Money is sending...");

    }
    @PostConstruct
    public void afterInit(){
        System.out.println("before Bean initialization...");
    }
    @PreDestroy
    public void afterDestroy(){
        System.out.println("after Bean destroy...");
    }

}
