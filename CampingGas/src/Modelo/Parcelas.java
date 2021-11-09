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
    ListaReservas[][] parcelas = new ListaReservas[filas][columnas]; //MATRIZ QUE REPRESENTA EL CAMPING; el tercer atributo son las reservas que tiene cada parcela.
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
    
    
}
