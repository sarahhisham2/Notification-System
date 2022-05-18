package com.example.NotificationApi.services;

import com.example.NotificationApi.dao.NotificationDao;
import com.example.NotificationApi.model.NotificationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NotificationService {
    private final NotificationDao notificationDao;

    @Autowired //autowiring to the interface
    public NotificationService(@Qualifier("notificationDAO") NotificationDao notificationDao) { //injecting to the actual constructor
        this.notificationDao = notificationDao;
    }
    public int addNotificationTemplate(NotificationTemplate notificationTemplate){

        return notificationDao.insertNotificationTemplate(notificationTemplate);
    }

    public List<NotificationTemplate> getNotificationTemplates(){
        return notificationDao.selectNotificationTemplates();
    }

    public Optional<NotificationTemplate> getNotificationTemplate(UUID ID){
        return notificationDao.selectNotification(ID);
    }

    public int deleteNotificationTemplate(UUID ID){
        return notificationDao.deleteNotificationTemplate(ID);
    }

    public int updateNotificationTemplate(UUID ID , NotificationTemplate notificationTemplate){
        return notificationDao.updateNotificationTemplate(ID , notificationTemplate);
    }

}