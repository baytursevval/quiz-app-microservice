package com.sevval.quiz_service.controller;


import com.sevval.quiz_service.model.QuestionWrapper;
import com.sevval.quiz_service.model.QuizDto;
import com.sevval.quiz_service.model.Response;
import com.sevval.quiz_service.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){

        return quizService.createQuiz(quizDto.getCategoryName(), quizDto.getNumQuestions(), quizDto.getTitle());
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuestions(@PathVariable Integer id ){

        return quizService.getQuizQuestions(id);

    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Response> responses){

        return quizService.calculateResult(id, responses);

    }
}
