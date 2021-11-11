/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campinggas;

import Modelo.Cliente;
import Modelo.ListaReservas;
import Modelo.Parcelas;
import Modelo.Reserva;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author alumno
 */
public class AlquilerAdminView extends javax.swing.JFrame {

    Parcelas parcelas;
    ListaReservas[][] listaReservaCamping;
    Reserva[] reservasParcela;
    
    String userCliente;
    Date fechaIni, fechaFin;
    int fila, columna, pos;
    
    
    /**
     * Creates new form AlquilerAdminView
     */
    public AlquilerAdminView(Parcelas parcelas) {
        initComponents();
        mensajeError.setVisible(false);
        rellenarListaReservas(parcelas);
    }
    
    public void rellenarListaReservas(Parcelas parcelas){
        listaReservaCamping = parcelas.getListaReservas();
        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addElement("Nueva reserva.");
        for(int fila = 0; fila < parcelas.getFilas(); fila++){
            for(int columna = 0; columna < parcelas.getColumnas(); columna++){
                if (listaReservaCamping[fila][columna] != null)
                    if((reservasParcela = listaReservaCamping[fila][columna].getReservas()) != null)  //Me llevo las reservas de la parcela
                        for(int i = 0; i < reservasParcela.length; i++){ //Recorro la lista
                            modeloLista.addElement(reservasParcela[i].toString() + ":" + i); //AÑADIMOS la posicion del vector donde lo hemos encontrado para que sea mas facil buscarlo luego
                        }
            }
        }
        
        listaReservas.setModel(modeloLista);
        listaReservas.setSelectedIndex(0); //Ponemos como seleccion predeterminada la nueva reserva.
        return;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        listaReservas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        botonAlquilar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fechaInicioChooser = new com.toedter.calendar.JDateChooser();
        fechaFinChooser = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userClienteField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        parcelaCombo = new javax.swing.JComboBox<>();
        mensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaReservas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaReservas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaReservasValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listaReservas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Reservas");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Volver");
        jButton2.setPreferredSize(new java.awt.Dimension(200, 60));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botonAlquilar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonAlquilar.setText("Alquilar");
        botonAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlquilarActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha Ingreso:");

        jLabel6.setText("Fecha Salida:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Reservar:");

        jLabel4.setText("Parcelas disponibles:");

        jLabel2.setText("Usuario Cliente:");

        parcelaCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:1", "1:2", "1:3", "1:4", "1:5", "1:6", "1:7", "1:8", "1:9", "1:10", "2:1", "2:2", "2:3", "2:4", "2:5", "2:6", "2:7", "2:8", "2:9", "2:10", "3:1", "3:2", "3:3", "3:4", "3:5", "3:6", "3:7", "3:8", "3:9", "3:10", "4:1", "4:2", "4:3", "4:4", "4:5", "4:6", "4:7", "4:8", "4:9", "4:10", "5:1", "5:2", "5:3", "5:4", "5:5", "5:6", "5:7", "5:8", "5:9", "5:10", "6:1", "6:2", "6:3", "6:4", "6:5", "6:6", "6:7", "6:8", "6:9", "6:10", "7:1", "7:2", "7:3", "7:4", "7:5", "7:6", "7:7", "7:8", "7:9", "7:10", "8:1", "8:2", "8:3", "8:4", "8:5", "8:6", "8:7", "8:8", "8:9", "8:10", "9:1", "9:2", "9:3", "9:4", "9:5", "9:6", "9:7", "9:8", "10:9", "10:10", "10:1", "10:2", "10:3", "10:4", "10:5", "10:6", "10:7", "10:8", "10:9", "10:10" }));

