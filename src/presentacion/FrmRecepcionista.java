package presentacion;

import entidades.HabitacionDoble;
import entidades.HabitacionMatrimonial;
import entidades.HabitacionSimple;
import logica.BLClientes;
import logica.BLHabitaciones;

public class FrmRecepcionista extends javax.swing.JFrame {

    public FrmRecepcionista() {
        initComponents();
        setLocationRelativeTo(null);
        colocarInformacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelReservas = new javax.swing.JPanel();
        lblReservas = new javax.swing.JLabel();
        btnConsultarPrecio = new javax.swing.JButton();
        btnHacerReserva = new javax.swing.JButton();
        btnEliminarReserva = new javax.swing.JButton();
        panelHabitaciones = new javax.swing.JPanel();
        lblHabitaciones = new javax.swing.JLabel();
        btnConsultarDescripcion = new javax.swing.JButton();
        btnConsultarHabitaciones = new javax.swing.JButton();
        panelInformacion = new javax.swing.JPanel();
        lblFinanzas = new javax.swing.JLabel();
        panelPrecios = new javax.swing.JPanel();
        lblSubtitle1 = new javax.swing.JLabel();
        lblPrecioSimple = new javax.swing.JLabel();
        lblPrecioDoble = new javax.swing.JLabel();
        lblPrecioMatrimonial = new javax.swing.JLabel();
        panelDescuento = new javax.swing.JPanel();
        lblSubtitle2 = new javax.swing.JLabel();
        lblDescuentoHabitual = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 169, 143));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(193, 208, 181));
        panelTitle.setPreferredSize(new java.awt.Dimension(960, 50));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        title.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("CONTROL DE HABITACIONES DEL HOTEL");
        title.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title.setPreferredSize(new java.awt.Dimension(500, 40));
        panelTitle.add(title);

        bg.add(panelTitle);

        panelReservas.setBackground(new java.awt.Color(193, 208, 181));
        panelReservas.setPreferredSize(new java.awt.Dimension(280, 260));
        panelReservas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        lblReservas.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReservas.setText("RESERVAS");
        lblReservas.setPreferredSize(new java.awt.Dimension(310, 30));
        panelReservas.add(lblReservas);

        btnConsultarPrecio.setBackground(new java.awt.Color(214, 232, 219));
        btnConsultarPrecio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConsultarPrecio.setText("Consultar precio");
        btnConsultarPrecio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarPrecio.setPreferredSize(new java.awt.Dimension(200, 40));
        btnConsultarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPrecioActionPerformed(evt);
            }
        });
        panelReservas.add(btnConsultarPrecio);

        btnHacerReserva.setBackground(new java.awt.Color(214, 232, 219));
        btnHacerReserva.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnHacerReserva.setText("Hacer reserva");
        btnHacerReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHacerReserva.setPreferredSize(new java.awt.Dimension(200, 40));
        btnHacerReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerReservaActionPerformed(evt);
            }
        });
        panelReservas.add(btnHacerReserva);

        btnEliminarReserva.setBackground(new java.awt.Color(214, 232, 219));
        btnEliminarReserva.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnEliminarReserva.setText("Eliminar reserva");
        btnEliminarReserva.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarReserva.setPreferredSize(new java.awt.Dimension(200, 40));
        btnEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReservaActionPerformed(evt);
            }
        });
        panelReservas.add(btnEliminarReserva);

        bg.add(panelReservas);

        panelHabitaciones.setBackground(new java.awt.Color(193, 208, 181));
        panelHabitaciones.setPreferredSize(new java.awt.Dimension(280, 260));
        panelHabitaciones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        lblHabitaciones.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHabitaciones.setText("HABITACIONES");
        lblHabitaciones.setPreferredSize(new java.awt.Dimension(310, 30));
        panelHabitaciones.add(lblHabitaciones);

        btnConsultarDescripcion.setBackground(new java.awt.Color(214, 232, 219));
        btnConsultarDescripcion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConsultarDescripcion.setText("Consultar descripción");
        btnConsultarDescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarDescripcion.setPreferredSize(new java.awt.Dimension(200, 40));
        btnConsultarDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDescripcionActionPerformed(evt);
            }
        });
        panelHabitaciones.add(btnConsultarDescripcion);

        btnConsultarHabitaciones.setBackground(new java.awt.Color(214, 232, 219));
        btnConsultarHabitaciones.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConsultarHabitaciones.setText("Consultar habitaciones");
        btnConsultarHabitaciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConsultarHabitaciones.setPreferredSize(new java.awt.Dimension(200, 40));
        btnConsultarHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHabitacionesActionPerformed(evt);
            }
        });
        panelHabitaciones.add(btnConsultarHabitaciones);

        bg.add(panelHabitaciones);

        panelInformacion.setBackground(new java.awt.Color(193, 208, 181));
        panelInformacion.setPreferredSize(new java.awt.Dimension(360, 260));
        panelInformacion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 20));

        lblFinanzas.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblFinanzas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinanzas.setText("INFORMACIÓN");
        lblFinanzas.setPreferredSize(new java.awt.Dimension(300, 30));
        panelInformacion.add(lblFinanzas);

        panelPrecios.setBackground(new java.awt.Color(214, 232, 219));
        panelPrecios.setPreferredSize(new java.awt.Dimension(320, 90));

        lblSubtitle1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSubtitle1.setText("PRECIOS DE HABITACIONES:");
        panelPrecios.add(lblSubtitle1);

        lblPrecioSimple.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblPrecioSimple.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecioSimple.setText("Habitación Simple: PRECIO NO REGISTRADO");
        lblPrecioSimple.setMaximumSize(null);
        lblPrecioSimple.setPreferredSize(new java.awt.Dimension(310, 15));
        panelPrecios.add(lblPrecioSimple);

        lblPrecioDoble.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblPrecioDoble.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecioDoble.setText("Habitación Doble: PRECIO NO REGISTRADO");
        lblPrecioDoble.setMaximumSize(null);
        lblPrecioDoble.setPreferredSize(new java.awt.Dimension(310, 15));
        panelPrecios.add(lblPrecioDoble);

        lblPrecioMatrimonial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblPrecioMatrimonial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrecioMatrimonial.setText("Habitación Matrimonial: PRECIO NO REGISTRADO");
        lblPrecioMatrimonial.setMaximumSize(null);
        lblPrecioMatrimonial.setPreferredSize(new java.awt.Dimension(310, 15));
        panelPrecios.add(lblPrecioMatrimonial);

        panelInformacion.add(panelPrecios);

        panelDescuento.setBackground(new java.awt.Color(214, 232, 219));
        panelDescuento.setPreferredSize(new java.awt.Dimension(320, 50));

        lblSubtitle2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblSubtitle2.setText("DESCUENTO A CLIENTES HABITUALES:");
        panelDescuento.add(lblSubtitle2);

        lblDescuentoHabitual.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDescuentoHabitual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescuentoHabitual.setText("DESCUENTO NO REGISTRADO");
        lblDescuentoHabitual.setPreferredSize(new java.awt.Dimension(300, 16));
        panelDescuento.add(lblDescuentoHabitual);

        panelInformacion.add(panelDescuento);

        bg.add(panelInformacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPrecioActionPerformed
        
    }//GEN-LAST:event_btnConsultarPrecioActionPerformed

    private void btnHacerReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerReservaActionPerformed
        
    }//GEN-LAST:event_btnHacerReservaActionPerformed

    private void btnEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReservaActionPerformed
        
    }//GEN-LAST:event_btnEliminarReservaActionPerformed

    private void btnConsultarDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDescripcionActionPerformed
        
    }//GEN-LAST:event_btnConsultarDescripcionActionPerformed

    private void btnConsultarHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHabitacionesActionPerformed
        
    }//GEN-LAST:event_btnConsultarHabitacionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnConsultarDescripcion;
    private javax.swing.JButton btnConsultarHabitaciones;
    private javax.swing.JButton btnConsultarPrecio;
    private javax.swing.JButton btnEliminarReserva;
    private javax.swing.JButton btnHacerReserva;
    private javax.swing.JLabel lblDescuentoHabitual;
    private javax.swing.JLabel lblFinanzas;
    private javax.swing.JLabel lblHabitaciones;
    private javax.swing.JLabel lblPrecioDoble;
    private javax.swing.JLabel lblPrecioMatrimonial;
    private javax.swing.JLabel lblPrecioSimple;
    private javax.swing.JLabel lblReservas;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JLabel lblSubtitle2;
    private javax.swing.JPanel panelDescuento;
    private javax.swing.JPanel panelHabitaciones;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelPrecios;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    private void colocarInformacion() {
        int precioSimple = (int) BLHabitaciones.getPrecioHBSimple();
        int precioDoble = (int) BLHabitaciones.getPrecioHBDoble();
        int precioMatrimonial = (int) BLHabitaciones.getPrecioHBMatrimonial();
        int descuento = (int) BLClientes.getPorcentajeDescuento();
        
        if (precioSimple != 0)
            lblPrecioSimple.setText(HabitacionSimple.NOMBRE 
                    + ": " + "S/." + precioSimple);
        if (precioDoble != 0)
            lblPrecioDoble.setText(HabitacionDoble.NOMBRE 
                    + ": " + "S/." + precioDoble);
        if (precioMatrimonial != 0)
            lblPrecioMatrimonial.setText(HabitacionMatrimonial.NOMBRE 
                    + ": " + "S/." + precioMatrimonial);
        if (descuento != 0)
            lblDescuentoHabitual.setText(descuento + "%");
        
        
    }
}
