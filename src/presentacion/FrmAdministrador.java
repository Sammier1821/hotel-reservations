package presentacion;

public class FrmAdministrador extends javax.swing.JFrame {

    public FrmAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelHabitaciones = new javax.swing.JPanel();
        lblHabitaciones = new javax.swing.JLabel();
        btnRegistroHabitacion = new javax.swing.JButton();
        btnCambiarPrecio = new javax.swing.JButton();
        panelClientesHabituales = new javax.swing.JPanel();
        lblClientesHabituales = new javax.swing.JLabel();
        btnCambiarDescuento = new javax.swing.JButton();
        panelFinanzas = new javax.swing.JPanel();
        lblFinanzas = new javax.swing.JLabel();
        btnGananciasPorMes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 169, 143));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(193, 208, 181));
        panelTitle.setPreferredSize(new java.awt.Dimension(960, 50));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        title.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ADMINISTRACIÓN DEL HOTEL");
        title.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title.setPreferredSize(new java.awt.Dimension(460, 40));
        panelTitle.add(title);

        bg.add(panelTitle);

        panelHabitaciones.setBackground(new java.awt.Color(193, 208, 181));
        panelHabitaciones.setPreferredSize(new java.awt.Dimension(310, 200));
        panelHabitaciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        lblHabitaciones.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHabitaciones.setText("HABITACIONES");
        lblHabitaciones.setPreferredSize(new java.awt.Dimension(310, 50));
        panelHabitaciones.add(lblHabitaciones);

        btnRegistroHabitacion.setBackground(new java.awt.Color(214, 232, 219));
        btnRegistroHabitacion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRegistroHabitacion.setText("Crear habitación");
        btnRegistroHabitacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistroHabitacion.setPreferredSize(new java.awt.Dimension(200, 40));
        btnRegistroHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroHabitacionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(btnRegistroHabitacion);

        btnCambiarPrecio.setBackground(new java.awt.Color(214, 232, 219));
        btnCambiarPrecio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCambiarPrecio.setText("Cambiar precio");
        btnCambiarPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarPrecio.setPreferredSize(new java.awt.Dimension(200, 40));
        btnCambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPrecioActionPerformed(evt);
            }
        });
        panelHabitaciones.add(btnCambiarPrecio);

        bg.add(panelHabitaciones);

        panelClientesHabituales.setBackground(new java.awt.Color(193, 208, 181));
        panelClientesHabituales.setPreferredSize(new java.awt.Dimension(310, 200));
        panelClientesHabituales.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        lblClientesHabituales.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblClientesHabituales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientesHabituales.setText("CLIENTES HABITUALES");
        lblClientesHabituales.setPreferredSize(new java.awt.Dimension(310, 50));
        panelClientesHabituales.add(lblClientesHabituales);

        btnCambiarDescuento.setBackground(new java.awt.Color(214, 232, 219));
        btnCambiarDescuento.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCambiarDescuento.setText("Cambiar descuento");
        btnCambiarDescuento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCambiarDescuento.setPreferredSize(new java.awt.Dimension(200, 40));
        btnCambiarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarDescuentoActionPerformed(evt);
            }
        });
        panelClientesHabituales.add(btnCambiarDescuento);

        bg.add(panelClientesHabituales);

        panelFinanzas.setBackground(new java.awt.Color(193, 208, 181));
        panelFinanzas.setPreferredSize(new java.awt.Dimension(300, 200));
        panelFinanzas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        lblFinanzas.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblFinanzas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinanzas.setText("FINANZAS");
        lblFinanzas.setPreferredSize(new java.awt.Dimension(300, 50));
        panelFinanzas.add(lblFinanzas);

        btnGananciasPorMes.setBackground(new java.awt.Color(214, 232, 219));
        btnGananciasPorMes.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnGananciasPorMes.setText("Ver ganancias en un mes");
        btnGananciasPorMes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGananciasPorMes.setPreferredSize(new java.awt.Dimension(220, 40));
        panelFinanzas.add(btnGananciasPorMes);

        bg.add(panelFinanzas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroHabitacionActionPerformed
        new FrmRegistroHabitacion(this).setVisible(true);
    }//GEN-LAST:event_btnRegistroHabitacionActionPerformed

    private void btnCambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPrecioActionPerformed
        new FrmCambiarPrecioHabitacion(this).setVisible(true);
    }//GEN-LAST:event_btnCambiarPrecioActionPerformed

    private void btnCambiarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDescuentoActionPerformed
        new FrmCambiarDescuentoClienteHabitual(this).setVisible(true);
    }//GEN-LAST:event_btnCambiarDescuentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnCambiarDescuento;
    private javax.swing.JButton btnCambiarPrecio;
    private javax.swing.JButton btnGananciasPorMes;
    private javax.swing.JButton btnRegistroHabitacion;
    private javax.swing.JLabel lblClientesHabituales;
    private javax.swing.JLabel lblFinanzas;
    private javax.swing.JLabel lblHabitaciones;
    private javax.swing.JPanel panelClientesHabituales;
    private javax.swing.JPanel panelFinanzas;
    private javax.swing.JPanel panelHabitaciones;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
