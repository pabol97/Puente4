/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Actividad;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class GerenteControlador {
    ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    
    public GerenteControlador(){
        Actividad act = new Actividad("Judo",null);
        Actividad act2 = new Actividad("Bolos",null);
        actividades.add(act);
        actividades.add(act2);
    }
    
    public ArrayList<Actividad> getActividades(){
        return actividades;
    }
    
    public void crearActividad(String titulo, Calendar fecha){
        Actividad act = new Actividad(titulo,fecha);
        actividades.add(act);
    }
}
