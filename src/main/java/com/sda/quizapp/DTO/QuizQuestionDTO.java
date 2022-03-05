package com.sda.quizapp.DTO;

import com.sda.quizapp.model.QuizQuestion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuizQuestionDTO  extends BaseDTO {

    private String contents;
    private int numberOfPointsForTheCorrectAnswer;


    public static QuizQuestionDTO mapFromQuizQuestion( QuizQuestion quizQuestion) {

        return QuizQuestionDTO.builder()
                .//jak tu pobrać id?
                .contents(quizQuestion.getContents())
                .numberOfPointsForTheCorrectAnswer(quizQuestion.getNumberOfPointsForTheCorrectAnswer())
                .build();
    }

}



