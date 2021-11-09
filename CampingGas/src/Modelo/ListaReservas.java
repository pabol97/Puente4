/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raúl
 */
public class ListaReservas {
    Reserva[] reservas;

    public ListaReservas(){}

    public boolean addReserva(Reserva r){
        boolean sePuede = true;
        boolean hayHuecos = false;
        int r_fila, r_columna, numReservas, hueco = 0;

        int primerNull; //para poder ir rellenando los huecos
        r_fila = r.getFila();
        r_columna = r.getColumna();
        numReservas = reservas.length; //Me llevo el numero de reservas que tengo guardado

        for(int i = 0; i < numReservas; i++){
            if(sePuede){
                if(!hayHuecos && reservas[i] == null){
                    hayHuecos = true;
                    hueco = i;
                }
                else{
                    //Si mi entrada está entre medias de una reserva = FALSE
                    if(r.getFechaEntrada().compareTo(reservas[i].getFechaEntrada()) > 0 && r.getFechaEntrada().compareTo(reservas[i].getFechaSalida()) < 0) {
                        sePuede = false;
                    }
                    //Si mi salida está entre medias de una reserva = FALSE
                    else if(r.getFechaSalida().compareTo(reservas[i].getFechaEntrada()) < 0 && r.getFechaSalida().compareTo(reservas[i].getFechaSalida()) > 0)
                        sePuede = false;
                    //SI mi tengo entre medias de mi entrada y salida una reserva, FALSE.
                    else if(r.getFechaEntrada().compareTo(reservas[i].getFechaEntrada()) < 0 && r.getFechaSalida().compareTo(reservas[i].getFechaSalida()) > 0)
                        sePuede = false;
                }
            }
        }
        if (sePuede){
            if(hayHuecos){
                reservas[hueco] = r;
            }
            else
                reservas[numReservas] = r;
        }
        return sePuede;
    }

    public Reserva[] getReservas() {
        return reservas;
    }
}
