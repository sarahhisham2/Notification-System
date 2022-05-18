package com.example.NotificationApi.dao;

import com.example.NotificationApi.model.NotificationTemplate;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface NotificationDao {
    int insertNotificationTemplate(UUID ID , NotificationTemplate notificationTemplate);
    default int insertNotificationTemplate(NotificationTemplate notificationTemplate){
        UUID id = UUID.randomUUID();
        return insertNotificationTemplate(id , notificationTemplate);
    }
    List<NotificationTemplate> selectNotificationTemplates();

    Optional<NotificationTemplate> selectNotification(UUID ID);

    int deleteNotificationTemplate(UUID ID);
    int updateNotificationTemplate(UUID ID , NotificationTemplate notificationTemplate);
}
