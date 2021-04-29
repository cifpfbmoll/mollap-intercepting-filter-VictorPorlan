package edu.pingpong.target;

public class Vehicle implements Target {
    @Override
    public void execute(String id) {
        System.out.println("Doors opened " + id + "!");
    }
}
