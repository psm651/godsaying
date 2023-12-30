package com.company.godsaying.module.field.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "field")
@Getter
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
