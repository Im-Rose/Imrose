package com.personalitychecker.controller;

import com.personalitychecker.model.AnswerRequest;
import com.personalitychecker.model.PersonalityResult;
import com.personalitychecker.model.Question;
import com.personalitychecker.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    // Endpoint to get all quiz questions
    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return quizService.getQuestions();
    }

    // Endpoint to submit answers and get personality result
    @PostMapping("/submit")
    public ResponseEntity<PersonalityResult> submitAnswers(@RequestBody AnswerRequest request) {
        PersonalityResult result = quizService.getFullPersonalityResult(request.getAnswers());
        return ResponseEntity.ok(result);
    }
}
