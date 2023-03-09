package com.resourceloop.notification.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resourceloop.notification.Model.Notification;

public interface INotificationRepository extends JpaRepository<Notification,Long> {

    public List<Notification> findByUserId(Long userId);

    
}

