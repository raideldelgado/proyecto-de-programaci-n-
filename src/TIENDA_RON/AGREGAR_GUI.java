package TIENDA_RON;

import javax.swing.JOptionPane;

public class AGREGAR_GUI extends javax.swing.JFrame {

    public AGREGAR_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        label_bebida = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_cantidad = new javax.swing.JLabel();
        label_precio_compras = new javax.swing.JLabel();
        label_precio_ventas = new javax.swing.JLabel();
        label_envace = new javax.swing.JLabel();
        label_mixto = new javax.swing.JLabel();
        bebida = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        precio_compra = new javax.swing.JTextField();
        precio_venta = new javax.swing.JTextField();
        envace = new javax.swing.JTextField();
        mixto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocation(new java.awt.Point(750, 131));
        setPreferredSize(new java.awt.Dimension(609, 620));
        setResizable(false);
        setSize(new java.awt.Dimension(610, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("AGREGAR BEBIDA");
        titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        cancelar.setBackground(new java.awt.Color(153, 0, 0));
        cancelar.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 102, 0));
        guardar.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        label_bebida.setBackground(new java.awt.Color(255, 255, 255));
        label_bebida.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_bebida.setForeground(new java.awt.Color(0, 0, 0));
        label_bebida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_bebida.setText("Seleccione el tipo de Bebida");

        label_nombre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nombre.setText("Nombre");

        label_cantidad.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_cantidad.setForeground(new java.awt.Color(0, 0, 0));
        label_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_cantidad.setText("Cantidad");

        label_precio_compras.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_precio_compras.setForeground(new java.awt.Color(0, 0, 0));
        label_precio_compras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_precio_compras.setText("Precio Compra");

        label_precio_ventas.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_precio_ventas.setForeground(new java.awt.Color(0, 0, 0));
        label_precio_ventas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_precio_ventas.setText("Precio Venta");

        label_envace.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_envace.setForeground(new java.awt.Color(0, 0, 0));
        label_envace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_envace.setText("Envace");

