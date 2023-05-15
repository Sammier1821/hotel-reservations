package presentacion;

public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        btnRecepcionista = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(153, 169, 143));
        bg.setMinimumSize(new java.awt.Dimension(0, 0));
        bg.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        panelTitle.setBackground(new java.awt.Color(193, 208, 181));
        panelTitle.setPreferredSize(new java.awt.Dimension(350, 110));
        panelTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        title.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/iconos/hotel.png"))); // NOI18N
        title.setText("HOTEL CIELO");
        title.setMaximumSize(new java.awt.Dimension(9999, 9999));
        title.setPreferredSize(new java.awt.Dimension(460, 100));
        panelTitle.add(title);

        bg.add(panelTitle);

        panelButtons.setBackground(new java.awt.Color(193, 208, 181));
        panelButtons.setPreferredSize(new java.awt.Dimension(350, 150));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnRecepcionista.setBackground(new java.awt.Color(214, 232, 219));
        btnRecepcionista.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnRecepcionista.setForeground(new java.awt.Color(33, 42, 62));
        btnRecepcionista.setText("RECEPCIONISTA");
        btnRecepcionista.setMaximumSize(new java.awt.Dimension(9999, 9999));
        btnRecepcionista.setPreferredSize(new java.awt.Dimension(320, 60));
        btnRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionistaActionPerformed(evt);
            }
        });
        panelButtons.add(btnRecepcionista);

        btnAdministrador.setBackground(new java.awt.Color(214, 232, 219));
        btnAdministrador.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(33, 42, 62));
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setMaximumSize(new java.awt.Dimension(9999, 9999));
        btnAdministrador.setPreferredSize(new java.awt.Dimension(320, 60));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        panelButtons.add(btnAdministrador);

        bg.add(panelButtons);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        new FrmAdministrador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionistaActionPerformed
        new FrmRecepcionista().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRecepcionistaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnRecepcionista;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
