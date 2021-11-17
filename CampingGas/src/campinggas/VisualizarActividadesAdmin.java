/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campinggas;

import Modelo.Actividad;
import Modelo.Cliente;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class VisualizarActividadesAdmin extends javax.swing.JFrame {
    /**
     * Creates new form VisualizarActividadesAdmin
     */
    ArrayList<Actividad> listadoActividades = new ArrayList<Actividad>();
    ArrayList<Cliente> clientesActividad = new ArrayList<Cliente>();
    String[] listado_aux = new String[10];
    String[] clientes_aux = new String[10];
    
    public VisualizarActividadesAdmin(ArrayList<Actividad> lista_auxiliar) {
        initComponents();
        
        listadoActividades = lista_auxiliar;
        
        for (int i = 0; i < listadoActividades.size(); i++){
            listado_aux[i] = listadoActividades.get(i).getTitulo();
        }
        listaActividades.setListData(listado_aux);
        listaActividades.setSelectedIndex(0);
        actualizarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaActividades = new javax.swing.JList<>();
        botonSancionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadoApuntados = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonVerParejas = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ACTIVIDADES CREADAS");

        listaActividades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaActividades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaActividadesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaActividades);

        botonSancionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSancionar.setText("Sancionar");
        botonSancionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSancionarActionPerformed(evt);
            }
        });

        listadoApuntados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listadoApuntados);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("LISTADO ACTIVIDADES");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("LISTADO DE APUNTADOS");

        botonVerParejas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonVerParejas.setText("Emparejamientos");
        botonVerParejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerParejasActionPerformed(evt);
            }
        });

        botonVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(botonVerParejas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(botonSancionar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(105, 105, 105)))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSancionar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerParejas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSancionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSancionarActionPerformed
        Cliente cliente = clientesActividad.get(listadoApuntados.getSelectedIndex());
        cliente.aplicarSancion();
        clientesActividad.remove(listadoApuntados.getSelectedIndex());
        actualizarClientes();
    }//GEN-LAST:event_botonSancionarActionPerformed

    private void botonVerParejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerParejasActionPerformed
        Actividad actividad = listadoActividades.get(listaActividades.getSelectedIndex());
        ArrayList<String> parejas_aux = actividad.emparejar();
        String[] parejas = new String[]{};
        
        for (int i = 0; i < parejas_aux.size();i++)
            parejas[i] = parejas_aux.get(i);
        
        EmparejamientosView emparejamiento = new EmparejamientosView(parejas);
        emparejamiento.setVisible(true);
    }//GEN-LAST:event_botonVerParejasActionPerformed

    private void listaActividadesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaActividadesValueChanged
        actualizarClientes();
    }//GEN-LAST:event_listaActividadesValueChanged

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void actualizarClientes(){   
        Actividad actividad_sel = listadoActividades.get(listaActividades.getSelectedIndex());
        
        clientesActividad = actividad_sel.getListaClientes();
        
        clientes_aux = new String[10];
        
        for (int i = 0; i < clientesActividad.size(); i++){
            clientes_aux[i] = clientesActividad.get(i).getNombre();
        }
        
        listadoApuntados.setListData(clientes_aux);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSancionar;
    private javax.swing.JButton botonVerParejas;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaActividades;
    private javax.swing.JList<String> listadoApuntados;
    // End of variables declaration//GEN-END:variables

void setMiActionListener(ActionListener aL) {
        botonSancionar.addActionListener(aL);
        botonVerParejas.addActionListener(aL);    
        botonVolver.addActionListener(aL);
    }
}
