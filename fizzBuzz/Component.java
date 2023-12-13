package org.example.fizzBuzz;

public abstract class Component implements  Handler{

    private Component container;

//    public abstract boolean check(int i);
public static Component link(Component first, Component... chain) {
    Component head = first;
    for (Component nextInChain: chain) {
        head.container = nextInChain;
        head = nextInChain;
    }
    return first;
}

    @Override
    public abstract boolean handle(int i);

    @Override
    public boolean checkNext(int i) {
        if(container == null) {
            System.out.println(i);
            return true;
        }
        return container.handle(i);
    }


}
