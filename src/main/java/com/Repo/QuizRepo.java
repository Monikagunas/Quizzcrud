package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Quiz;
@Repository
public interface QuizRepo  extends JpaRepository<Quiz, Integer> {} 
	
