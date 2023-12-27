package org.example.fizzBuzz;

public class FizzComponent extends Component{
    FizzComponent next;
    @Override
    public String handle(int i) {
        if(i % 3 == 0) {
            setNext(new FizzChecker());
            return checkNext(i);

        }
        return super.checkNext(i);
    }

    public void setNext(FizzComponent next) {
        this.next = next;
    }

    @Override
    public String checkNext(int i) {
        if(next == null) {
            return super.checkNext(i);
        }
        return next.handle(i);
    }

}
