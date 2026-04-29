package GestionEventos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TorneoFutbol extends EventoDeportivo{
    private List<Equipo> equipos;
    

    public TorneoFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<Equipo>();
    }


    public void añadirParticipante(Participante p1){
     
    }
    public void añadirEquipo(Equipo eq1){
        equipos.add(eq1);
    }

     public void ganador(){
        Equipo e1 = equipos.get(0);
       for (Equipo equipo : equipos) {
            if(e1.getPuntos()<equipo.getPuntos()){
                e1=equipo;
            }
       }
       System.out.println(e1.toString());
    }


  

  


  

    
    
}
