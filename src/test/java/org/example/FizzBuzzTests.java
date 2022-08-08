package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    @Test
    @DisplayName("Given values is 3, then return Buzz")
    void givenValuesIs3ThenReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(3));
    }

    @Test
    @DisplayName("Given values is 5, then return Fizz")
    void givenValuesIs5ThenReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(5));

    }

    @Test
    @DisplayName("Given Values is divisible by 3 return Buzz")
    void givenValuesIsDivisibleBy3ReturnBuzz() {
        Assertions.assertEquals("Buzz", FizzBuzz.getValue(9));

    }

    @Test
    @DisplayName("Given Values is divisible by 5 return Fizz")
    void givenValuesIsDivisibleBy5ReturnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.getValue(20));

    }

    @Test
    @DisplayName("Given Values is divisible by both 3,9 return FizzBuzz")
    void givenValuesIsDivisibleByBoth39ReturnFizzBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.getValue(15));

    }

}
