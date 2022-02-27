package com.sda.quizapp.reporitories;

import com.sda.quizapp.model.QuizResolved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizResolvedRepository extends JpaRepository<QuizResolved, Long> {

    List<QuizResolved> findByPerson_LastnameOrPerson_Email(String text);

}
