package com.company.godsaying.module.user.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@DynamicUpdate
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private String userId;
    //    @ElementCollection(fetch = FetchType.LAZY)
//    @CollectionTable(name = "avatar", joinColumns = @JoinColumn(name = "user_id"))
    @OneToMany(mappedBy = "avatar", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Avatar> avatars;
    private String password;
    private int passwordExpired;
    private String name;
    private String email;
    /**
     * 계좌번호
     */
    private String accountNumber;
    private LocalDateTime accountExpiredTime;
    private String profileImage;
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;


}
