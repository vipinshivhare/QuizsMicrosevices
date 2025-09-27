package com.quiz.services.impl;

import com.quiz.entities.Quiz;
import com.quiz.repository.QuizRepository;
import com.quiz.services.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService {

    private QuizRepository quizRepository;

//    private QuestionClient questionClient;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
//        List<Quiz> quizzes = quizRepository.findAll();

//        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
//            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
//            return quiz;
//        }).collect(Collectors.toList());
//
//        return newQuizList;
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id)
                .orElseThrow(
                        ()-> new RuntimeException("Quiz is not there")
                );

//        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
//        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
//        return quiz;
    }
}

