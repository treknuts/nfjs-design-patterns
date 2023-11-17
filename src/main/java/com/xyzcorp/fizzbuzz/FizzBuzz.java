package com.xyzcorp.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static String convert(Integer n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return n.toString();
        }
    }

    // Do fizz_buzz up to n
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).boxed().map(FizzBuzz::convert).forEach(System.out::println);
    }

}
