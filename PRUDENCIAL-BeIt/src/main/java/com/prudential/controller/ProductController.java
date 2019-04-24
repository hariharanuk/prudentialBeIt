package com.prudential.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.prudential.model.Survey;



@RestController
@Controller
public class ProductController {
	
	Map<String,String> productQuestion = new HashMap<>();
	List<Survey> ls = new ArrayList<>();
	
	//Save the admin question in map	
	@RequestMapping(value = "/saveQuestion", method = RequestMethod.POST)
	public void saveQuestion(@RequestParam("productId") String productId,@RequestParam("question") String question) {
		productQuestion.put(productId, question);		
	}
	
	//Save the admin question and user answer in survey model of arraylist
	@RequestMapping(value = "/saveAnswer", method = RequestMethod.POST)
	public void saveAnswer(@RequestParam("productId") String productId,@RequestParam("questionId") String questionId,@RequestParam("rating") String rating,@RequestParam("ratingText") String ratingText) {
		Survey survey = new Survey();
		survey.setProductId(productId);
		survey.setSurveryQuestion(questionId);
		survey.setUserAnswer(rating);
		survey.setSurveyText(ratingText);
		ls.add(survey);
	}
	
	//To get the list of all admin question and user answers
	@GetMapping("/getAnswer")
	public @ResponseBody List<Survey> getAnswer(){
		return ls;
	}
	
	// To get the list of admin question
	@GetMapping("/getQuestion")
	public @ResponseBody Map<String,String> getQuestion(){
		return productQuestion;
	}
	
}
