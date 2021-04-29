package edu.pingpong.clients;

import edu.pingpong.admin.Programmer;

public class Mollapp implements Client{
    Programmer programmer;
    public Mollapp() {
    }
    @Override
    public void setProgrammer(Programmer programmer){
        this.programmer = programmer;
    }
    @Override
    public void sendPetition(String id){
        programmer.executeDuties(id);
    }
}
