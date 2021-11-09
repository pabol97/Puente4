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
    
    int filas = 10;
    int columnas = 10;
    Reserva[][] parcelas = new Reserva[filas][columnas]; //MATRIZ QUE REPRESENTA EL CAMPING; el tercer atributo son las reservas que tiene cada parcela.
    
    public int getFilas() {
        return filas;
    }

    public int getColumna() {
        return columnas;
    }

    public Reserva[][] getListaReservas() {
        return parcelas;
    }
    
    private class Reservas{
        Reserva[] reservas;

        public Reservas(){
        }

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

        public Reserva getReserva(int fila, int columna){
                return parcelas[fila][columna];
        }

    }
}
