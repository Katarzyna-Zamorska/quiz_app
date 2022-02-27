package com.sda.quizapp.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "quiz_answer_resolved")
public class QuizAnswerResolved extends TimestampedEntity {

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuizResolved quizResolved;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuizAnswer quizAnswer;
}
