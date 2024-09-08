package TIENDA_RON;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUI_PRINCIPAL extends javax.swing.JFrame {

    static ArrayList<CERVEZA> cervezas = new ArrayList<>();
    static ArrayList<RON> rones = new ArrayList<>();
    static ArrayList<LICOR> licores = new ArrayList<>();
    
    public GUI_PRINCIPAL() {
        initComponents();
        File archivo = new File();
        archivo.leerCervezas();
        archivo.leerLicores();
        archivo.leerRones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foto_tienda = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        fondo_tienda = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        foto_tienda.setBackground(new java.awt.Color(51, 51, 51));

        icon.setBackground(new java.awt.Color(255, 255, 255));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/LOGO.png"))); // NOI18N
        icon.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        icon.setOpaque(true);

        javax.swing.GroupLayout foto_tiendaLayout = new javax.swing.GroupLayout(foto_tienda);
        foto_tienda.setLayout(foto_tiendaLayout);
        foto_tiendaLayout.setHorizontalGroup(
            foto_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foto_tiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        foto_tiendaLayout.setVerticalGroup(
            foto_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foto_tiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondo_tienda.setBackground(new java.awt.Color(255, 255, 255));

        nombre.setFont(new java.awt.Font("Rockwell Extra Bold", 2, 36)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Liquor Store");
        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        cerrar.setBackground(new java.awt.Color(153, 0, 0));
        cerrar.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        cerrar.setForeground(new java.awt.Color(0, 0, 0));
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(51, 204, 255));
        agregar.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        agregar.setForeground(new java.awt.Color(0, 0, 0));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(51, 204, 255));
        editar.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        editar.setForeground(new java.awt.Color(0, 0, 0));
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        remover.setBackground(new java.awt.Color(51, 204, 255));
        remover.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        remover.setForeground(new java.awt.Color(0, 0, 0));
        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        listar.setBackground(new java.awt.Color(51, 204, 255));
        listar.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        listar.setForeground(new java.awt.Color(0, 0, 0));
        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(listar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fondo_tiendaLayout = new javax.swing.GroupLayout(fondo_tienda);
        fondo_tienda.setLayout(fondo_tiendaLayout);
        fondo_tiendaLayout.setHorizontalGroup(
            fondo_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_tiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondo_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                    .addGroup(fondo_tiendaLayout.createSequentialGroup()
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fondo_tiendaLayout.setVerticalGroup(
            fondo_tiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_tiendaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto_tienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fondo_tienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fondo_tienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foto_tienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        AGREGAR_GUI ventana = new AGREGAR_GUI();
        ventana.setVisible(true);
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if(GUI_PRINCIPAL.cervezas.size()==0 && GUI_PRINCIPAL.licores.size()==0 && GUI_PRINCIPAL.rones.size()==0){
            JOptionPane.showMessageDialog(null, "Agregue primero algun tipo de bebida");
        }
        else{
            EDITAR_GUI ventana = new EDITAR_GUI();
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        if(GUI_PRINCIPAL.cervezas.size()==0 && GUI_PRINCIPAL.licores.size()==0 && GUI_PRINCIPAL.rones.size()==0){
            JOptionPane.showMessageDialog(null, "Agregue primero algun tipo de bebida");
        }
        else{
            GUI_REMOVE ventana = new GUI_REMOVE();
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_removerActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        if(GUI_PRINCIPAL.cervezas.size()==0 && GUI_PRINCIPAL.licores.size()==0 && GUI_PRINCIPAL.rones.size()==0){
            JOptionPane.showMessageDialog(null, "Agregue primero algun tipo de bebida");
        }
        else{
            LISTAR_GUI ventana = new LISTAR_GUI();
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_listarActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton editar;
    private javax.swing.JPanel fondo_tienda;
    private javax.swing.JPanel foto_tienda;
    private javax.swing.JLabel icon;
    private javax.swing.JButton listar;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton remover;
    // End of variables declaration//GEN-END:variables
}
