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
	@Table(name="Quizzes")
	public class Quiz {
		
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int quizId;
	    @Column(name="Title")
	    private String title;
	    @OneToMany
	    @Column(name="Question")
	    private List<Question> questions;
		public int getquizId() {
			return quizId;
		}
		public void setquizId(int quizId) {
			this.quizId = quizId;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public List<Question> getQuestions() {
			return questions;
		}
		public void setQuestions(List<Question> questions) {
			this.questions = questions;
		}

	   
	}

	


