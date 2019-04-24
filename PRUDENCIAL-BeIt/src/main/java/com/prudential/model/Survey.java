package com.prudential.model;

import com.prudential.model.Survey;

public class Survey {
	private String productId;
	private String surveryQuestion;
	private String userAnswer;
	private String surveyText;
	public String getSurveyText() {
		return surveyText;
	}
	public void setSurveyText(String surveyText) {
		this.surveyText = surveyText;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getSurveryQuestion() {
		return surveryQuestion;
	}
	public void setSurveryQuestion(String surveryQuestion) {
		this.surveryQuestion = surveryQuestion;
	}
	public String getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((surveryQuestion == null) ? 0 : surveryQuestion.hashCode());
		result = prime * result + ((surveyText == null) ? 0 : surveyText.hashCode());
		result = prime * result + ((userAnswer == null) ? 0 : userAnswer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Survey other = (Survey) obj;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (surveryQuestion == null) {
			if (other.surveryQuestion != null)
				return false;
		} else if (!surveryQuestion.equals(other.surveryQuestion))
			return false;
		if (surveyText == null) {
			if (other.surveyText != null)
				return false;
		} else if (!surveyText.equals(other.surveyText))
			return false;
		if (userAnswer == null) {
			if (other.userAnswer != null)
				return false;
		} else if (!userAnswer.equals(other.userAnswer))
			return false;
		return true;
	}
}
