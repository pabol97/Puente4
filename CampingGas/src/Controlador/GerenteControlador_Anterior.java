/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Actividad;
import Modelo.Cliente;
import Modelo.ListaReservas;
import Modelo.Parcelas;
import Modelo.Reserva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author alumno
 */
public class GerenteControlador_Anterior {
    ArrayList<Actividad> actividades = new ArrayList<Actividad>();
    Parcelas parcelas = new Parcelas(10,10);
    
    public GerenteControlador_Anterior(){
        Actividad act = new Actividad("Judo",null);
        Actividad act2 = new Actividad("Bolos",null);
        actividades.add(act);
        actividades.add(act2);
        
        
        
        llenaDatosTest(parcelas);
    }
    
    public ArrayList<Actividad> getActividades(){
        return actividades;
    }
    
    public void crearActividad(String titulo, Calendar fecha){
        Actividad act = new Actividad(titulo,fecha);
        actividades.add(act);
    }
    
    public Parcelas getParcelas()
    {
        return parcelas;
    }
    
    public void llenaDatosTest(Parcelas parcelas){
        
        
        
        Date c = new Date(2021,11,5);
        Date c2 = new Date(2021,11,15);

        
        Cliente cli = new Cliente("Test");
        
        
        Reserva r = new Reserva(cli,c,c2,1,1);
        Reserva[] rs = new Reserva[1];
        rs[0] = r;
        ArrayList<Reserva> caca = new ArrayList<Reserva>();
        ListaReservas l = new ListaReservas(caca);

        l.addReserva(r);
                
        for(int i = 0; i < parcelas.getFilas(); i++)              
            for(int j = 0; j < parcelas.getColumnas(); j++)         
            {
                
                if(Math.random() < 0.5 )
                parcelas.setReservaAParcela(i, j, l);
                //parcelas.establecerCoherencia();
            }
    
}
}
