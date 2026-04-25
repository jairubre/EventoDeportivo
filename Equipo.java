package GestionEventos;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    
    private String nombre;
    private List<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre ) {
        this.nombre = nombre;
        this.puntos= 0;
        this.jugadores = new ArrayList<Participante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    public void anadirJugador(Participante p1){
        jugadores.add(p1);
    }

    public void eliminarJugador(String nombre, String apellido) throws ExcepcionJugadorNoEncontrado{
        boolean encontrado=false;
        for (Participante participante : jugadores) {
            if (participante.getNombre().equals(nombre) && participante.getApellido().equals(apellido)) {
                jugadores.removeAll(jugadores);
                encontrado=true;
                break;
            }
        }
        if (encontrado==false) {
            throw new ExcepcionJugadorNoEncontrado("Ese jugador no esxite");
        }
    }

    




    

}
