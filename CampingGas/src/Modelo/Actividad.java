/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Cliente;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Actividad {
    
    String tituloActividad;
    ArrayList<Cliente> clientesApuntados = new ArrayList<Cliente>();
    Calendar fecha;
    String lugar;
    
    public Actividad(String _tituloActividad, Calendar _fecha){
        tituloActividad = _tituloActividad;
        fecha = _fecha;
        lugar = "Canada";
        
        Cliente cliente = new Cliente("Pedro");
        Cliente cliente2 = new Cliente("Carlos");
        Cliente cliente3 = new Cliente("David");
        Cliente cliente4 = new Cliente("Raul");
        
        clientesApuntados.add(cliente);
        clientesApuntados.add(cliente2);
        clientesApuntados.add(cliente3);
        clientesApuntados.add(cliente4);
    }
    
    public String getTitulo() {
        return tituloActividad;
    }

    public ArrayList<Cliente> getListaClientes() {
        return clientesApuntados;
    }

    public Object getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }
}

