package com.resourceloop.notification.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "notifications-table")

public class Notification {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    
    @Setter
    private Long userId;
    
    @Setter
    private Boolean isRead;
    
    @Setter
    private String notificationText;
    
    @Setter
    private String notificationLink;


}


