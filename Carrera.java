package GestionEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrera extends EventoDeportivo {
    private int distancia;
    private List<ParticipanteCarrera> participantes;

    public Carrera(String nombre, LocalDate fecha, String lugar, int distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
        this.participantes = new ArrayList<ParticipanteCarrera>();
    }

    public void añadirParticipante(ParticipanteCarrera p1) {
        participantes.add(p1);
    }

    public void ganador() {
        ParticipanteCarrera ganador = participantes.get(0);
       
        for (ParticipanteCarrera participante : participantes) {
            if (ganador.getTiempo().compareTo(participante.getTiempo()) > 0) {
                ganador = participante;
            }
        }
        System.out.println(ganador.toString());
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }


}
