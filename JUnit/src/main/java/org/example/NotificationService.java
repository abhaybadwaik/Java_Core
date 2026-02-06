package org.example;

public class NotificationService {
    private EmailService emailService;

    NotificationService(EmailService emailService){
        this.emailService = emailService;
    }
    boolean notifyUser(){
        return emailService.sendMail("Hello");
    }
}
