package org.example.fizzBuzz;

public class DefaultComponent extends Component{
    @Override
    public Message handle(Message i) {
        if (i.getCommand().isEmpty()) {

            return new Message(i.getValue(),i.getValue() + "");
        }
        return i;
    }
}
