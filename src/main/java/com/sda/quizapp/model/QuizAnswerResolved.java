package com.sda.quizapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quiz_answer_resolved")
public class QuizAnswerResolved extends BaseEntity {

    @Column(name = "answer_date_time")
    @CreationTimestamp
    @JsonFormat(pattern = "dd-MM-yyy@HH:mm")
    @NotNull
    private LocalDateTime answerDateTime;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuizResolved quizResolved;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuizAnswer quizAnswer;
}
