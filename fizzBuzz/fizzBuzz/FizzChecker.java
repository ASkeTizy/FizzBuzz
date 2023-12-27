package org.example.fizzBuzz;

public class FizzChecker extends FizzComponent{
    @Override
    public String handle(int i) {
        if(i % 5 == 0) {
            return "FizzBuzz";

        } else {
            return "Fizz";
        }

    }

}
