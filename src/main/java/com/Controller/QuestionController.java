package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Model.Question;
import com.ServiceImpl.QuestionServiceImpl;
import java.util.List;

	@RestController
	@RequestMapping("/questions")
	public class QuestionController {
	    @Autowired
	    private QuestionServiceImpl questionServiceImpl;

	    @GetMapping
	    public List<Question> getAllQuestions() {
	        return questionServiceImpl.getAllQuestions();
	    }

	    @GetMapping("/{id}")
	    public Question getQuestionById(@PathVariable int id) {
	        return questionServiceImpl.getQuestionById(id);
	    }

	    @PostMapping
	    public Question createQuestion(@RequestBody Question question) {
	        return questionServiceImpl.saveQuestion(question);
	    }

	    @PutMapping("/{id}")
	    public Question updateQuestion(@PathVariable int id, @RequestBody Question questionDetails) {
	        return questionServiceImpl.updateQuestion(id, questionDetails);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteQuestion(@PathVariable int id) {
	        questionServiceImpl.deleteQuestion(id);
	    }
	}



