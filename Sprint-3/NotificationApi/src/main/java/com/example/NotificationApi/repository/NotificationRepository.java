package com.example.NotificationApi.repository;

import java.io.Serializable;
import com.example.NotificationApi.model.NotificationTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationTemplate, Serializable> {

}