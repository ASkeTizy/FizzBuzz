package org.example.fizzBuzz;

public class BuzzComponent extends Component{
    @Override
    public Message handle(Message i) {
        if(i.getValue() % 5 == 0) {
            return checkNext(new Message(i.getValue(),"Buzz") ) ;
        }
        return checkNext(i);
    }

}
