package com.java.collection;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Collection {
	private List<String> QuestionId;
	private Set<String> Questions;
	private Map<Integer, String> Answers;
	public List<String> getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(List<String> questionId) {
		QuestionId = questionId;
	}
	public Set<String> getQuestions() {
		return Questions;
	}
	public void setQuestions(Set<String> questions) {
		Questions = questions;
	}
	public Map<Integer, String> getAnswers() {
		return Answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		Answers = answers;
	}
	public Collection() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Collection [QuestionId=" + QuestionId + ", Questions=" + Questions + ", Answers=" + Answers + "]";
	}
	
}
