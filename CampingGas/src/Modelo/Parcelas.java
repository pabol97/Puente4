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
public class Parcelas {
    //ESTOS VALORES SE PUEDEN MODIFICAR Y CAMBIA LA TABLA
    int filas;
    int columnas;
    ListaReservas[][] parcelas ; //MATRIZ QUE REPRESENTA EL CAMPING; el tercer atributo son las reservas que tiene cada parcela.
   
    public Parcelas(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        parcelas = new ListaReservas[filas][columnas]; //modelo.getListaReservas() ? 
        
       // parcelas.llenaDatosTest();
        
    }
    
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public ListaReservas[][] getListaReservas() {
        return parcelas;
    }
    
    public ListaReservas getParcela(int fila, int columna){
        return parcelas[fila][columna];
    }
    
     public void setReservaAParcela(int fila, int columna, ListaReservas reservas){
         parcelas[fila][columna] = reservas;
    }
    
    public boolean addReserva(Reserva r,int fila, int columna){
        boolean sePuede;
        sePuede = parcelas[fila][columna].addReserva(r);
        
        return sePuede;
    }

    public void establecerCoherencia() {
        for(int i = 0; i < getFilas(); i++){
            for(int j = 0; j < getColumnas(); j++){
                if(parcelas[i][j] != null) //Si tiene reservas
                    parcelas[i][j].setFilasYColumnasEnReservas(i, j);
            }
        }
    }
    
}
