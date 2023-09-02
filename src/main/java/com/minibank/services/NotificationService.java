package com.minibank.services;

import com.minibank.dtos.NotificationDTO;
import com.minibank.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLOutput;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

//        ResponseEntity<String> notificationResponse = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationRequest, String.class);
//
//        if (notificationResponse.getStatusCode() == HttpStatus.OK) {
//            System.out.println("Error to try to send notification");
//            throw new Exception("Service unavailable");
//        }

        System.out.println("Notification has been sent to user");
    }
}
