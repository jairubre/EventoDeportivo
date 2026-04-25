package GestionEventos;

public class ExcepcionJugadorNoEncontrado extends Exception{

    public ExcepcionJugadorNoEncontrado(String message) {
        super(message);
    }
    
    public String toString(){
        return getMessage();
    }
}
