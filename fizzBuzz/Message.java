package org.example.fizzBuzz;

public class Message {
    private  final int value;
    private  final String command;

    public Message(int value, String command) {
        this.value = value;
        this.command = command;
    }

    public int getValue() {
        return value;
    }

    public String getCommand() {
        return command;
    }
}
