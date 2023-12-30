package com.company.godsaying.module.notification.domain;

import com.company.godsaying.module.mission.domain.Mission;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;
    private long senderId;
    private long receiverId;
    private String subject;
    private String content;
    private String type;
    private boolean isRead;
    private int progressRate;



}
