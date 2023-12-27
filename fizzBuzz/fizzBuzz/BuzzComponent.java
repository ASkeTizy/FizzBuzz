package org.example.fizzBuzz;

public class BuzzComponent extends Component{
    BuzzComponent next;
    @Override
    public String handle(int i) {
        if(i % 5 == 0) {
            setNext(new BuzzChecker());
            return checkNext(i);
        }
        return super.checkNext(i);
    }

    public void setNext(BuzzComponent next) {
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
