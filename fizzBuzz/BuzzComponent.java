package org.example.fizzBuzz;

public class BuzzComponent extends Component{
    @Override
    public boolean handle(int i) {
        if(i % 5 == 0) {
            System.out.println("Buzz");
            return true;
        }
        return checkNext(i);
    }
}
