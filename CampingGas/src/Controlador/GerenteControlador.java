/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import campinggas.AlquilerAdminView;
import campinggas.HubAdmin_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Raúl
 */

/**
 * MaestroDeLosColoresViewJ1 vista1;
    MaestroDeLosColoresViewJ2 vista2;
    
    MaestroDeLosColoresModel modelo;
    AcercaDeView acerca_de;
    FinPartidaView fin;
    MDLCActionListener aL = new MDLCActionListener();
    
    public MaestroDeLosColoresController(MaestroDeLosColoresViewJ1 v1, MaestroDeLosColoresViewJ2 v2, MaestroDeLosColoresModel m)
    {
        vista1 = v1;
        vista2 = v2;
        modelo = m;
        
        
        
        vista1.setActionListener(aL);
        vista2.setActionListener(aL);
        
    }
    * 
    * class MDLCActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            String command = ae.getActionCommand();
            int[] j1, j2, solucion;
            int intentos;
            boolean terminado = false;
            ...
 * @author Raúl
 */
public class GerenteControlador {
    HubAdmin_View vista;
    Modelo modelo;
    
    miActionListener aL = new miActionListener();
    miChangeListener cL = new miChangeListener();
    
    public GerenteControlador(HubAdmin_View v, Modelo m){
        vista = v;
        modelo = m;
        
        vista.setMiActionListener(aL);
    }

    class miActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            
            //SWITCH TOCHO
        }
    }
    
    class miChangeListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            String evento = e.getSource().toString(); //Creo que es así, habria que mirarlo
            
            //SWITCH o lo que sea.
            switch(evento){
                case "botonAlquilar":
                    AlquilerAdminView ventanaAlqulerAdminView = new AlquilerAdminView(modelo.getParcelas());
                    break;
                default:
                    break;
            }
        }
        
    }
}
