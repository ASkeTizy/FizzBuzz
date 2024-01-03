package org.example.fizzBuzz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
//


    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Component component1 = Component.link(
                new FizzComponent(),
                new FizzChecker(),
                new BuzzComponent(),
                new BuzzChecker(),
                new DefaultComponent());
        List<Message> list = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            list.add(component1.handle(new Message(i,"")));
        }
        list.forEach(el -> System.out.println(el.getCommand()));

    }
}
