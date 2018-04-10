package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGame {
    public FizzBuzzGame(int FizzNumber, int BuzzNumber, int WhizzNumber) {
        this.FizzNumber = FizzNumber;
        this.BuzzNumber = BuzzNumber;
        this.WhizzNumber = WhizzNumber;
    }

    public FizzBuzzGame() {
    }

    private List<String> results = new ArrayList<>();
     int FizzNumber = 3;
     int BuzzNumber = 5;
     int WhizzNumber = 7;

    public void start(int count) {
        for(int i = 1; i <= count; i++){
            results.add(translate(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String translate(int number) {
        if(new Integer(number).toString().contains(new Integer(FizzNumber).toString()))
            return "Fizz";
        if(number % FizzNumber == 0 || number % BuzzNumber == 0 || number % WhizzNumber == 0)
            return HandleTranslationForMultipleCases(number);
        return new Integer(number).toString();
    }

    private String HandleTranslationForMultipleCases(int number) {
        String output = "";
        if(number % FizzNumber == 0)
            output += "Fizz";
        if(number % BuzzNumber == 0)
            output += "Buzz";
        if(number % WhizzNumber == 0)
            output += "Whizz";
        return output;
    }
}