        label_mixto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_mixto.setForeground(new java.awt.Color(0, 0, 0));
        label_mixto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bebida.setBackground(new java.awt.Color(255, 255, 255));
        bebida.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        bebida.setForeground(new java.awt.Color(0, 0, 0));
        bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cerveza", "Licor", "Ron" }));
        bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidaActionPerformed(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        cantidad.setBackground(new java.awt.Color(255, 255, 255));
        cantidad.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        cantidad.setForeground(new java.awt.Color(0, 0, 0));
        cantidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        precio_compra.setBackground(new java.awt.Color(255, 255, 255));
        precio_compra.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        precio_compra.setForeground(new java.awt.Color(0, 0, 0));
        precio_compra.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        precio_venta.setBackground(new java.awt.Color(255, 255, 255));
        precio_venta.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        precio_venta.setForeground(new java.awt.Color(0, 0, 0));
        precio_venta.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        envace.setBackground(new java.awt.Color(255, 255, 255));
        envace.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        envace.setForeground(new java.awt.Color(0, 0, 0));
        envace.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        mixto.setBackground(new java.awt.Color(255, 255, 255));
        mixto.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        mixto.setForeground(new java.awt.Color(0, 0, 0));
        mixto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label_envace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_precio_ventas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_precio_compras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_cantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_bebida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(label_mixto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre)
                            .addComponent(cantidad)
                            .addComponent(precio_compra)
                            .addComponent(precio_venta)
                            .addComponent(envace)
                            .addComponent(mixto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bebida)
                    .addComponent(label_bebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre)
                    .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cantidad)
                    .addComponent(label_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precio_compra)
                    .addComponent(label_precio_compras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precio_venta)
                    .addComponent(label_precio_ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(envace)
                    .addComponent(label_envace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_mixto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mixto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        guardar.setEnabled(false);
        label_mixto.setVisible(false);
        mixto.setVisible(false);

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

    private void bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidaActionPerformed
        if(bebida.getSelectedItem().equals("Cerveza")){
            mixto.setVisible(true);
            mixto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"","355","425"}));
            label_mixto.setVisible(true);
            label_mixto.setText("Volumen(mL)");
            guardar.setEnabled(true);
        }
        else if(bebida.getSelectedItem().equals("Licor")){
            mixto.setVisible(true);
            mixto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"","Azul","Verde","Rojo"}));
            label_mixto.setVisible(true);
            label_mixto.setText("Color");
            guardar.setEnabled(true);
        }
        else if(bebida.getSelectedItem().equals("Ron")){
            mixto.setVisible(true);
            mixto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"","Refino","Aguardiente"}));
            label_mixto.setVisible(true);
            label_mixto.setText("Tipo");
            guardar.setEnabled(true);
        }
        else{
            label_mixto.setVisible(false);
            nombre.setText("");
            cantidad.setText("");
            precio_compra.setText("");
            precio_venta.setText("");
            envace.setText("");
            mixto.setSelectedItem("");
            mixto.setVisible(false);
            mixto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
            guardar.setEnabled(false);
        }
    }//GEN-LAST:event_bebidaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if(bebida.getSelectedItem().equals("Cerveza")){
            String nombre_aux = nombre.getText();
            int cantidad_aux = Integer.parseInt(cantidad.getText());
            String envace_aux = envace.getText();
            int precio_compra_aux = Integer.parseInt(precio_compra.getText());
            int precio_venta_aux = Integer.parseInt(precio_venta.getText());
            int volumen = Integer.parseInt((String) mixto.getSelectedItem());
            
            CERVEZA cerveza_aux = new CERVEZA(volumen, nombre_aux, cantidad_aux, envace_aux, precio_compra_aux, precio_venta_aux);
            GUI_PRINCIPAL.cervezas.add(cerveza_aux);
            
            File archivo = new File();
            archivo.escribirCervezas();
            
            nombre.setText("");
            cantidad.setText("");
            envace.setText("");
            precio_compra.setText("");
            precio_venta.setText("");
            mixto.setSelectedItem(" ");
            
            JOptionPane.showMessageDialog(null, "Bebida agregada correctamente");
        }
        else if(bebida.getSelectedItem().equals("Licor")){
            String nombre_aux = nombre.getText();
            int cantidad_aux = Integer.parseInt(cantidad.getText());
            String envace_aux = envace.getText();
            int precio_compra_aux = Integer.parseInt(precio_compra.getText());
            int precio_venta_aux = Integer.parseInt(precio_venta.getText());
            String color_aux = (String) mixto.getSelectedItem();
            
            LICOR licor_aux = new LICOR(color_aux, nombre_aux, cantidad_aux, envace_aux, precio_compra_aux, precio_venta_aux);
            GUI_PRINCIPAL.licores.add(licor_aux);
            
            File archivo = new File();
            archivo.escribirLicores();
            
            nombre.setText("");
            cantidad.setText("");
            envace.setText("");
            precio_compra.setText("");
            precio_venta.setText("");
            mixto.setSelectedItem(" ");
            
            JOptionPane.showMessageDialog(null, "Bebida agregada correctamente");
        }
        else if(bebida.getSelectedItem().equals("Ron")){
            String nombre_aux = nombre.getText();
            int cantidad_aux = Integer.parseInt(cantidad.getText());
            String envace_aux = envace.getText();
            int precio_compra_aux = Integer.parseInt(precio_compra.getText());
            int precio_venta_aux = Integer.parseInt(precio_venta.getText());
            String tipo = (String) mixto.getSelectedItem();
            
            RON ron_aux = new RON(tipo, nombre_aux, cantidad_aux, envace_aux, precio_compra_aux, precio_venta_aux);
            GUI_PRINCIPAL.rones.add(ron_aux);
            
            File archivo = new File();
            archivo.escribirRones();
            
            nombre.setText("");
            cantidad.setText("");
            envace.setText("");
            precio_compra.setText("");
            precio_venta.setText("");
            mixto.setSelectedItem(" ");
            
            JOptionPane.showMessageDialog(null, "Bebida agregada correctamente");
        }
    }//GEN-LAST:event_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bebida;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField envace;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_bebida;
    private javax.swing.JLabel label_cantidad;
    private javax.swing.JLabel label_envace;
    private javax.swing.JLabel label_mixto;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_precio_compras;
    private javax.swing.JLabel label_precio_ventas;
    private javax.swing.JComboBox<String> mixto;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio_compra;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}