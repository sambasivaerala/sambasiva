package com.java.collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection2 {
	private Set<String> QuestionId;
	private Map<String, String> Questions;
	private List< String> Answers;
	public Set<String> getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(Set<String> questionId) {
		QuestionId = questionId;
	}
	public Map<String, String> getQuestions() {
		return Questions;
	}
	public void setQuestions(Map<String, String> questions) {
		Questions = questions;
	}
	public List<String> getAnswers() {
		return Answers;
	}
	public void setAnswers(List<String> answers) {
		Answers = answers;
	}
	@Override
	public String toString() {
		return "Collection2 [QuestionId=" + QuestionId + ", Questions=" + Questions + ", Answers=" + Answers + "]";
	}
	
	
	
	
	
}
