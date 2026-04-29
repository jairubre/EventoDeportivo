package GestionEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class EventoDeportivo implements Ganador {
    protected String nombre;
    protected LocalDate fecha;
    protected String lugar;
    protected List<Participante> participantes;

    public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        participantes= new ArrayList<Participante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

   


    public abstract void ganador();
    

    @Override
    public String toString() {
        return "EventoDeportivo [nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", participantes="
                + participantes + "]";
    }

    
    



    
}
