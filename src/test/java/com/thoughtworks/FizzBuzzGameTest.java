package com.thoughtworks;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertEquals("Fizz", game.translate(3));
    }

    @Test
    public void should_return_Buzz_when_have_5() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertEquals("Buzz", game.translate(5));
    }
}
