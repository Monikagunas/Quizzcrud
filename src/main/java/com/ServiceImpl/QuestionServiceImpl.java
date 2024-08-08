package com.ServiceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.Model.Question;
import com.Repo.QuestionRepo;

	public class QuestionServiceImpl {
	    @Autowired
	    private QuestionRepo questionRepo;

	    public List<Question> getAllQuestions() {
	        return questionRepo.findAll();
	    }

	    public Question getQuestionById(int id) {
	        return questionRepo.findById(id).orElse(null);
	    }

	    public Question saveQuestion(Question question) {
	        return questionRepo.save(question);
	    }

	    public Question updateQuestion(int id, Question questionDetails) {
	        Question question = questionRepo.findById(id).orElse(null);
	        if (question != null) {
	            question.setQuestionText(questionDetails.getQuestionText());
	            question.setOptions(questionDetails.getOptions());
	            question.setCorrectAnswer(questionDetails.getCorrectAnswer());
	            return questionRepo.save(question);
	        }
	        return null;
	    }

	    public void deleteQuestion(int id) {
	        questionRepo.deleteById(id);
	    }
	}



