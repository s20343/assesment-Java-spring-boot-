package com.example.primenumapp.controller;

import com.example.primenumapp.model.PrimeForm;
import com.example.primenumapp.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrimeController {

    private final PrimeService primeService;

    @Autowired
    public PrimeController(PrimeService primeService) {
        this.primeService = primeService;
    }

    @GetMapping("/calculate")
    public String showForm(Model model) {
        model.addAttribute("primeForm", new PrimeForm());
        return "index";
    }

    @PostMapping("/calculate")
    public String calculatePrimes(PrimeForm primeForm, Model model) {
        int upperBound = primeForm.getUpperBound();
        primeForm.setPrimes(primeService.calculatePrimes(upperBound));
        model.addAttribute("primeForm", primeForm);

        return "index";
    }


}
