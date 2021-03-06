
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

import java.awt.GridBagLayout; 
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author anonymous
 */
public class InternetBanking extends javax.swing.JFrame {
   
    private Rekening rekening;
    PanelTransfer panelTransfer;
    PanelPembayaran panelPembayaran;
    PanelPembelian panelPembelian;
    PanelInfoRek panelInfoRek;
    MainMessage mainMessage;
    GridBagLayout layout;
    GridBagConstraints c;
    
    /**
     * Creates new form InternetBanking
     */
    
    public InternetBanking(Rekening rekening){
        
        initComponents();
        setLocationRelativeTo(null);
        this.rekening = rekening;
        c = new GridBagConstraints();
        layout = new GridBagLayout();
        panelTransfer = new PanelTransfer(rekening);
        panelPembayaran = new PanelPembayaran(rekening);
        panelPembelian = new PanelPembelian(rekening);
        panelInfoRek = new PanelInfoRek(rekening);
        mainMessage = new MainMessage(rekening);
        
        DinamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
//        c.fill = GridBagConstraints.HORIZONTAL;  
        c.gridx = 0;
        c.gridy =0;
        
        DinamicPanel.add(panelTransfer,c);
        panelTransfer.setVisible(false);
        
        DinamicPanel.add(panelPembayaran,c);
        panelPembayaran.setVisible(false);
        
         DinamicPanel.add(panelPembelian,c);
        panelPembelian.setVisible(false);
        
        DinamicPanel.add(panelInfoRek,c);
        panelInfoRek.setVisible(false);
        
        DinamicPanel.add(mainMessage,c);
        mainMessage.setVisible(true);
        
    }
    public InternetBanking() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DinamicPanel = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        btn_informasi = new javax.swing.JPanel();
        ind_info = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_trans = new javax.swing.JPanel();
        ind_trans = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_pembayaran = new javax.swing.JPanel();
        ind_pembayaran = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_pembelian = new javax.swing.JPanel();
        ind_pembelian = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DinamicPanel.setName("dinamicPanel"); // NOI18N
        DinamicPanel.setPreferredSize(new java.awt.Dimension(980, 505));

