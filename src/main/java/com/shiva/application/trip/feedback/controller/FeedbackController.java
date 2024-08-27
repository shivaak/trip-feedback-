package com.shiva.application.trip.feedback.controller;


import com.shiva.application.trip.feedback.model.Feedback;
import com.shiva.application.trip.feedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/feedback")
    public String showForm() {
        return "feedback-form";
    }

    @PostMapping("/feedback")
    public String submitForm(
        @RequestParam(value = "name", required = false) String name,
        @RequestParam("good") String good,
        @RequestParam("bad") String bad,
        @RequestParam("suggestions") String suggestions,
        @RequestParam("next_trip") String nextTrip,
        @RequestParam("when") String when,
        Model model
    ) {
        Feedback feedback = new Feedback();
        feedback.setName(name);
        feedback.setGood(good);
        feedback.setBad(bad);
        feedback.setSuggestions(suggestions);
        feedback.setNextTrip(nextTrip);
        feedback.setTripWhen(when);
        
        feedbackRepository.save(feedback);
        model.addAttribute("message", "Feedback submitted successfully!");
        return "feedback-form";
    }
}
