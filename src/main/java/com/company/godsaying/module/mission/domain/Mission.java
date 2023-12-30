package com.company.godsaying.module.mission.domain;

import com.company.godsaying.module.field.domain.Field;
import com.company.godsaying.module.user.domain.Avatar;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "avatar_id")
    private Avatar avatar;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "field_id")
    private Field field;
    private String subject;
    private String content;
    @Column(name = "deadline_sec")
    private Long deadlineSecond;
    private int level;
    private String reward;
    private String penalty;
    private String completionCriteria;

}
