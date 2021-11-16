package com.java.collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Collection3 {
	private List<String> QuestionId;
	private Map<Integer,String> Questions;
	private Set<String> Answers;
	public List<String> getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(List<String> questionId) {
		QuestionId = questionId;
	}
	public Map<Integer, String> getQuestions() {
		return Questions;
	}
	public void setQuestions(Map<Integer, String> questions) {
		Questions = questions;
	}
	public Set<String> getAnswers() {
		return Answers;
	}
	public void setAnswers(Set<String> answers) {
		Answers = answers;
	}
	public Collection3() {
		super();
		
	}
}
