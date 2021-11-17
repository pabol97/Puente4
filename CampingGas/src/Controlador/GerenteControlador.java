/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Modelo.Reserva;
import campinggas.ActividadesAdmin;
import campinggas.AlquilerAdminView;
import campinggas.CrearActividadAdmin;
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
    
    AlquilerAdminView ventanaAlquilerAdminView;
    
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
            switch(command){
                case "botonAlquilarAdminView":
                    ventanaAlquilerAdminView = new AlquilerAdminView(modelo.getParcelas());
                    ventanaAlquilerAdminView.setVisible(true);
                    ventanaAlquilerAdminView.setMiActionListener(aL);
                    break;
                case "AlquilarParcelaAdmin":
                    Reserva nuevaReserva;
                    boolean nueva = true;
                    nuevaReserva = ventanaAlquilerAdminView.getReserva(nueva); //Le pasamos por referencia el booleano.
                    
                    if(nueva){ //Si la reserva es nueva
                        if(!modelo.addNuevaReserva(nuevaReserva)) //Si es inválida muestra error
                            ventanaAlquilerAdminView.mostrarError();
                        else
                        {
                            ventanaAlquilerAdminView.actualizarLista(modelo.getParcelas()); //Si es válida, modelo modificado y hay que actualizar la lista
                        }
                    }
                    else{
                        if(!modelo.modificaReserva(nuevaReserva)) //Si no puede modificar la reserva correctamente:
                            ventanaAlquilerAdminView.mostrarError();
                        else{
                            ventanaAlquilerAdminView.actualizarLista(modelo.getParcelas());
                        }
                    }
                    break;
                case "crearActividad1":
                    CrearActividadAdmin nuevaActividad = new CrearActividadAdmin();
                    nuevaActividad.setVisible(true);
                    break;
                case "visualizarActividad":
                    //VisualizarActividadesAdmin visualizarActividades = new VisualizarActividadesAdmin(gerente);
                    //visualizarActividades.setVisible(true);
                    break;
                case "volver":
                    //this.dispose();
                    break;
                case "gestActividadesButton":
                    ActividadesAdmin act = new ActividadesAdmin();
                    act.setVisible(true);
                    break;
                case "crearActividad":
                    
                    break;
                case "Emparejamientos":
                    
                    break;
                case "Sancionar":
                    
                    break;
                default:
                    break;
            }
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
