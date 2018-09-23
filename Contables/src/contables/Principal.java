/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contables;

import datos.acceso.CuentaFacade;
import javax.swing.JOptionPane;
import vista.VistaPrincipal;

/**
 *
 * @author ngochez
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

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
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        subMenuCatalogo = new javax.swing.JMenuItem();
        subMenuVerCata = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        subMenuPartidas = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        subMenuLibroDiario = new javax.swing.JMenuItem();
        subMenuLibroMayor = new javax.swing.JMenuItem();
        menuRespaldo = new javax.swing.JMenu();
        subRespaldo = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();
        subMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4965657af186b9092c7a96976ffe881c_XL.jpg"))); // NOI18N

        barraMenu.setBackground(new java.awt.Color(254, 254, 254));

        menuArchivo.setText("Catálogo de cuentas");

        subMenuCatalogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        subMenuCatalogo.setText("Catálogo de cuentas");
        subMenuCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMenuCatalogoMouseClicked(evt);
            }
        });
        subMenuCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCatalogoActionPerformed(evt);
            }
        });
        menuArchivo.add(subMenuCatalogo);

        subMenuVerCata.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        subMenuVerCata.setText("Ver catálogo de cuentas");
        subMenuVerCata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuVerCataActionPerformed(evt);
            }
        });
        menuArchivo.add(subMenuVerCata);

        barraMenu.add(menuArchivo);

        menuProcesos.setText("Procesos contables");

        subMenuPartidas.setText("Procesamiento de partidas");
        subMenuPartidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuPartidasActionPerformed(evt);
            }
        });
        menuProcesos.add(subMenuPartidas);

        barraMenu.add(menuProcesos);

        menuReportes.setText("Reportes");

        subMenuLibroDiario.setText("Libro Diario");
        subMenuLibroDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuLibroDiarioActionPerformed(evt);
            }
        });
        menuReportes.add(subMenuLibroDiario);

        subMenuLibroMayor.setText("Libro Mayor");
        subMenuLibroMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuLibroMayorActionPerformed(evt);
            }
        });
        menuReportes.add(subMenuLibroMayor);

        barraMenu.add(menuReportes);

        menuRespaldo.setText("Respaldo");

        subRespaldo.setText("Generar respaldo");
        subRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRespaldoActionPerformed(evt);
            }
        });
        menuRespaldo.add(subRespaldo);

        barraMenu.add(menuRespaldo);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });

        subMenuSalir.setText("Salir del sistema de contabilidad.");
        subMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSalirActionPerformed(evt);
            }
        });
        menuSalir.add(subMenuSalir);

        barraMenu.add(menuSalir);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuCatalogoMouseClicked

    }//GEN-LAST:event_subMenuCatalogoMouseClicked

    private void subMenuCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCatalogoActionPerformed
        Catalogo cat = new Catalogo();
        cat.setLocation(250, 200);
        cat.setVisible(true);

     }//GEN-LAST:event_subMenuCatalogoActionPerformed

    private void subMenuPartidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuPartidasActionPerformed
        Partidas part = new Partidas();
        part.setLocation(250, 200);
        part.setVisible(true);
    }//GEN-LAST:event_subMenuPartidasActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
          }//GEN-LAST:event_menuSalirActionPerformed

    private void subMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        } else {
            this.setVisible(true);
        }    }//GEN-LAST:event_subMenuSalirActionPerformed

    private void subMenuVerCataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuVerCataActionPerformed
        VerCatalogo verCat = new VerCatalogo();
        verCat.setLocation(250, 200);
        verCat.setVisible(true);
    }//GEN-LAST:event_subMenuVerCataActionPerformed

    private void subRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRespaldoActionPerformed

        VistaPrincipal vist = new VistaPrincipal();
        vist.setLocation(250, 200);
        vist.setVisible(true);
    }//GEN-LAST:event_subRespaldoActionPerformed

    private void subMenuLibroDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuLibroDiarioActionPerformed
        LibroDiario lib = new LibroDiario();
        lib.setLocation(550, 350);
        lib.setVisible(true);

    }//GEN-LAST:event_subMenuLibroDiarioActionPerformed

    private void subMenuLibroMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuLibroMayorActionPerformed
        LibroMayor libM = new LibroMayor();
        libM.setLocation(350, 250);
        libM.setVisible(true);

    }//GEN-LAST:event_subMenuLibroMayorActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuProcesos;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menuRespaldo;
    private javax.swing.JMenu menuSalir;
    private javax.swing.JMenuItem subMenuCatalogo;
    private javax.swing.JMenuItem subMenuLibroDiario;
    private javax.swing.JMenuItem subMenuLibroMayor;
    private javax.swing.JMenuItem subMenuPartidas;
    private javax.swing.JMenuItem subMenuSalir;
    private javax.swing.JMenuItem subMenuVerCata;
    private javax.swing.JMenuItem subRespaldo;
    // End of variables declaration//GEN-END:variables
}