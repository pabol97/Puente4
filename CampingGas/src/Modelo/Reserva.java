/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Reserva {
    private Cliente cliente;
    private Date fecha_entrada, fecha_salida;
    
    public Reserva(Cliente cliente, Date fecha_entrada, Date fecha_salida){
        this.cliente = cliente;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
    }
    
    public String getNombre(){
        return cliente.getNombre();
    }
    
    public Date getFechaEntrada(){
        return fecha_entrada;
    }
    
    public Date getFechaSalida(){
        return fecha_salida;
    }
    
    public boolean comprobarFechas(){
        if(fecha_entrada.compareTo(fecha_salida) < 0 || fecha_entrada.equals(fecha_salida))
            return true;
        
        return false;
    }
    
    public float calcPrecio(){
        float dias = (int) ((fecha_entrada.getTime() - fecha_salida.getTime()));
        
        if(dias >= 15){
            dias = (float) (dias*0.85);
        }
        
        return dias;
    }
    
    public String toString(){
        return getNombre() + " tiene una reserva del dia " + getFechaEntrada() + " al dia " + getFechaSalida() + " por " + calcPrecio() + " bitcoins";
    }
}
