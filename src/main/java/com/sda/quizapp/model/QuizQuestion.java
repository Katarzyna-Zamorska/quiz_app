package com.sda.quizapp.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "list_of_quiz_question")
public class QuizQuestion extends BaseEntity {

    @NotNull
    @NotBlank(message = "Contents is mandatory")
    private String contents;

    @Column(name = "number_of_points_for_the_correct_answer")
    @NotNull
    @NotBlank(message = "Number of points is mandatory")
    private int numberOfPointsForTheCorrectAnswer;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Quiz quiz;

    @OneToMany(mappedBy = "quizQuestion")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<QuizAnswer> quizAnswers;

}
