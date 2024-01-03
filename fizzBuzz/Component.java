package org.example.fizzBuzz;

public abstract class Component implements  Handler{

    private Component next;
    public static Component link(Component first, Component... chain) {
        Component head = first;
        for (Component nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    @Override
    public abstract Message handle(Message el);

    public void setNext(Component next) {
        this.next = next;
    }

    @Override
    public Message checkNext(Message el) {

        return next.handle(el);
    }

}
