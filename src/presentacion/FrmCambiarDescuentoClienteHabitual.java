package presentacion;

import entidades.ClienteHabitual;
import javax.swing.JOptionPane;
import logica.BLClientes;
import logica.BLHabitaciones;

public class FrmCambiarDescuentoClienteHabitual extends javax.swing.JFrame {

    public FrmCambiarDescuentoClienteHabitual(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(null);
        parent.setVisible(false);
        this.parent = parent;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelDescuento = new javax.swing.JPanel();
        lblDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        panelButtons = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 169, 143));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(193, 208, 181));
        panelTitle.setPreferredSize(new java.awt.Dimension(300, 85));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        title1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("DESCUENTO POR");
        title1.setToolTipText("");
        title1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        title1.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title1.setPreferredSize(new java.awt.Dimension(410, 35));
        title1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelTitle.add(title1);

        title2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("CLIENTE HABITUAL");
        title2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        title2.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title2.setPreferredSize(new java.awt.Dimension(410, 50));
        title2.setVerifyInputWhenFocusTarget(false);
        panelTitle.add(title2);

        bg.add(panelTitle);

        panelDatos.setBackground(new java.awt.Color(193, 208, 181));
        panelDatos.setPreferredSize(new java.awt.Dimension(300, 60));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10));

        panelDescuento.setBackground(new java.awt.Color(193, 208, 181));
        panelDescuento.setPreferredSize(new java.awt.Dimension(170, 40));
        panelDescuento.setLayout(new java.awt.BorderLayout());

        lblDescuento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblDescuento.setText("Descuento (0-100%):");
        panelDescuento.add(lblDescuento, java.awt.BorderLayout.CENTER);

        txtDescuento.setBackground(new java.awt.Color(255, 248, 222));
        panelDescuento.add(txtDescuento, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelDescuento);

        bg.add(panelDatos);

        panelButtons.setBackground(new java.awt.Color(193, 208, 181));
        panelButtons.setPreferredSize(new java.awt.Dimension(300, 50));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnGuardar.setBackground(new java.awt.Color(214, 232, 219));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(33, 42, 62));
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelButtons.add(btnGuardar);

        btnSalir.setBackground(new java.awt.Color(214, 232, 219));
        btnSalir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(33, 42, 62));
        btnSalir.setText("Salir");
        btnSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelButtons.add(btnSalir);

        bg.add(panelButtons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        float porcentajeDescuento = 
                Float.parseFloat(txtDescuento.getText()) / 100;
        String mensaje = 
                BLClientes.actualizarPorcentajeDescuento(porcentajeDescuento);
        
        if (mensaje.compareTo("ok") == 0)
            JOptionPane.showMessageDialog(
                this, "¡Descuento Actualizado!", "Información",
                JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(
                this, "Descuento no actualizado: " + mensaje,
                "Advertencia",JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDescuento;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JTextField txtDescuento;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;

}
