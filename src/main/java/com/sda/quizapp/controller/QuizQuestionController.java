package com.sda.quizapp.controller;

import com.sda.quizapp.DTO.QuizQuestionDTO;
import com.sda.quizapp.model.QuizQuestion;
import com.sda.quizapp.service.QuizQuestionServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuizQuestionController {

    private final QuizQuestionServiceImplementation quizQuestionService;

    //pobieranie
    @GetMapping()
    public List<QuizQuestionDTO> getQuizQuestions() {
        return quizQuestionService.getQuizQuestions();

    }

    //wstawianie
    @PutMapping()
    public QuizQuestion putQuizQuestion(@RequestBody QuizQuestionDTO quizQuestionDTO) {
        return quizQuestionService.putQuizQuestion(quizQuestionDTO);
    }

    //usuwanie
    @DeleteMapping("/{id}")
    public void deleteQuizQuestion(@PathVariable Long id) {
        quizQuestionService.getQuizQuestions().remove(id);

    }
//
//    //aktualizacja, edycja
//    @PatchMapping("/{id}")
//    public QuizQuestion updateQuizQuestion(@PathVariable Long id) {
//        return quizQuestionService.getQuizQuestions().;
//    }


}
