package com.example.NotificationApi.dao;

import com.example.NotificationApi.model.NotificationTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("notificationDAO") //ths class is saved as a repo.
public class MemoryNotificationTemplateDataAccessLayer implements NotificationDao{
    private static List<NotificationTemplate> allTemplates = new ArrayList<>();



    @Override
    public int insertNotificationTemplate(UUID ID, NotificationTemplate notificationTemplate) {
        allTemplates.add(new NotificationTemplate(ID , notificationTemplate.getSubject() , notificationTemplate.getContent() , notificationTemplate.getLanguage() , notificationTemplate.getNotificationType()));
        return 1;
    }

    @Override
    public List<NotificationTemplate> selectNotificationTemplates() {
        return allTemplates;
    }

    @Override
    public Optional<NotificationTemplate> selectNotification(UUID ID) { //search
        return allTemplates.stream().filter(notificationTemplate -> notificationTemplate.getID().equals(ID)).findFirst();
    }

    @Override
    public int deleteNotificationTemplate(UUID ID) {
        Optional<NotificationTemplate> notificationTemplate = selectNotification(ID);
        if(notificationTemplate.isPresent()){
            allTemplates.remove(notificationTemplate.get());
            return 1;
        }
        return 0;
    }

    @Override
    public int updateNotificationTemplate(UUID ID, NotificationTemplate notificationTemplate) {
        return selectNotification(ID).map(notificationTemplate1 -> {
            int indexToDelete = allTemplates.indexOf(notificationTemplate1);
            if(indexToDelete>=0){
                allTemplates.set(indexToDelete , new NotificationTemplate(ID , notificationTemplate.getSubject() , notificationTemplate.getContent() , notificationTemplate.getLanguage() , notificationTemplate.getNotificationType()));
                return 1;
            }
            return 0;
        } ).orElse(0);
    }


}