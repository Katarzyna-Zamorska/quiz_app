package com.sda.quizapp.service;

import com.sda.quizapp.DTO.QuizQuestionDTO;
import com.sda.quizapp.model.QuizQuestion;

import java.util.List;

public interface QuizQuestionService {

    List<QuizQuestionDTO> getQuizQuestions();

    QuizQuestion putQuizQuestion(QuizQuestionDTO quizQuestionDTO);

}