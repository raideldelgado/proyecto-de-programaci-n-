package TIENDA_RON;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class LISTAR_GUI extends javax.swing.JFrame {

    public LISTAR_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cerveza = new javax.swing.JButton();
        licor = new javax.swing.JButton();
        ron = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImages(null);
        setLocation(new java.awt.Point(750, 131));
        setPreferredSize(new java.awt.Dimension(609, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(610, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        cerveza.setBackground(new java.awt.Color(0, 255, 204));
        cerveza.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        cerveza.setForeground(new java.awt.Color(0, 0, 0));
        cerveza.setText("Cervezas");
        cerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cervezaActionPerformed(evt);
            }
        });

        licor.setBackground(new java.awt.Color(0, 255, 204));
        licor.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        licor.setForeground(new java.awt.Color(0, 0, 0));
        licor.setText("Licores");
        licor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licorActionPerformed(evt);
            }
        });

        ron.setBackground(new java.awt.Color(0, 255, 204));
        ron.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        ron.setForeground(new java.awt.Color(0, 0, 0));
        ron.setText("Rones");
        ron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ronActionPerformed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(153, 0, 0));
        cerrar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(0, 204, 204));
        limpiar.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(licor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ron, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ron, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 454, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        limpiar.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cervezaActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
            
        limpiar.setEnabled(true);
        licor.setEnabled(false);
        ron.setEnabled(false);
        
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio de Compra");
            modelo.addColumn("Precio de Venta");
            modelo.addColumn("Ganancia");
            modelo.addColumn("Envace");
            modelo.addColumn("Volumen");
            
            JTable tabla = new JTable(modelo);
            tabla.setBounds(15, 140, 540, 340);
            tabla.setVisible(true);
            jPanel1.add(tabla);
            
            JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setBounds(15, 140, 540, 340);
            scroll.setVisible(true);
            jPanel1.add(scroll);
            
            for(int i=0;i<GUI_PRINCIPAL.cervezas.size();i++){
                String nombre = GUI_PRINCIPAL.cervezas.get(i).getNombre();
                String cantidad = Integer.toString(GUI_PRINCIPAL.cervezas.get(i).getCantidad());
                String precio_compra = Integer.toString(GUI_PRINCIPAL.cervezas.get(i).getPrecio_compra());
                String precio_venta = Integer.toString(GUI_PRINCIPAL.cervezas.get(i).getPrecio_venta());
                String ganancia = Integer.toString(GUI_PRINCIPAL.cervezas.get(i).getGanancia());
                String envace = GUI_PRINCIPAL.cervezas.get(i).getEnvace();
                String volumen = Integer.toString(GUI_PRINCIPAL.cervezas.get(i).getVolumen());
                
                String[] aux = {nombre,cantidad,precio_compra,precio_venta,ganancia,envace,volumen};
                
                modelo.addRow(aux);
            }
            
            ActionListener bot = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        try{
                            modelo.removeRow(0);
                        }catch(Exception ex){
                            limpiar.setEnabled(false);
                            tabla.setVisible(false);
                            scroll.setVisible(false);
                            licor.setEnabled(true);
                            ron.setEnabled(true);
                            cerveza.setEnabled(true);
                        }                    
                        limpiar.setEnabled(false);
                        tabla.setVisible(false);
                        scroll.setVisible(false);
                        licor.setEnabled(true);
                        ron.setEnabled(true);
                        cerveza.setEnabled(true);
                }
            };
            limpiar.addActionListener(bot);
    }//GEN-LAST:event_cervezaActionPerformed

    private void licorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licorActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
            
        limpiar.setEnabled(true);
        cerveza.setEnabled(false);
        ron.setEnabled(false);
        
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio de Compra");
            modelo.addColumn("Precio de Venta");
            modelo.addColumn("Ganancia");
            modelo.addColumn("Envace");
            modelo.addColumn("Color");
            
            JTable tabla = new JTable(modelo);
            tabla.setBounds(15, 140, 540, 340);
            tabla.setVisible(true);
            jPanel1.add(tabla);
            
            JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setBounds(15, 140, 540, 340);
            scroll.setVisible(true);
            jPanel1.add(scroll);
            
            for(int i=0;i<GUI_PRINCIPAL.licores.size();i++){
                String nombre = GUI_PRINCIPAL.licores.get(i).getNombre();
                String cantidad = Integer.toString(GUI_PRINCIPAL.licores.get(i).getCantidad());
                String precio_compra = Integer.toString(GUI_PRINCIPAL.licores.get(i).getPrecio_compra());
                String precio_venta = Integer.toString(GUI_PRINCIPAL.licores.get(i).getPrecio_venta());
                String ganancia = Integer.toString(GUI_PRINCIPAL.licores.get(i).getGanancia());
                String envace = GUI_PRINCIPAL.licores.get(i).getEnvace();
                String color = GUI_PRINCIPAL.licores.get(i).getColor();
                
                String[] aux = {nombre,cantidad,precio_compra,precio_venta,ganancia,envace,color};
                
                modelo.addRow(aux);
            }
            
            ActionListener bot = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        try{
                            modelo.removeRow(0);
                        }catch(Exception ex){
                            limpiar.setEnabled(false);
                            tabla.setVisible(false);
                            scroll.setVisible(false);
                            licor.setEnabled(true);
                            ron.setEnabled(true);
                            cerveza.setEnabled(true);
                        }                    
                        limpiar.setEnabled(false);
                        tabla.setVisible(false);
                        scroll.setVisible(false);
                        licor.setEnabled(true);
                        ron.setEnabled(true);
                        cerveza.setEnabled(true);
                }
            };
            limpiar.addActionListener(bot);
    }//GEN-LAST:event_licorActionPerformed

    private void ronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ronActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
            
        limpiar.setEnabled(true);
        licor.setEnabled(false);
        cerveza.setEnabled(false);
        
            modelo.addColumn("Nombre");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Precio de Compra");
            modelo.addColumn("Precio de Venta");
            modelo.addColumn("Ganancia");
            modelo.addColumn("Envace");
            modelo.addColumn("Tipo");
            
            JTable tabla = new JTable(modelo);
            tabla.setBounds(15, 140, 540, 340);
            tabla.setVisible(true);
            jPanel1.add(tabla);
            
            JScrollPane scroll = new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setBounds(15, 140, 540, 340);
            scroll.setVisible(true);
            jPanel1.add(scroll);
            
            for(int i=0;i<GUI_PRINCIPAL.rones.size();i++){
                String nombre = GUI_PRINCIPAL.rones.get(i).getNombre();
                String cantidad = Integer.toString(GUI_PRINCIPAL.rones.get(i).getCantidad());
                String precio_compra = Integer.toString(GUI_PRINCIPAL.rones.get(i).getPrecio_compra());
                String precio_venta = Integer.toString(GUI_PRINCIPAL.rones.get(i).getPrecio_venta());
                String ganancia = Integer.toString(GUI_PRINCIPAL.rones.get(i).getGanancia());
                String envace = GUI_PRINCIPAL.rones.get(i).getEnvace();
                String tipo = GUI_PRINCIPAL.rones.get(i).getTipo();
                
                String[] aux = {nombre,cantidad,precio_compra,precio_venta,ganancia,envace,tipo};
                
                modelo.addRow(aux);
            }
            
            ActionListener bot = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        try{
                            modelo.removeRow(0);
                        }catch(Exception ex){
                            limpiar.setEnabled(false);
                            tabla.setVisible(false);
                            scroll.setVisible(false);
                            licor.setEnabled(true);
                            ron.setEnabled(true);
                            cerveza.setEnabled(true);
                        }                    
                        limpiar.setEnabled(false);
                        tabla.setVisible(false);
                        scroll.setVisible(false);
                        licor.setEnabled(true);
                        ron.setEnabled(true);
                        cerveza.setEnabled(true);
                }
            };
            limpiar.addActionListener(bot);
    }//GEN-LAST:event_ronActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JButton cerveza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton licor;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton ron;
    // End of variables declaration//GEN-END:variables
}
