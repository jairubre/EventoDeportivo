package GestionEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TorneoFutbol extends EventoDeportivo{
    private List<Equipo> equipos;

    public TorneoFutbol(String nombre, LocalDate fecha, String lugar, List<Equipo> equipos) {
        super(nombre, fecha, lugar);
        this.equipos = equipos;
    }


    public void añadirParticipante(Equipo e1){
        equipos.add(e1);
    }

    
    
}
