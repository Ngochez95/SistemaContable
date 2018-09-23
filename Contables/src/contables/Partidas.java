/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contables;

import datos.acceso.CuentaFacade;
import datos.acceso.LibroDiarioFacade;
import datos.acceso.TransaccionFacade;
import datos.definiciones.Cuenta;
import datos.definiciones.LibroDiario;
import datos.definiciones.Transaccion;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngochez
 */
public class Partidas extends javax.swing.JFrame {

    TransaccionFacade transaccion = new TransaccionFacade();
    LibroDiarioFacade libro = new LibroDiarioFacade();
    Transaccion t = new Transaccion();
    DefaultTableModel tablaTransaccion = new DefaultTableModel();
    CuentaFacade cuenta = new CuentaFacade();
    Cuenta c = new Cuenta();
    DefaultComboBoxModel comboCuenta = new DefaultComboBoxModel();

    public Partidas() {
        initComponents();
        TablePartida.getTableHeader().setReorderingAllowed(false);
        tablaTransaccion = (DefaultTableModel) TablePartida.getModel();
        comboCuenta = (DefaultComboBoxModel) cmbCuenta.getModel();
        llenarCmbCuenta();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TipoTransaccion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConcepto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablePartida = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtAbono = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoCuenta = new javax.swing.JTextField();
        btnInsertarPartid = new javax.swing.JButton();
        txtGrabar = new javax.swing.JButton();
        txtSalir = new javax.swing.JButton();
        chkTipo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbCuenta = new javax.swing.JComboBox<>();
        Fecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesamiento de partidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha de partida");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setText("Cuenta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 77, -1));

        jLabel3.setText("Monto en dolares $");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel4.setText("Concepto de partida");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        TipoTransaccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cargo", "Abono" }));
        jPanel1.add(TipoTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 190, -1));

        txtConcepto.setColumns(20);
        txtConcepto.setRows(5);
        jScrollPane1.setViewportView(txtConcepto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 200, 58));

        TablePartida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablePartida.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        TablePartida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Cuenta", "Nombre Cuenta", "Cargo", "Abono"
            }
        ));
        jScrollPane2.setViewportView(TablePartida);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 229, 639, 349));

        jLabel5.setText("Totales ($)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 592, -1, -1));

        txtCargo.setEditable(false);
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 584, 95, -1));

        txtAbono.setEditable(false);
        jPanel1.add(txtAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 584, 94, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 185, 140, -1));

        jLabel6.setText("Tipo de partida");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));
        jPanel1.add(txtCodigoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, -1));

        btnInsertarPartid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imsertar.png"))); // NOI18N
        btnInsertarPartid.setText("Insertar Partida");
        btnInsertarPartid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPartidActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarPartid, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 186, 140, -1));

        txtGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        txtGrabar.setText("Grabar");
        txtGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrabarActionPerformed(evt);
            }
        });
        jPanel1.add(txtGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, -1, -1));

        txtSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salir.png"))); // NOI18N
        txtSalir.setText("Salir");
        txtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalirActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, -1, -1));

        chkTipo.setText("Ajuste");
        jPanel1.add(chkTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel7.setText("Cuenta de ajuste");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setText("Buscar Cuenta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        cmbCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar " }));
        cmbCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCuentaMouseClicked(evt);
            }
        });
        cmbCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentaActionPerformed(evt);
            }
        });
        cmbCuenta.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cmbCuentaVetoableChange(evt);
            }
        });
        jPanel1.add(cmbCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, -1));
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 120, -1));

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

    private void cmbCuentaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cmbCuentaVetoableChange
        JOptionPane.showMessageDialog(null, "holi");
    }//GEN-LAST:event_cmbCuentaVetoableChange

    private void cmbCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentaActionPerformed
        List<Cuenta> lista = cuenta.findAll();
        for (Cuenta cuenta1 : lista) {
            if (cuenta1.getNombreCuenta() == cmbCuenta.getSelectedItem()) {
                txtCodigoCuenta.setText(cuenta1.getIdCuenta().toString());
            } else {

            }

        }
    }//GEN-LAST:event_cmbCuentaActionPerformed

    private void cmbCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCuentaMouseClicked
        //JOptionPane.showMessageDialog(null, "holi");
    }//GEN-LAST:event_cmbCuentaMouseClicked

    private void txtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            dispose();
        } else {
            this.setVisible(true);
        }
    }//GEN-LAST:event_txtSalirActionPerformed

    private void btnInsertarPartidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPartidActionPerformed
      
        Object[] lista = new Object[4];
        if (TipoTransaccion.getSelectedIndex() == 0) {
            lista[0] = txtCodigoCuenta.getText();
            lista[1] = cmbCuenta.getSelectedItem();
            lista[2] = txtMonto.getText();
            lista[3] = 0;
            tablaTransaccion.addRow(lista);
            double sumatoria1 = 0.0;
            for (int i = 0; i < tablaTransaccion.getRowCount(); i++) {
                double sumatoria = Double.parseDouble(String.valueOf(tablaTransaccion.getValueAt(i, 2)));
                sumatoria1 = sumatoria1 + sumatoria;
                txtCargo.setText("" + sumatoria1);
               txtCodigoCuenta.setText("");
              //txtConcepto.setText("");
                txtMonto.setText("");
               //Fecha.setDate(null);
               cmbCuenta.setSelectedIndex(0);

            }

        } else {
            lista[0] = txtCodigoCuenta.getText();
            lista[1] = cmbCuenta.getSelectedItem();
            lista[2] = 0;
            lista[3] = txtMonto.getText();
            tablaTransaccion.addRow(lista);
            double sumatoria1 = 0.0;
            for (int i = 0; i < tablaTransaccion.getRowCount(); i++) {
                double sumatoria = Double.parseDouble(String.valueOf(tablaTransaccion.getValueAt(i, 3)));
                sumatoria1 = sumatoria1 + sumatoria;
                txtAbono.setText("" + sumatoria1);
               // txtCargo.setText("" + sumatoria1);
//                txtCodigoCuenta.setText("");
//                txtConcepto.setText("");
//                txtMonto.setText("");
//                Fecha.setDate(null);
//                cmbCuenta.setSelectedIndex(0);

            }
        }

        //lista[2]=TipoTransaccion.getItemAt(0);
        //lista[3]=TipoTransaccion.getItemAt(1);
        

    }//GEN-LAST:event_btnInsertarPartidActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     txtConcepto.setText("");
     txtMonto.setText("");
     cmbCuenta.setSelectedIndex(0);
     txtCodigoCuenta.setText("");
     TipoTransaccion.setSelectedIndex(0);
     Fecha.setDate(null);

        
    }//GEN-LAST:event_btnCancelarActionPerformed
    public void guardarTransaccion() {
        LibroDiario lib = new LibroDiario();
        Transaccion transa = new Transaccion();

    }

    public Cuenta buscarObjetoPorID(int id) {
        //Cuenta c = new Cuenta();
        return cuenta.find(id);
    }
       
    public void  limpiarDatos(){
        //for (int i = 0; i < cuenta.count(); i++) {
          //  tablaCatalogo.removeRow(i);
            //i-=1;
        //}
        while (tablaTransaccion.getRowCount() > 0) 
        {
        tablaTransaccion.removeRow(0);
        }
    
    }
    private void txtGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrabarActionPerformed
        if (txtCargo.getText().equals(txtAbono.getText())) {
            LibroDiario l = new LibroDiario();
            l.setFecha(Fecha.getDate());
            l.setConcepto(txtConcepto.getText());
            l.setTotal(Double.parseDouble(txtAbono.getText()));
           // l.setFecha(Fecha.getDate());
            libro.create(l);
            for (int i = 0; i < tablaTransaccion.getRowCount(); i++) {
                Transaccion t = new Transaccion();
                t.setIdCuenta(cuenta.find(Integer.parseInt("" + tablaTransaccion.getValueAt(i, 0))));
                t.setIdLibroDiario(l);
                t.setCargo(Double.parseDouble("" + tablaTransaccion.getValueAt(i, 2)));
                t.setAbono(Double.parseDouble("" + tablaTransaccion.getValueAt(i, 3)));
                transaccion.create(t);
               

            }

            JOptionPane.showMessageDialog(null, "registro creado con éxito");
         

        } else {
            JOptionPane.showMessageDialog(null, "La partida está descuadrada");

        }
           limpiarDatos();
            txtAbono.setText("");
            txtCargo.setText("");
    }//GEN-LAST:event_txtGrabarActionPerformed
    public void llenarCmbCuenta() {
        List<Cuenta> lista = cuenta.findAll();
        for (Cuenta cuenta1 : lista) {
            Object[] fila = new Object[1];
            //fila[0]=cuenta1.getNombreCuenta();
            comboCuenta.addElement(cuenta1.getNombreCuenta());
        }

    }

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
            java.util.logging.Logger.getLogger(Partidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JTable TablePartida;
    private javax.swing.JComboBox<String> TipoTransaccion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInsertarPartid;
    private javax.swing.JCheckBox chkTipo;
    private javax.swing.JComboBox<String> cmbCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAbono;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodigoCuenta;
    private javax.swing.JTextArea txtConcepto;
    private javax.swing.JButton txtGrabar;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JButton txtSalir;
    // End of variables declaration//GEN-END:variables
}