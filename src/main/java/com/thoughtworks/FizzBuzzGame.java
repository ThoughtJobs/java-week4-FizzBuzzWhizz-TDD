package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        for(int i = 1; i <= count; i++){
            results.add(translate(i));
        }
    }

    public List<String> getResults() {
        return results;
    }

    public String translate(int number) {
        if(new Integer(number).toString().contains("3"))
            return "Fizz";
        if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
            return "FizzBuzzWhizz";
        if(number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        if(number % 3 == 0 && number % 7 == 0)
            return "FizzWhizz";
        if(number % 5 == 0 && number % 7 == 0)
            return "BuzzWhizz";
        if(number % 3 == 0)
            return "Fizz";
        if(number % 5 == 0)
            return "Buzz";
        if(number % 7 == 0)
            return "Whizz";
        return new Integer(number).toString();
    }
}


