package com.ServiceImpl;


import org.springframework.beans.factory.annotation.Autowired;


import com.Model.Quiz;

import com.Repo.QuizRepo;

import java.util.List;

	public class QuizServiceImpl {
	    @Autowired
	    private QuizRepo quizRepo;

	    public List<Quiz> getAllQuizzes() {
	        return quizRepo.findAll();
	    }

	    public Quiz getQuizById(int quizId) {
	        return quizRepo.findById(quizId).orElse(null);
	    }

	    public Quiz saveQuiz(Quiz quiz) {
	        return quizRepo.save(quiz);
	    }

	    public Quiz updateQuiz(int quizId, Quiz quizDetails) {
	        Quiz quiz = quizRepo.findById(quizId).orElse(null);
	        if (quiz != null) {
	            quiz.setTitle(quizDetails.getTitle());
	            quiz.setQuestions(quizDetails.getQuestions());
	            return quizRepo.save(quiz);
	        }
	        return null;
	    }

	    public void deleteQuiz(int quizId) {
	        quizRepo.deleteById(quizId);
	    }
	}