        javax.swing.GroupLayout DinamicPanelLayout = new javax.swing.GroupLayout(DinamicPanel);
        DinamicPanel.setLayout(DinamicPanelLayout);
        DinamicPanelLayout.setHorizontalGroup(
            DinamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        DinamicPanelLayout.setVerticalGroup(
            DinamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sidepanel.setBackground(new java.awt.Color(61, 61, 61));

        btn_informasi.setBackground(new java.awt.Color(63, 63, 63));
        btn_informasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_informasiMousePressed(evt);
            }
        });
        btn_informasi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_info.setOpaque(false);

        javax.swing.GroupLayout ind_infoLayout = new javax.swing.GroupLayout(ind_info);
        ind_info.setLayout(ind_infoLayout);
        ind_infoLayout.setHorizontalGroup(
            ind_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_infoLayout.setVerticalGroup(
            ind_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_informasi.add(ind_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 4, 40));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Informasi Rekening");
        btn_informasi.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_trans.setBackground(new java.awt.Color(63, 63, 63));
        btn_trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_transMousePressed(evt);
            }
        });
        btn_trans.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_trans.setOpaque(false);

        javax.swing.GroupLayout ind_transLayout = new javax.swing.GroupLayout(ind_trans);
        ind_trans.setLayout(ind_transLayout);
        ind_transLayout.setHorizontalGroup(
            ind_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_transLayout.setVerticalGroup(
            ind_transLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_trans.add(ind_trans, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 4, 40));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Transfer");
        btn_trans.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_pembayaran.setBackground(new java.awt.Color(63, 63, 63));
        btn_pembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_pembayaranMousePressed(evt);
            }
        });
        btn_pembayaran.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_pembayaran.setOpaque(false);

        javax.swing.GroupLayout ind_pembayaranLayout = new javax.swing.GroupLayout(ind_pembayaran);
        ind_pembayaran.setLayout(ind_pembayaranLayout);
        ind_pembayaranLayout.setHorizontalGroup(
            ind_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_pembayaranLayout.setVerticalGroup(
            ind_pembayaranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_pembayaran.add(ind_pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 4, 40));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pembayaran");
        btn_pembayaran.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_pembelian.setBackground(new java.awt.Color(63, 63, 63));
        btn_pembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_pembelianMousePressed(evt);
            }
        });
        btn_pembelian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_pembelian.setOpaque(false);

        javax.swing.GroupLayout ind_pembelianLayout = new javax.swing.GroupLayout(ind_pembelian);
        ind_pembelian.setLayout(ind_pembelianLayout);
        ind_pembelianLayout.setHorizontalGroup(
            ind_pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ind_pembelianLayout.setVerticalGroup(
            ind_pembelianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_pembelian.add(ind_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 4, 40));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pembelian");
        btn_pembelian.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Internet Banking");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bank - Bank");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("V 1.00");

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_informasi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_trans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_pembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_pembelian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2))
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)))
                .addGap(66, 66, 66)
                .addComponent(btn_informasi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DinamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DinamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_informasiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_informasiMousePressed
        // TODO add your handling code here:
        setColor(btn_informasi);    //set color jadi abu informasi biar keliatan dipencet
        resetColor(btn_pembayaran); //reset color jadi hitam
        resetColor(btn_pembelian);  //reset color jadi hitam
        resetColor(btn_trans);      //reset color jadi hitam
        
        ind_info.setOpaque(true);           //set garis yang ada di kiri tulisan informasi biar visible
        ind_pembayaran.setOpaque(false);    //set garis yang ada di kiri tulisan informasi biar invisible
        ind_pembelian.setOpaque(false);     //set garis yang ada di kiri tulisan informasi biar invisible
        ind_trans.setOpaque(false);         //set garis yang ada di kiri tulisan informasi biar invisible
        
        panelInfoRek = new PanelInfoRek(rekening);
        DinamicPanel.add(panelInfoRek,c);
        setVisiblePanel(false, false, false, false, true);
    }//GEN-LAST:event_btn_informasiMousePressed

    private void btn_transMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_transMousePressed
        // TODO add your handling code here:
        setColor(btn_trans);
        resetColor(btn_pembayaran);
        resetColor(btn_pembelian);
        resetColor(btn_informasi);
        
        ind_info.setOpaque(false);
        ind_pembayaran.setOpaque(false);
        ind_pembelian.setOpaque(false);
        ind_trans.setOpaque(true);
        
        panelTransfer = new PanelTransfer(rekening);
        DinamicPanel.add(panelTransfer,c);
        setVisiblePanel(false, true, false, false, false);
    }//GEN-LAST:event_btn_transMousePressed

    private void btn_pembayaranMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pembayaranMousePressed
        // TODO add your handling code here:
        setColor(btn_pembayaran);
        resetColor(btn_informasi);
        resetColor(btn_pembelian);
        resetColor(btn_trans);
        
        ind_info.setOpaque(false);
        ind_pembayaran.setOpaque(true);
        ind_pembelian.setOpaque(false);
        ind_trans.setOpaque(false);
        
        panelPembayaran = new PanelPembayaran(rekening);
        DinamicPanel.add(panelPembayaran,c);
        setVisiblePanel(false, false, true, false, false);
    }//GEN-LAST:event_btn_pembayaranMousePressed

    private void btn_pembelianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pembelianMousePressed
        // TODO add your handling code here:
        setColor(btn_pembelian);
        resetColor(btn_pembayaran);
        resetColor(btn_informasi);
        resetColor(btn_trans);
        
        ind_info.setOpaque(false);
        ind_pembayaran.setOpaque(false);
        ind_pembelian.setOpaque(true);
        ind_trans.setOpaque(false);
        
        panelPembelian = new PanelPembelian(rekening);
         DinamicPanel.add(panelPembelian,c);
        
        setVisiblePanel(false, false, false, true, false);
    }//GEN-LAST:event_btn_pembelianMousePressed

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
            java.util.logging.Logger.getLogger(InternetBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InternetBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InternetBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InternetBanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InternetBanking().setVisible(true);
            }
        });
    }
    
    //setVisible Panel
    
    private void setVisiblePanel(boolean message, boolean transfer, boolean pembayaran, boolean pembelian, boolean info){
        
        mainMessage.setVisible(message);
        panelTransfer.setVisible(transfer);
        panelPembayaran.setVisible(pembayaran);
        panelPembelian.setVisible(pembelian);
        panelInfoRek.setVisible(info);
        
    }
    
    //set reset background color
    private void setColor(JPanel panel){
        panel.setBackground(new Color(96, 96, 96));
    }
    
    private void resetColor(JPanel panel){
        panel.setBackground(new Color(61,61,61));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DinamicPanel;
    private javax.swing.JPanel btn_informasi;
    private javax.swing.JPanel btn_pembayaran;
    private javax.swing.JPanel btn_pembelian;
    private javax.swing.JPanel btn_trans;
    private javax.swing.JPanel ind_info;
    private javax.swing.JPanel ind_pembayaran;
    private javax.swing.JPanel ind_pembelian;
    private javax.swing.JPanel ind_trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
