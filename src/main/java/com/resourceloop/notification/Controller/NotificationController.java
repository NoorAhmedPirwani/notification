package com.resourceloop.notification.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resourceloop.notification.Model.Notification;
import com.resourceloop.notification.Repository.INotificationRepository;


@RequestMapping("/notification")
@RestController
public class NotificationController {
    
    @Autowired
    private INotificationRepository repo;

    @PostMapping("/add")
    public void AddProduct(@RequestBody Notification n){
        repo.save(n);
    }

    @GetMapping("/all")
    public List<Notification> AllNotification(){
        return repo.findAll( );
    }

    @GetMapping("/{id}")
     public Notification getById(@PathVariable Long id){
        return repo.findById(id).orElse(null);
    }

    @GetMapping("/getbyuserid/{userId}")
    public List<Notification> getByUserId(@PathVariable Long userId){
       return repo.findByUserId(userId);
   }

}