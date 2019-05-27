/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anonymous
 */
public class PanelPembayaran extends javax.swing.JPanel {
    
    private Rekening rekening;
    private Database db;
    /**
     * Creates new form PanelPembayaran
     */
    public PanelPembayaran(Rekening rekening) {
        this.rekening = rekening;
        db = new Database();
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BoxPilih3 = new javax.swing.JComboBox<>();
        PapanJenisPembayaran4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        PapanJenisPembayaran2 = new javax.swing.JLabel();
        BoxPilih1 = new javax.swing.JComboBox<>();
        PapanNo_Pelanggan2 = new javax.swing.JLabel();
        Isi_NoPelanggan1 = new javax.swing.JTextField();
        Jumlah2 = new javax.swing.JLabel();
        Isi_Jumlah1 = new javax.swing.JTextField();
        Keterangan2 = new javax.swing.JLabel();
        Kembali1 = new javax.swing.JButton();
        Bayar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        PapanJenisPembayaran3 = new javax.swing.JLabel();
        BoxPilih2 = new javax.swing.JComboBox<>();
        PapanNo_Pelanggan3 = new javax.swing.JLabel();
        Isi_NoPelanggan2 = new javax.swing.JTextField();
        Jumlah3 = new javax.swing.JLabel();
        Isi_Jumlah2 = new javax.swing.JTextField();
        Keterangan3 = new javax.swing.JLabel();
        Kembali2 = new javax.swing.JButton();
        Bayar2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(980, 505));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel13.setText("PEMBAYARAN");

