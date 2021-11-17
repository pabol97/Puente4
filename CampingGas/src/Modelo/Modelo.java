/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Modelo {
    private ArrayList<Reserva> reservasCompletadas;
    private Parcelas parcelas;
    private ListaReservas listaReservas;
    private Map<Cliente,ArrayList<Parcelas>> reservas;
    private Map<Cliente,ArrayList<Actividad>> actividades;
    private ArrayList<Actividad> lista_actividades = new ArrayList<Actividad>();
    
    public Modelo(){
        Actividad act = new Actividad("Judo",null);
        Actividad act2 = new Actividad("Bolos",null);
        lista_actividades.add(act);
        lista_actividades.add(act2);
    }
    
    public ArrayList<Reserva> getReservasCompletadas(){        
        return reservasCompletadas;
    }
    
    public void setReservaCompletada(Reserva reserva){
        reservasCompletadas.add(reserva);
    }
    
    public ArrayList<Parcelas> cargarReservas(Cliente cliente){
        return reservas.get(cliente);
    }
    
    public ArrayList<Actividad> cargarActividades(Cliente cliente){
        return actividades.get(cliente);
    }

    public Parcelas getParcelas() {
        return parcelas;
    }
    
    public boolean addNuevaReserva(Reserva nuevaReserva) {
        return parcelas.addNuevaReserva(nuevaReserva);
    }

    public boolean modificaReserva(Reserva reserva) {
        return parcelas.modificaReserva(reserva);
    }
    
    public void crearActividad(String titulo, Calendar fecha){
        Actividad act = new Actividad(titulo,fecha);
        lista_actividades.add(act);
    }
    
    public ArrayList<Actividad> getActividades(){
        return lista_actividades;
    }
    
}
