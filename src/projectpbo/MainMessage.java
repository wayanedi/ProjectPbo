/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

/**
 *
 * @author anonymous
 */
public class MainMessage extends javax.swing.JPanel {
        private Database ds;
    /** 
     * Creates new form MainMessage
     */
    public MainMessage() {
        initComponents();
    }
    
    public MainMessage(Rekening rekening) {
        initComponents();
        label_user.setText(rekening.getNasabah().getNamaNasabah());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_user = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 505));

        label_user.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        label_user.setText("USER");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel14.setText("MENU UTAMA");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel15.setText("SELAMAT DATANG,");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(428, 428, 428)
                .addComponent(label_user)
                .addContainerGap(460, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(335, 335, 335)
                    .addComponent(jLabel14)
                    .addContainerGap(399, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(299, 299, 299)
                    .addComponent(jLabel15)
                    .addContainerGap(341, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(label_user)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel14)
                    .addContainerGap(441, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jLabel15)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel label_user;
    // End of variables declaration//GEN-END:variables
}
