package com.sda.quizapp.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lists_of_quiz_answer")
public class QuizAnswer extends BaseEntity {

    @NotNull
    @NotBlank(message = "Contents is mandatory")
    @Size(max = 500, message = "Content is too long")
    private String contents;

    @Column(name = "is_correct_Answer")
    @NotNull
    private boolean isCorrectAnswer;

    @ManyToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private QuizQuestion quizQuestion;

    @OneToMany(mappedBy = "quizAnswer")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<QuizAnswerResolved> quizAnswerResolveds;
}
