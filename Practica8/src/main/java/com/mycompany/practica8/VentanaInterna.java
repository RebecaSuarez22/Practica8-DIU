/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.practica8;

import java.awt.Dimension;

public class VentanaInterna extends javax.swing.JInternalFrame {

    public VentanaInterna() {
        initComponents();
        this.setPreferredSize(new Dimension(100, 80));
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.setClosable(true);
        this.setResizable(true);        
    }
    
    public int abrirImagen(String fichero, String nombre){
        this.setTitle(nombre);
        return lienzo.abrirImagen(fichero);
    }
    
    public void getUmbral(int umbral, String fichero){
        this.setTitle("Valor del umbral: "+umbral);
        lienzo.abrirImagen(fichero);     
        lienzo.getUmbral(umbral);
    }    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo = new com.mycompany.practica8.Lienzo();

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.practica8.Lienzo lienzo;
    // End of variables declaration//GEN-END:variables
}
