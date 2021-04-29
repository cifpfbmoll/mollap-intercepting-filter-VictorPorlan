package edu.pingpong.filter;

public class Autentication implements Filter{
    @Override
    public void execute(String id) {
        System.out.println("Autentication OK for " + id);
    }

    public String toString(String id) {
        return("Autentication OK for " + id);
    }
}