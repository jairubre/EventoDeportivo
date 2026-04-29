package GestionEventos;

import java.time.Duration;

public class ParticipanteCarrera extends Participante {
    private Duration tiempo;

    public ParticipanteCarrera(String nombre, String apellido, int edad, Duration tiempo) {
        super(nombre, apellido, edad);
        this.tiempo = tiempo;
    }

    public Duration getTiempo() {
        return tiempo;
    }

    public void setTiempo(Duration tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return super.toString()+" ParticipanteCarrera [tiempo=" + tiempo + "]";
    }

}
