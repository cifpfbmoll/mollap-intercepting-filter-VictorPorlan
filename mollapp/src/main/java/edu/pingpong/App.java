package edu.pingpong;

import edu.pingpong.admin.Programmer;
import edu.pingpong.clients.Mollapp;
import edu.pingpong.filter.Autentication;
import edu.pingpong.filter.Autorization;
import edu.pingpong.target.Vehicle;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuració del programador de tasques
         * del sistema amb el tipus de target triat:
         * des de vehicles a qualsevol cosa que admiteix
         * la recepció d'un missatge.
         */
        Programmer programmer = new Programmer(new Vehicle());

        /**
         * Afegir al sistema les tasques que volem que el sistema
         * executi al rebre la petició del client.
         */
        programmer.setDuties(new Autentication());
        programmer.setDuties(new Autorization());

        /**
         * Configuració de l'app client per a que
         * executi les tasques programades i
         * enviï el misstage al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setProgrammer(programmer);
        mollapp.sendPetition("Francesc");
    }
}