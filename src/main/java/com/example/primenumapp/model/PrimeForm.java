package com.example.primenumapp.model;

import java.util.List;

public class PrimeForm {
    private int upperBound;
    private List<Integer> primes;
    private String errorMessage;

    public PrimeForm() {
        // Default constructor
    }


    public PrimeForm(int upperBound) {
        this.upperBound = upperBound;

    }

    public PrimeForm(int upperBound, List<Integer> primes) {
        this.upperBound = upperBound;
        this.primes = primes;
    }

    public PrimeForm(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

    public List<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
