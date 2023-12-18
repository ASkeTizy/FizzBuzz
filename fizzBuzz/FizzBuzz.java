package org.example.fizzBuzz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(i + "");
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Component component1 = Component.link(
                new FizzBuzzComponent(),
                new FizzComponent(),
                new BuzzComponent());
        List<String> list = new ArrayList<>();
        for (int i = 1; i < 16; i++) {
            list.add(component1.handle(i));
        }
        list.forEach(el -> System.out.println(el));

    }
}
