package org.example.fizzBuzz;

public interface Handler{
  Message handle(Message el);
  Message checkNext(Message el);
}
