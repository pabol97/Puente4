/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Reserva {
    private Cliente cliente;
    private int parcelaFila, parcelaColumna; //Para poder comparar con las reservas de esa parcela.
    private Date fecha_entrada, fecha_salida;
    private int posicionModificado; //Esta es una variable que usaremos al actualizar un dato de una parcela, se usa
                                    //para saber en que posicion del ArrayList estaba para poder modificarla
    
    public Reserva(Cliente cliente, Date fecha_entrada, Date fecha_salida, int parcelaFila, int parcelaColumna){
        this.cliente = cliente;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.parcelaFila = parcelaFila;
        this.parcelaColumna = parcelaColumna;
    }
    public Reserva()
    {
        Cliente cliente = new Cliente("Juan");
        Date fecha_entrada = new Date();
        Date fecha_salida = new Date();
        int p_fila = 0;
        int p_columna = 0;
        this.cliente = cliente;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.parcelaFila = p_fila;
        this.parcelaColumna = p_columna;
        
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
    public void setFechas(Date fecha_e, Date fecha_s){
        
        fecha_entrada = fecha_e;
        fecha_salida = fecha_s;
        return;
    }
    public int getFila(){
        return parcelaFila;
    }
    
    public int getColumna(){
        return parcelaColumna;
    }
    
    public boolean setFila(int fila){
        if (fila >= 0 || fila < 11)
        {
            parcelaFila = fila;
            return true;
        }
        return false;
    }
    
    public boolean setColumna(int columna){
        if (columna >= 0 || columna < 11)
        {
            parcelaFila = columna;
            return true;
        }
        return false;
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
        return getNombre() + ":" + getFechaEntrada().getYear() + "/" + getFechaEntrada().getMonth() + "/" + getFechaEntrada().getDay() + ":" + getFechaSalida().getYear() + "/" + 
                getFechaSalida().getMonth() + "/" + getFechaSalida().getDay() + ":" + parcelaFila + ":" + parcelaColumna;
    }
    /*
    public String toString(){
        return getNombre() + " tiene una reserva del dia " + getFechaEntrada() + " al dia " + getFechaSalida() + " por " + calcPrecio() + " bitcoins";
    }
    */

    int getPosicionAModificar() {
        return posicionModificado;
    }

    public void setModificado(int pos) {
        posicionModificado = pos;
    }
}
