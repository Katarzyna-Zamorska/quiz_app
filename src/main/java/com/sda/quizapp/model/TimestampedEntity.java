package com.sda.quizapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class TimestampedEntity extends BaseEntity {

    @Column(name = "creation_date")
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy@HH:mm")
    @NotNull
    private LocalDateTime creationDateTime;
}
