package org.example.fizzBuzz;

public class BuzzChecker extends Component{
    @Override
    public Message handle(Message i) {
        if(i.getCommand().equals("Buzz") && i.getValue() % 3 == 0) {
            return new Message(i.getValue(),"FizzBuzz" );
        }
        return checkNext(i);
    }
}
