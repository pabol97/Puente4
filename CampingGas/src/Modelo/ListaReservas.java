/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Raúl
 */
public class ListaReservas {
    ArrayList<Reserva> reservas;

    public ListaReservas(ArrayList<Reserva> r){
        reservas = r;
    }

    public boolean addReserva(Reserva r){
        boolean sePuede = true;
        int r_fila, r_columna, numReservas;

        r_fila = r.getFila();
        r_columna = r.getColumna();
        
        numReservas = reservas.size(); //Me llevo el numero de reservas que tengo guardado

        
        for(int i = 0; i < numReservas; i++){
            if(sePuede){
                
                //Si mi entrada está entre medias de una reserva = FALSE
                if(r.getFechaEntrada().compareTo(reservas.get(i).getFechaEntrada()) > 0 && r.getFechaEntrada().compareTo(reservas.get(i).getFechaSalida()) < 0) {
                    sePuede = false;
                }
                //Si mi salida está entre medias de una reserva = FALSE
                else if(r.getFechaSalida().compareTo(reservas.get(i).getFechaEntrada()) < 0 && r.getFechaSalida().compareTo(reservas.get(i).getFechaSalida()) > 0)
                    sePuede = false;
                //SI mi tengo entre medias de mi entrada y salida una reserva, FALSE.
                else if(r.getFechaEntrada().compareTo(reservas.get(i).getFechaEntrada()) < 0 && r.getFechaSalida().compareTo(reservas.get(i).getFechaSalida()) > 0)
                    sePuede = false;
            }
        }
        if (sePuede){
            reservas.add(r);
        }
        return sePuede;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public int numeroReservas(){
        return reservas.size();
    }
    
    public Reserva getReserva(int i){
        return reservas.get(i);
    }

    void setFilasYColumnasEnReservas(int filas, int columnas) {
        for(int i = 0; i < numeroReservas(); i++){
            reservas.get(i).setFila(filas);
            reservas.get(i).setColumna(columnas);
        }
    }
}
