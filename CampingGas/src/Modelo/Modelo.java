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
    
    public Modelo(){
        //Cargar datos...
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
}