        BoxPilih3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "Pembayaran PAM", "Pembayaran Internet" }));
        BoxPilih3.setToolTipText("");
        BoxPilih3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoxPilih3.setFocusCycleRoot(true);
        BoxPilih3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPilih3ActionPerformed(evt);
            }
        });

        PapanJenisPembayaran4.setText("Jenis Pembayaran");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(PapanJenisPembayaran4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(BoxPilih3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel13)))
                .addContainerGap(456, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PapanJenisPembayaran4)
                    .addComponent(BoxPilih3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel14.setText("PEMBAYARAN PAM");

        PapanJenisPembayaran2.setText("Penyedia Layanan");

        BoxPilih1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "PDAM" }));
        BoxPilih1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoxPilih1.setFocusCycleRoot(true);
        BoxPilih1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxPilih1ActionPerformed(evt);
            }
        });

        PapanNo_Pelanggan2.setText("No. Pelanggan");

        Isi_NoPelanggan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Isi_NoPelanggan1ActionPerformed(evt);
            }
        });

        Jumlah2.setText("Jumlah");

        Isi_Jumlah1.setText(" ");
        Isi_Jumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Isi_Jumlah1ActionPerformed(evt);
            }
        });

        Keterangan2.setText("Keterangan");

        Kembali1.setText("Kembali");
        Kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kembali1ActionPerformed(evt);
            }
        });

        Bayar1.setText("Bayar");
        Bayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bayar1ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Kembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bayar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PapanJenisPembayaran2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(PapanNo_Pelanggan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jumlah2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Keterangan2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Isi_NoPelanggan1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(BoxPilih1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2)
                            .addComponent(Isi_Jumlah1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel14)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoxPilih1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PapanJenisPembayaran2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Isi_NoPelanggan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(PapanNo_Pelanggan2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Isi_Jumlah1)
                    .addComponent(Jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Keterangan2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bayar1)
                    .addComponent(Kembali1))
                .addGap(124, 124, 124))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel15.setText("PEMBAYARAN INTERNET");

        PapanJenisPembayaran3.setText("Penyedia Layanan");

        BoxPilih2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "Biznet", "Telkom" }));
        BoxPilih2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoxPilih2.setFocusCycleRoot(true);

        PapanNo_Pelanggan3.setText("No. Pelanggan");

        Isi_NoPelanggan2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Isi_NoPelanggan2.setAutoscrolls(false);

        Jumlah3.setText("Jumlah");

        Isi_Jumlah2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Isi_Jumlah2.setText(" ");
        Isi_Jumlah2.setAutoscrolls(false);

        Keterangan3.setText("Keterangan");

        Kembali2.setText("Kembali");
        Kembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kembali2ActionPerformed(evt);
            }
        });

        Bayar2.setText("Bayar");
        Bayar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bayar2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Kembali2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PapanJenisPembayaran3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(PapanNo_Pelanggan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jumlah3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Keterangan3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Isi_NoPelanggan2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(BoxPilih2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Isi_Jumlah2)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Bayar2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BoxPilih2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PapanJenisPembayaran3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Isi_NoPelanggan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(PapanNo_Pelanggan3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Isi_Jumlah2)
                            .addComponent(Jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(Keterangan3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kembali2)
                    .addComponent(Bayar2))
                .addGap(113, 113, 113))
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-15, -39, 1080, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void BoxPilih3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPilih3ActionPerformed
        // TODO add your handling code here:
        if (BoxPilih3.getSelectedIndex()==1){
            jTabbedPane1.setSelectedIndex(1);
        }
        else if (BoxPilih3.getSelectedIndex()==2){
            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_BoxPilih3ActionPerformed

    private void Kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kembali1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_Kembali1ActionPerformed

    private void Kembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kembali2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_Kembali2ActionPerformed

    private void Isi_Jumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Isi_Jumlah1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Isi_Jumlah1ActionPerformed

    private void Isi_NoPelanggan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Isi_NoPelanggan1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Isi_NoPelanggan1ActionPerformed

    private void Bayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bayar1ActionPerformed
        String pilihanLayanan = "";  
        String noPelanggan = "";
        String keterangan = "";
        
        try {
            System.out.println("Pembayaran PAM");
            perhitungan1();
            pilihanLayanan = (String)BoxPilih1.getSelectedItem();
            noPelanggan = Isi_NoPelanggan1.getText();
            keterangan = jTextArea2.getText();
            System.out.println("Layanan: "+pilihanLayanan);
            System.out.println("No Pelanggan: "+noPelanggan);
            System.out.println("Keterangan: "+keterangan);
        } catch (InvalidSaldoException ex) {
            Logger.getLogger(PanelPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidBalanceExeption ex) {
            Logger.getLogger(PanelPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bayar1ActionPerformed

    private void Bayar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bayar2ActionPerformed
        // TODO add your handling code here:
        String pilihanLayanan = "";
        String noPelanggan = "";
        String keterangan = "";
        
        try {
            System.out.println("Pembayaran Internet: ");
            perhitungan2();
            pilihanLayanan = (String)BoxPilih2.getSelectedItem();
            noPelanggan = Isi_NoPelanggan2.getText();
            keterangan = jTextArea1.getText();
            System.out.println("Layanan: "+pilihanLayanan);
            System.out.println("No Pelanggan: "+noPelanggan);
            System.out.println("Keterangan: "+keterangan);
        } catch (InvalidSaldoException ex) {
            Logger.getLogger(PanelPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidBalanceExeption ex) {
            Logger.getLogger(PanelPembayaran.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bayar2ActionPerformed

    private void BoxPilih1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxPilih1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxPilih1ActionPerformed

    private void perhitungan1() throws InvalidSaldoException, InvalidBalanceExeption{
        double hitung = 0;
        
        try{
            System.out.println("Saldo sebelum bayar: "+rekening.getSaldo());
           double jumlah = Double.parseDouble(Isi_Jumlah1.getText());
           rekening.pembayaranDanPembelian(jumlah);
            System.out.println("Saldo sesudah bayar: "+rekening.getSaldo());
            db.updateBalance(rekening);
            db.insertLog(rekening, "Berhasil Melakukan Pembayaran "+(String)BoxPilih1.getSelectedItem()+" ke: "+ Isi_NoPelanggan1.getText() , jumlah, "debit");
            JOptionPane.showMessageDialog(null, "Berhasil Melakukan Pembayaran", "Success!", JOptionPane.INFORMATION_MESSAGE);
        }catch (InvalidSaldoException ex) {
            String msg = ex.getMessage().toString();
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidBalanceExeption ex) {
            String msg = ex.getMessage().toString();
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void perhitungan2() throws InvalidSaldoException, InvalidBalanceExeption{
        double hitung = 0;
        
        try{
            System.out.println("Saldo sebelum bayar: "+rekening.getSaldo());
           double jumlah = Double.parseDouble(Isi_Jumlah2.getText());
           rekening.pembayaranDanPembelian(jumlah);
            System.out.println("Saldo sesudah bayar: "+rekening.getSaldo());
            db.updateBalance(rekening);
            db.insertLog(rekening, "Berhasil Melakukan Pembayaran "+(String)BoxPilih2.getSelectedItem()+" ke: "+ Isi_NoPelanggan2.getText() , jumlah, "debit");
            JOptionPane.showMessageDialog(null, "Berhasil Melakukan Pembayaran", "Success!", JOptionPane.INFORMATION_MESSAGE);
        }catch (InvalidSaldoException ex) {
            String msg = ex.getMessage().toString();
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        } catch (InvalidBalanceExeption ex) {
            String msg = ex.getMessage().toString();
            JOptionPane.showMessageDialog(null, msg, "", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bayar1;
    private javax.swing.JButton Bayar2;
    private javax.swing.JComboBox<String> BoxPilih1;
    private javax.swing.JComboBox<String> BoxPilih2;
    private javax.swing.JComboBox<String> BoxPilih3;
    private javax.swing.JTextField Isi_Jumlah1;
    private javax.swing.JTextField Isi_Jumlah2;
    private javax.swing.JTextField Isi_NoPelanggan1;
    private javax.swing.JTextField Isi_NoPelanggan2;
    private javax.swing.JLabel Jumlah2;
    private javax.swing.JLabel Jumlah3;
    private javax.swing.JButton Kembali1;
    private javax.swing.JButton Kembali2;
    private javax.swing.JLabel Keterangan2;
    private javax.swing.JLabel Keterangan3;
    private javax.swing.JLabel PapanJenisPembayaran2;
    private javax.swing.JLabel PapanJenisPembayaran3;
    private javax.swing.JLabel PapanJenisPembayaran4;
    private javax.swing.JLabel PapanNo_Pelanggan2;
    private javax.swing.JLabel PapanNo_Pelanggan3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
