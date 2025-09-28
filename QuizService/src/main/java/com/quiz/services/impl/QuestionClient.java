package com.quiz.services.impl;

import com.quiz.entities.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
// here we will change bcz we have to apply load balancer so this eureka will able to
// change preference as instance is working or healthy or free

//@FeignClient(url = "http://localhost:8082", value = "Question-Client")
//used before implement load balancing
@FeignClient(name = "QUESTION-SERVICE")

public interface QuestionClient {

    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionOfQuiz(@PathVariable("quizId") Long quizId);



}
