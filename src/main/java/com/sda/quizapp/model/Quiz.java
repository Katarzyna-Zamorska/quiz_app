package com.sda.quizapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "list_of_quizzes")
public class Quiz extends TimestampedEntity {

    private String title;
    private String description;
    private String asks;
    private String answers;

    @Column(name = "correct_answer")
    private String correctAnswer;

    @Column(name = "expiration_date")
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyyy@HH:mm")
    @NotNull
    private LocalDateTime expirationDateTime;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private User creator;

    @OneToMany(mappedBy = "quiz")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<QuizQuestion> quizQuestions;

    @OneToMany(mappedBy = "quiz")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<QuizResolved> quizResolveds;

}

