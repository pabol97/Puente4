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
    
    boolean setReserva(int fila, int columna, Reserva r){
        boolean sePuedeReservar = false;
        if(parcelas[fila][columna] == null)
        {
            sePuedeReservar = true;
            parcelas[fila][columna] = r;
        }
        
        return sePuedeReservar; 
    }
    
    int getFilas(){
        return filas;
    }
    
    int getColumna(){
        return columnas;
    }
    
    Reserva[][] getListaReservas(){
        return parcelas;
    }
    
    Reserva getReserva(int fila, int columna){
            return parcelas[fila][columna];
    }
    
}
