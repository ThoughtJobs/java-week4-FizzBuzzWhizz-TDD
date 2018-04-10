package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {

    }

    public List<String> getResults() {
        return results;
    }

    public String translate(int number) {
        if(number == 3 || number % 3 == 0)
            return "Fizz";
        if(number == 5)
            return "Buzz";
        if(number == 7)
            return "Whizz";
        return null;
    }
}


