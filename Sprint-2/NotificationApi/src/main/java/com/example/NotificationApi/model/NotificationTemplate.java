package com.example.NotificationApi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class NotificationTemplate {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private final UUID ID ;
    @NonNull
    @Column(name="subject")
    private String subject;
    @NonNull
    @Column(name="content")
    private String content;
    @NonNull
    @Column(name="language")
    private NotificationLanguage language;
    @NonNull
    @Column(name="type")
    private NotificationType notificationType;

    public NotificationTemplate(@JsonProperty("id") UUID ID,@JsonProperty("subject") String subject ,@JsonProperty("content") String content ,@JsonProperty("language") NotificationLanguage language ,@JsonProperty("type") NotificationType notificationType){

        this.ID = ID;
        this.subject=subject;
        this.content=content;
        this.language=language;
        this.notificationType=notificationType;
    }

    public NotificationTemplate(UUID id) {

        ID = id;
    }

    public UUID getID(){
        return ID;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getContent(){
        return content;
    }
    public void setLanguage(NotificationLanguage language){
        this.language=language;
    }
    public NotificationLanguage getLanguage(){
        return language;
    }
    public void setNotificationType(NotificationType notificationType){
        this.notificationType=notificationType;
    }
    public NotificationType getNotificationType(){
        return notificationType;
    }
}