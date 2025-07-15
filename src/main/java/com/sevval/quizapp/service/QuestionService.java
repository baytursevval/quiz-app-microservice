package com.sevval.quizapp.service;

import com.sevval.quizapp.dao.QuestionDao;
import com.sevval.quizapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;


    public List<Question> getAllQuestions() {

        return questionDao.findAll();

    }
}
