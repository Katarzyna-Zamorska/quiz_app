package com.sda.quizapp.service;

import com.sda.quizapp.DTO.QuizQuestionDTO;
import com.sda.quizapp.model.QuizQuestion;
import com.sda.quizapp.reporitories.QuizQuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import springfox.documentation.swagger2.mappers.ModelMapper;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizQuestionServiceImplementation implements QuizQuestionService{
    private final QuizQuestionRepository quizQuestionRepository;
    private final ModelMapper modelMapper;


    public List<QuizQuestionDTO> getQuizQuestions(){
       return  null;


    }


    @Override
    public QuizQuestion putQuizQuestion(QuizQuestionDTO quizQuestionDTO){
      QuizQuestion newQuizQuestion = QuizQuestion.builder()
              .contents(quizQuestionDTO.getContents())
              .numberOfPointsForTheCorrectAnswer(quizQuestionDTO.getNumberOfPointsForTheCorrectAnswer())
              .build();
      return quizQuestionRepository.save(newQuizQuestion);
    }
}
