package TIENDA_RON;

import javax.swing.JOptionPane;

public class GUI_REMOVE extends javax.swing.JFrame {

    public GUI_REMOVE() {
        initComponents();
        if(GUI_PRINCIPAL.cervezas.size()==0 && GUI_PRINCIPAL.licores.size() == 0){
            bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ron" }));
        }
        else if(GUI_PRINCIPAL.cervezas.size()==0 && GUI_PRINCIPAL.rones.size() == 0){
            bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Licor" }));
        }
        else if(GUI_PRINCIPAL.licores.size()==0 && GUI_PRINCIPAL.rones.size() == 0){
            bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cerveza" }));
        }
        else if(GUI_PRINCIPAL.licores.size()==0){
            bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cerveza", "Ron" }));
        }
        else if(GUI_PRINCIPAL.rones.size()==0){
            bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cerveza", "Licor" }));
        }
        else if(GUI_PRINCIPAL.cervezas.size()==0){
            bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Licor", "Ron" }));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        bebida = new javax.swing.JComboBox<>();
        label_bebida = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(750, 131));
        setPreferredSize(new java.awt.Dimension(610, 621));
        setResizable(false);
        setSize(new java.awt.Dimension(610, 620));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(598, 608));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("REMOVER BEBIDA");
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

        remover.setBackground(new java.awt.Color(0, 102, 0));
        remover.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        remover.setForeground(new java.awt.Color(255, 255, 255));
        remover.setText("REMOVER");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        bebida.setBackground(new java.awt.Color(255, 255, 255));
        bebida.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        bebida.setForeground(new java.awt.Color(0, 0, 0));
        bebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cerveza", "Licor", "Ron" }));
        bebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidaActionPerformed(evt);
            }
        });

        label_bebida.setBackground(new java.awt.Color(255, 255, 255));
        label_bebida.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_bebida.setForeground(new java.awt.Color(0, 0, 0));
        label_bebida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_bebida.setText("Seleccione el tipo de Bebida");

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombre.setText("Requerido");

        label_nombre.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(0, 0, 0));
        label_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_nombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_bebida, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bebida, javax.swing.GroupLayout.Alignment.TRAILING, 0, 227, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bebida)
                    .addComponent(label_bebida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        remover.setEnabled(false);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidaActionPerformed
        if(bebida.getSelectedItem().equals("Cerveza")){
            remover.setEnabled(true);
        }
        else if(bebida.getSelectedItem().equals("Licor")){
            remover.setEnabled(true);
        }
        else if(bebida.getSelectedItem().equals("Ron")){
            remover.setEnabled(true);
        }
        else{
            nombre.setText("Requerido");
            remover.setEnabled(false);
        }
    }//GEN-LAST:event_bebidaActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        if(bebida.getSelectedItem().equals("Cerveza")){
            boolean band = false;
            for(int i=0;i<GUI_PRINCIPAL.cervezas.size();i++){
                if(GUI_PRINCIPAL.cervezas.get(i).getNombre().equals(nombre.getText())){
                    band = true;

                    GUI_PRINCIPAL.cervezas.remove(i);

                    File archivo = new File();
                    archivo.escribirCervezas();
                }
            }
            if(band == false){
                JOptionPane.showMessageDialog(null, "No existe ninguna cerveza con ese nombre");
            }
            else{
                JOptionPane.showMessageDialog(null, "Cerveza editada correctamente");
                nombre.setText("");
            }
        }
        else if(bebida.getSelectedItem().equals("Licor")){
            boolean band = false;
            for(int i=0;i<GUI_PRINCIPAL.cervezas.size();i++){
                if(GUI_PRINCIPAL.licores.get(i).getNombre().equals(nombre.getText())){
                    band = true;

                    GUI_PRINCIPAL.licores.remove(i);

                    File archivo = new File();
                    archivo.escribirLicores();
                }
            }
            if(band == false){
                JOptionPane.showMessageDialog(null, "No existe ningun licor con ese nombre");
            }
            else{
                JOptionPane.showMessageDialog(null, "Licor eliminado correctamente");
                nombre.setText("");
            }
        }
        else if(bebida.getSelectedItem().equals("Ron")){
            boolean band = false;
            for(int i=0;i<GUI_PRINCIPAL.rones.size();i++){
                if(GUI_PRINCIPAL.rones.get(i).getNombre().equals(nombre.getText())){
                    band = true;

                    GUI_PRINCIPAL.rones.remove(i);

                    File archivo = new File();
                    archivo.escribirRones();
                }
            }
            if(band == false){
                JOptionPane.showMessageDialog(null, "No existe ningun ron con ese nombre");
            }
            else{
                JOptionPane.showMessageDialog(null, "Ron eliminado correctamente");
                nombre.setText("");
            }
        }
    }//GEN-LAST:event_removerActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bebida;
    private javax.swing.JButton cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_bebida;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton remover;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
