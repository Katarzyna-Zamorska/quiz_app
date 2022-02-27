package com.sda.quizapp.reporitories;

import com.sda.quizapp.model.QuizAnswerResolved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizAnswerResolvedRepository extends JpaRepository<QuizAnswerResolved,Long> {
}
