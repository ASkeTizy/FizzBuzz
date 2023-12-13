package org.example.fizzBuzz;

public class FizzBuzzComponent extends Component {
    public boolean handle(int i) {
        if(i % 5 == 0 && i % 3 == 0) {
            System.out.println("FizzBuzz");
            return true;
        }
        return checkNext(i);
    }
}
