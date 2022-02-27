package com.sda.quizapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quiz_resolved")
public class QuizResolved extends BaseEntity {

    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyy@HH:mm")
    @NotNull
    private LocalDateTime start;

    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyy@HH:mm")
    @NotNull
    private LocalDateTime finished;

    @Embedded
    private Person person;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Quiz quiz;

    @OneToMany(mappedBy = "quizResolved")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<QuizAnswerResolved> quizAnswerResolved;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User creator;
}
