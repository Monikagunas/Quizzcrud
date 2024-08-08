package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Model.Quiz;
import com.ServiceImpl.QuizServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private QuizServiceImpl quizServiceImpl;

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizServiceImpl.getAllQuizzes();
    }

    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable int quizId) {
        return quizServiceImpl.getQuizById(quizId);
    }

    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizServiceImpl.saveQuiz(quiz);
    }

    @PutMapping("/{id}")
    public Quiz updateQuiz(@PathVariable int quizId, @RequestBody Quiz quizDetails) {
        return quizServiceImpl.updateQuiz(quizId, quizDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteQuiz(@PathVariable int quizId) {
        quizServiceImpl.deleteQuiz(quizId);
    }
}



