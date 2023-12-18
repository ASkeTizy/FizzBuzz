package org.example.fizzBuzz;

public class FizzComponent extends Component{
    @Override
    public String handle(int i) {
        if(i % 3 == 0) {
            return  "Fizz";
        }
        return checkNext(i);
    }
}
