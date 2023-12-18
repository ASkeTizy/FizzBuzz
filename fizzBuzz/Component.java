package org.example.fizzBuzz;

public abstract class Component implements  Handler{

    private Component container;

public static Component link(Component first, Component... chain) {
    Component head = first;
    for (Component nextInChain: chain) {
        head.container = nextInChain;
        head = nextInChain;
    }
    return first;
}

    @Override
    public abstract String handle(int i);

    @Override
    public String checkNext(int i) {
        if(container == null) {
            return i+ "";
        }
        return container.handle(i);
    }


}
