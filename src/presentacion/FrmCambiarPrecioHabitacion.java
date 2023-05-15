package presentacion;

import javax.swing.JOptionPane;
import logica.BLHabitaciones;

public class FrmCambiarPrecioHabitacion extends javax.swing.JFrame {

    public FrmCambiarPrecioHabitacion(javax.swing.JFrame parent) {
        initComponents();
        setLocationRelativeTo(null);
        parent.setVisible(false);
        this.parent = parent;
        setModeloBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelPrecio = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        panelTipoHabitacion = new javax.swing.JPanel();
        cboTipoHabitacion = new javax.swing.JComboBox<>();
        lblTipoHabitacion = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 169, 143));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(193, 208, 181));
        panelTitle.setPreferredSize(new java.awt.Dimension(360, 50));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        title.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("PRECIO DE HABITACIÓN");
        title.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title.setPreferredSize(new java.awt.Dimension(343, 50));
        panelTitle.add(title);

        bg.add(panelTitle);

        panelDatos.setBackground(new java.awt.Color(193, 208, 181));
        panelDatos.setPreferredSize(new java.awt.Dimension(360, 60));
        panelDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 10));

        panelPrecio.setBackground(new java.awt.Color(193, 208, 181));
        panelPrecio.setPreferredSize(new java.awt.Dimension(150, 40));
        panelPrecio.setLayout(new java.awt.BorderLayout());

        lblPrecio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblPrecio.setText("Precio (S/.):");
        panelPrecio.add(lblPrecio, java.awt.BorderLayout.CENTER);

        txtPrecio.setBackground(new java.awt.Color(255, 248, 222));
        panelPrecio.add(txtPrecio, java.awt.BorderLayout.PAGE_END);

        panelDatos.add(panelPrecio);

        panelTipoHabitacion.setBackground(new java.awt.Color(193, 208, 181));
        panelTipoHabitacion.setPreferredSize(new java.awt.Dimension(150, 40));
        panelTipoHabitacion.setLayout(new java.awt.BorderLayout());

        cboTipoHabitacion.setBackground(new java.awt.Color(255, 248, 222));
        panelTipoHabitacion.add(cboTipoHabitacion, java.awt.BorderLayout.CENTER);

        lblTipoHabitacion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblTipoHabitacion.setText("Tipo de habitación:");
        panelTipoHabitacion.add(lblTipoHabitacion, java.awt.BorderLayout.PAGE_START);

        panelDatos.add(panelTipoHabitacion);

        bg.add(panelDatos);

        panelButtons.setBackground(new java.awt.Color(193, 208, 181));
        panelButtons.setPreferredSize(new java.awt.Dimension(360, 50));
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
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        double precioPorNoche = Float.parseFloat(txtPrecio.getText());
        String tipoHabitacion = cboTipoHabitacion.getSelectedItem().toString();
        String mensaje = null;
        
        if (tipoHabitacion.compareTo(entidades.HabitacionSimple.NOMBRE) == 0)
            mensaje = BLHabitaciones.updatePrecioHBSimple(precioPorNoche);
        else if (tipoHabitacion.compareTo(entidades.HabitacionDoble.NOMBRE) == 0)
            mensaje = BLHabitaciones.updatePrecioHBDoble(precioPorNoche);
        else
            mensaje = BLHabitaciones.updatePrecioHBMatrimonial(precioPorNoche);
        
        if (mensaje.compareTo("ok") == 0)
            JOptionPane.showMessageDialog(
                this, "¡Precio Colocado!", "Información",
                JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(
                this, "Precio no colocado: " + mensaje,
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
    private javax.swing.JComboBox<String> cboTipoHabitacion;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoHabitacion;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelPrecio;
    private javax.swing.JPanel panelTipoHabitacion;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JFrame parent;

    private void setModeloBox() {
        cboTipoHabitacion.addItem(entidades.HabitacionSimple.NOMBRE);
        cboTipoHabitacion.addItem(entidades.HabitacionDoble.NOMBRE);
        cboTipoHabitacion.addItem(entidades.HabitacionMatrimonial.NOMBRE);
    }

}
