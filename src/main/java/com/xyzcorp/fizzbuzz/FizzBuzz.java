package com.xyzcorp.fizzbuzz;

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
    public static void run(Integer n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(convert(i));
        }
    }

}
