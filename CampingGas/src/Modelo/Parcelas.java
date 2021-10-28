/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumno
 */
public class Parcelas {
    
    int filas = 10;
    int columnas = 10; 
    Reserva[][] parcelas = new Reserva[filas][columnas];

    //todo lo que haya que guardar de cada parcela
    
    //para el constructor -> recorrer el fichero de datos en orden e ir guardando cada dato
    
    public boolean setReserva(int fila, int columna, Reserva r){
        boolean sePuedeReservar = false;
        if(parcelas[fila][columna] == null)
        {
            sePuedeReservar = true;
            parcelas[fila][columna] = r;
        }
        
        return sePuedeReservar; 
    }
    
    public int getFilas(){
        return filas;
    }
    
    public int getColumna(){
        return columnas;
    }
    
    public Reserva[][] getListaReservas(){
        return parcelas;
    }
    
    public Reserva getReserva(int fila, int columna){
            return parcelas[fila][columna];
    }
    
}
