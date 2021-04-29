package edu.pingpong.clients;

import edu.pingpong.admin.Programmer;

public interface Client {
    void setProgrammer(Programmer programmer);

    void sendPetition(String petition);
}
