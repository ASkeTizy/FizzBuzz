package org.example.fizzBuzz;

public class FizzComponent extends Component{
    @Override
    public Message handle(Message i) {
        if(i.getValue() % 3 == 0) {
            return  checkNext(new Message(i.getValue(),"Fizz"));
        }
        return checkNext(i);
    }
}
