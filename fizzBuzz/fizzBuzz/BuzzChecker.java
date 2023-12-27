package org.example.fizzBuzz;

public class BuzzChecker extends BuzzComponent{
    @Override
    public String handle(int i) {
        if(i % 3 == 0) {
            return "FizzBuzz";

        } else {
            return "Buzz";
        }

    }
}
