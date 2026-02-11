package com.smartcampus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.smartcampus.entity.Feedback;
import com.smartcampus.repository.FeedbackRepository;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin
public class FeedbackController {

    @Autowired
    private FeedbackRepository repository;

    @PostMapping
    public Feedback submit(@RequestBody Feedback feedback) {
        return repository.save(feedback);
    }

    @GetMapping
    public List<Feedback> getAll() {
        return repository.findAll();
    }
}
