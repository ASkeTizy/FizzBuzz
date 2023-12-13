package org.example.fizzBuzz;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public Component component;
    public List<String> fizzBuzz(int n) {
        List<String> ans = new LinkedList<>();
        for (int i = 1; i <= n ; i++) {
            if (i % 5 == 0 && i % 3 == 0){
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                    ans.add("Buzz");
                }   else {
                    ans.add(i + "");
                }

        }
        return ans;
    }
    public void setComponent(Component component) {
        this.component = component;
    }
    public boolean checker(int i) {
        return component.handle(i);
    }
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i =1; i < 16; i++) {
            Component component1 = Component.link(new FizzBuzzComponent(),
                    new FizzComponent(),
                    new BuzzComponent());
            fizzBuzz.setComponent(component1);
            fizzBuzz.component.handle(i);
        }

    }
}
