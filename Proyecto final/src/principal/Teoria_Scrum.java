/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Image;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author José
 */
public class Teoria_Scrum extends javax.swing.JFrame {

    /**
     * Creates new form Teoria_Scrum
     */
    public Teoria_Scrum() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
        //setExtendedState(MAXIMIZED_BOTH);
        setTitle("Ingenieria De Software");
        setIconImage(new ImageIcon(getClass().getResource("../recursos/icono1.png")).getImage());
        ImageIcon logo = new ImageIcon(getClass().getResource("/recursos/logo.jpg"));
        ImageIcon icono = new ImageIcon(logo.getImage().getScaledInstance(Imagen_1.getWidth(), Imagen_1.getHeight(), Image.SCALE_DEFAULT));
        Imagen_1.setIcon(icono);
        this.repaint();

        /*ImageIcon logo1 = new ImageIcon(getClass().getResource("/resursos/Escudo.png"));
        ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(Imagen2.getWidth(), Imagen2.getHeight(), Image.SCALE_DEFAULT));
        Imagen2.setIcon(icono1);
        this.repaint();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BtnLink1 = new javax.swing.JButton();
        BtnLink2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnTeoria = new javax.swing.JButton();
        BtnDesar = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        Imagen3 = new javax.swing.JLabel();
        Imagen2 = new javax.swing.JLabel();
        Imagen_1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButtonSalida = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(230, 249, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BtnLink1.setBackground(new java.awt.Color(153, 153, 255));
        BtnLink1.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        BtnLink1.setText("Más acerca de herramientas");
        BtnLink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLink1ActionPerformed(evt);
            }
        });

        BtnLink2.setBackground(new java.awt.Color(153, 153, 255));
        BtnLink2.setFont(new java.awt.Font("Trebuchet MS", 3, 11)); // NOI18N
        BtnLink2.setText("Procesos Ing. Software");
        BtnLink2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLink2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-enlace-externo-32.png"))); // NOI18N

        BtnTeoria.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnTeoria.setText("Teoría básica de ingeniería de software");
        BtnTeoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTeoriaActionPerformed(evt);
            }
        });

        BtnDesar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        BtnDesar.setText("Desarrolladores");
        BtnDesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDesarActionPerformed(evt);
            }
        });

        BtnInicio.setText("Inicio");
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnInicio)
                .addGap(18, 18, 18)
                .addComponent(BtnTeoria)
                .addGap(18, 18, 18)
                .addComponent(BtnDesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLink1)
                .addGap(18, 18, 18)
                .addComponent(BtnLink2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnLink1)
                        .addComponent(BtnLink2)
                        .addComponent(BtnTeoria)
                        .addComponent(BtnDesar)
                        .addComponent(BtnInicio))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Escudo-UNAM-1024x1151 (1).png"))); // NOI18N
        Imagen3.setMaximumSize(new java.awt.Dimension(180, 202));
        Imagen3.setPreferredSize(new java.awt.Dimension(100, 100));

        jTextArea1.setBackground(new java.awt.Color(224, 224, 224));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" Las metodologías ágiles mejoran la satisfacción del cliente dado que\n se involucrará y comprometerá a lo largo del proyecto. En cada etapa\n del desarrollo se informará al cliente sobre los progresos del mismo.De\n ese modo, el cliente puede sumar su  experiencia para optimizar las \n características del producto final. Se pueden evitar así numerosos \n malentendidos dado que el cliente poseerá en todo momento una \n completa visión del estado del producto.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(224, 224, 224));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("                                SCRUM\n                     \n Scrum es un marco de trabajo en el que equipos cross-funcionales\n pueden crear productos o desarrollar proyectos de una forma \n iterativa e incremental. El desarrollo se estructura en\n ciclos de trabajo llamados Sprints (también conocidos como \n iteraciones). Estas iteraciones no deben durar más de cuatro\n semanas cada una (siendo dos semanas la duración más habitual)\n y tienen lugar una tras otra sin pausa entre ellas. ");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setBackground(new java.awt.Color(224, 224, 224));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("                      ROLES EN SCRUM\n En Scrum existen tres roles: Dueño de Product, \n Equipo y ScrumMaster. Todos ellos forman lo que\n se conoce como el Equipo Scrum. ");
        jScrollPane3.setViewportView(jTextArea3);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/escudofes (1).png"))); // NOI18N

        jTextArea4.setBackground(new java.awt.Color(224, 224, 224));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("                       HERRAMIENTAS PARA SCRUM\n  1-TargetProcess                                 4-Taiga\n  2-Active Collab                                   5-Swift Kanban\n  3-Pivotal Tracker                                6-Kanbanize\n ");
        jScrollPane4.setViewportView(jTextArea4);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ingeniero (1).jpg"))); // NOI18N

        jButtonSalida.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jButtonSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8-salida-32.png"))); // NOI18N
        jButtonSalida.setText("Salida");
        jButtonSalida.setToolTipText("Boton de salida");
        jButtonSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.gray));
        jButtonSalida.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalida)
                        .addGap(36, 36, 36))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Imagen_1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 46, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane3)))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Imagen_1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalida)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Teoría básica de SCRUM", jPanel1);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLink2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLink2ActionPerformed
        // TODO add your handling code here:
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://sg.com.mx/revista/1/procesos-software");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                }

            }
        }
    }//GEN-LAST:event_BtnLink2ActionPerformed

    private void BtnLink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLink1ActionPerformed
        // TODO add your handling code here:
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI("https://okhosting.com/blog/herramientas-de-desarrollo-de-software/");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex) {
                }

            }
        }
    }//GEN-LAST:event_BtnLink1ActionPerformed

    private void jButtonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidaActionPerformed

        int salida = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir del programa?", "Salida", JOptionPane.OK_OPTION);
        if (JOptionPane.OK_OPTION == salida) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSalidaActionPerformed

    private void BtnTeoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTeoriaActionPerformed
        // TODO add your handling code here:
        Teoria_Ing_Software VentanaSoft = new Teoria_Ing_Software();
        VentanaSoft.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnTeoriaActionPerformed

    private void BtnDesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDesarActionPerformed
        // TODO add your handling code here:
        Informacion VentanaInfo = new Informacion();
        VentanaInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnDesarActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
        Inicial VentanaInicio = new Inicial();
        VentanaInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnInicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teoria_Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teoria_Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teoria_Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teoria_Scrum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teoria_Scrum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDesar;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnLink1;
    private javax.swing.JButton BtnLink2;
    private javax.swing.JButton BtnTeoria;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JLabel Imagen_1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
