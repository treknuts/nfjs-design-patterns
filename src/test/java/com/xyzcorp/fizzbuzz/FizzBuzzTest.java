package com.xyzcorp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    //ZOMBIES
    //Zero
    //One
    //Many
    //Boundary
    //Interface
    //Exceptions
    //Simplicity
    FizzBuzz app = new FizzBuzz();

    @Test
    void testFizzBuzzOne() {
        String result = FizzBuzz.convert(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    void testFizzBuzzTwo() {
        String result = FizzBuzz.convert(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    void testFizzBuzzThree() {
        String result = FizzBuzz.convert(3);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void testFizzBuzzFive() {
        String result = FizzBuzz.convert(5);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void testFizzBuzzFifteen() {
        String result = FizzBuzz.convert(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}
