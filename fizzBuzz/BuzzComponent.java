package org.example.fizzBuzz;

public class BuzzComponent extends Component{
    @Override
    public String handle(int i) {
        if(i % 5 == 0) {
            return "Buzz";
        }
        return checkNext(i);
    }
}
