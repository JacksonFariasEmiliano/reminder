package com.jkn.reminder.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;


@Entity
@Getter
@Builder
@AllArgsConstructor
@Table(name = "reminder")
public class Reminder implements Serializable {

    private static final long serialVersionUUID = 1l;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DATE")
    private Date date;

    protected Reminder(){
        //JPA /Hibernate
    }

    public Reminder (UUID id, String title, String description, Date date){
        Objects.requireNonNull(title);
        Objects.requireNonNull(description);
        Objects.requireNonNull(date);

        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
    }
}
