package org.example.fizzBuzz;

public class FizzComponent extends Component{
    @Override
    public boolean handle(int i) {
        if(i % 3 == 0) {
            System.out.println("Fizz");
            return  true;
        }
        return checkNext(i);
    }
}
