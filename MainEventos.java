package GestionEventos;

import java.time.Duration;
import java.time.LocalDate;

public class MainEventos {
    public static void main(String[] args) {
        ParticipanteCarrera p1 = new ParticipanteCarrera("Jaime", "Ruiz", 15, Duration.ofMinutes(4));
        ParticipanteCarrera p2 = new ParticipanteCarrera("Noe", "Ruiz", 15, Duration.ofMinutes(5));

        Carrera c1 = new Carrera("null", LocalDate.now(), "null", 2);
        c1.añadirParticipante(p1);
        c1.añadirParticipante(p2);
        c1.ganador();

        Equipo e1 = new Equipo("ATM");
        e1.anadirJugador(p1);
        e1.setPuntos(10);
        Equipo e2 = new Equipo("FCB");
        e2.anadirJugador(p2);
        e2.setPuntos(9);
        TorneoFutbol t1 = new TorneoFutbol("null", LocalDate.now(), "null");
        t1.añadirEquipo(e1);
        t1.añadirEquipo(e2);
        
        t1.ganador();
    }
}