        mensajeError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mensajeError.setForeground(new java.awt.Color(255, 51, 51));
        mensajeError.setText("ERROR: La parcela seleccionada no está disponible en ese rango de dias.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fechaInicioChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fechaFinChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(parcelaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(userClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userClienteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(fechaInicioChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaFinChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(parcelaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mensajeError)
                        .addGap(44, 44, 44)
                        .addComponent(botonAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlquilarActionPerformed
        String seleccion;
        String seleccionParcela;
        String[] partesSeleccion;
        String[] partesFecha;
        seleccion = listaReservas.getSelectedValue();
        
            switch(seleccion){
                case "Nueva reserva.":
                    userCliente = userClienteField.getText();
                    Cliente cliente = new Cliente(userCliente);
                    
                    fechaIni = fechaInicioChooser.getDate();
                    fechaFin = fechaFinChooser.getDate();
                    
                    seleccionParcela = (String) parcelaCombo.getSelectedItem();
                    partesSeleccion = seleccionParcela.split(":");
                    fila = Integer.parseInt(partesSeleccion[0]);
                    columna = Integer.parseInt(partesSeleccion[1]);
                    
                    Reserva nuevaReserva = new Reserva(cliente, fechaIni, fechaFin, fila, columna);
                    if(!listaReservaCamping[fila][columna].addReserva(nuevaReserva))
                        mensajeError.setVisible(true);
                    break;
                default:
                    partesSeleccion = seleccion.split(":");
                    
                    
                    //Recogemos los datos de la reserva.
                    userCliente = partesSeleccion[0];
                    partesFecha = partesSeleccion[1].split("/");
                    fechaIni = new Date(Integer.parseInt(partesFecha[0]), Integer.parseInt(partesFecha[1]), Integer.parseInt(partesFecha[2]));
                
                    partesFecha = partesSeleccion[2].split("/");
                    fechaFin = new Date(Integer.parseInt(partesFecha[0]), Integer.parseInt(partesFecha[1]), Integer.parseInt(partesFecha[2]));
                    fila = Integer.parseInt(partesSeleccion[3]);
                    columna = Integer.parseInt(partesSeleccion[4]);
                    pos = Integer.parseInt(partesSeleccion[5]);

                    userClienteField.setText(userCliente);
                    fechaInicioChooser.setDate(fechaIni);
                    fechaFinChooser.setDate(fechaFin);
                    parcelaCombo.setSelectedItem(fila + ":" + columna);

            }
    }//GEN-LAST:event_botonAlquilarActionPerformed

    private void listaReservasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaReservasValueChanged
        String seleccion;
        String[] partesSeleccion;
        String[] partesFecha;
        seleccion = listaReservas.getSelectedValue();
        
        
        
        switch(seleccion){
            case "Nueva reserva.":
                userCliente = "";
                fechaIni = new Date();
                fechaFin = new Date();
                fila = -1;
                columna = -1;
                pos = -1;
                
                userClienteField.setText(userCliente);
                fechaInicioChooser.setDate(fechaIni);
                fechaFinChooser.setDate(fechaFin);
                break;
            default:
                partesSeleccion = seleccion.split(":");
                
                //Recogemos los datos de la reserva.
                userCliente = partesSeleccion[0];
                System.out.println(partesSeleccion[1]);
                
                partesFecha = partesSeleccion[1].split("/");
                fechaIni = new Date(Integer.parseInt(partesFecha[0]), Integer.parseInt(partesFecha[1]), Integer.parseInt(partesFecha[2]));
                
                partesFecha = partesSeleccion[2].split("/");
                fechaFin = new Date(Integer.parseInt(partesFecha[0]), Integer.parseInt(partesFecha[1]), Integer.parseInt(partesFecha[2]));
                fila = Integer.parseInt(partesSeleccion[3]);
                columna = Integer.parseInt(partesSeleccion[4]);
                pos = Integer.parseInt(partesSeleccion[5]);
                
                userClienteField.setText(userCliente);
                fechaInicioChooser.setDate(fechaIni);
                fechaFinChooser.setDate(fechaFin);
                parcelaCombo.setSelectedItem(fila + ":" + columna);
        }
    }//GEN-LAST:event_listaReservasValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlquilar;
    private com.toedter.calendar.JDateChooser fechaFinChooser;
    private com.toedter.calendar.JDateChooser fechaInicioChooser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listaReservas;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JComboBox<String> parcelaCombo;
    private javax.swing.JTextField userClienteField;
    // End of variables declaration//GEN-END:variables
}
