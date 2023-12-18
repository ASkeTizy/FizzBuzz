package org.example.fizzBuzz;

public class FizzBuzzComponent extends Component {
    public String handle(int i) {
        if(i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        }
        return checkNext(i);
    }
}
