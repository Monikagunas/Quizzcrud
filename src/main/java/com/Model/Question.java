package com.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

	@Entity
	@Table(name="Questions")
	public class Question {
	    @Id
	    @Column(name="QuestionId")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;
	    @Column(name="QuestionText")
	    private String questionText;
	    @OneToMany
	    private List<String> options;
	    @Column(name="CorrectOption")
	    private String correctAnswer;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestionText() {
			return questionText;
		}
		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public String getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}

	   
	}



