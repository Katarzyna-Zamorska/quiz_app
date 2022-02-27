package com.sda.quizapp.reporitories;

import com.sda.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    Set<Quiz> findByTitleContains(String text);

}
