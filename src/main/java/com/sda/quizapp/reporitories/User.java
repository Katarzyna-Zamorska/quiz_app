package com.sda.quizapp.reporitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface User extends JpaRepository<User, Long> {


}
