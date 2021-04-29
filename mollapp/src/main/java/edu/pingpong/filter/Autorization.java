package edu.pingpong.filter;

public class Autorization implements Filter{
    @Override
    public void execute(String id) {
        System.out.println("Autorization OK for " + id);
    }

    public String toString(String id) {
        return("Autorization OK for " + id);
    }
}

