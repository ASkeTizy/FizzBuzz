package org.example.fizzBuzz;

public class FizzChecker extends Component{
    @Override
    public Message handle(Message i) {
        if( i.getCommand().equals("Fizz") && i.getValue() % 5 == 0) {
            return new Message(i.getValue(), "FizzBuzz");
        }
        return checkNext(i);
    }
}
