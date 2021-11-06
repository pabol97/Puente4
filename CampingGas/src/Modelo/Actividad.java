/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Actividad {
    private Date fecha;
    private String lugar;
    
    public Actividad(Date fecha, String lugar){
        this.fecha = fecha;
        this.lugar = lugar;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public String getLugar(){
        return lugar;
    }
}
