/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campinggas;

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
    
    //public float calc_precio(){
        //int dias = (int) ((fechaInicio.getTime() - fechaactual.getTime()));
    //}
}
