/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anonymous
 */
public class PanelTransfer extends javax.swing.JPanel {
    
    private Rekening rekening;
    Database db;
    /**
     * 
     * Creates new form PanelTransfer
     */
    public PanelTransfer(Rekening rekening) {
        initComponents();
        this.rekening = rekening;
        db = new Database();
        labelNorekAwal.setText(rekening.getNorek());
        labelNamaAwal.setText(rekening.getNasabah().getNamaNasabah());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabIndex = new javax.swing.JTabbedPane();
        menuAwal = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        labelNamaAwal = new java.awt.Label();
        labelNorekAwal = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jComboBoxTransfer = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        labelNamaAntarRek = new java.awt.Label();
        label9 = new java.awt.Label();
        labelRekAntarRekening = new java.awt.Label();
        textJumlah = new javax.swing.JTextField();
        label11 = new java.awt.Label();
        textNoRekening = new javax.swing.JTextField();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        textBerita = new javax.swing.JTextArea();
        btnBatal = new javax.swing.JButton();
        btnLanjutkan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        labelNamaAntarBank = new java.awt.Label();
        label17 = new java.awt.Label();
        labelNoRekAntarBank = new java.awt.Label();
        textJumlahAntarBank = new javax.swing.JTextField();
        label19 = new java.awt.Label();
        textNorekAntarBank = new javax.swing.JTextField();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        textBeritaAntarBank = new javax.swing.JTextArea();
        btnBatalAntarBank = new javax.swing.JButton();
        btnLanjutAntarBank = new javax.swing.JButton();
        label22 = new java.awt.Label();
        comboNamaBank = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(980, 505));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel13.setText("TRANSFER DANA - DAFTAR REKENING TUJUAN");

        labelNamaAwal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelNamaAwal.setText("NAMA");

        labelNorekAwal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelNorekAwal.setText("REK");

        label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label3.setText("NO REKENING");

        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setText("NAMA");

        label5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label5.setText("Tansfer Ke");

        jComboBoxTransfer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxTransfer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "Rekening Bank Bank", "Rekening Bank Lain" }));
        jComboBoxTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAwalLayout = new javax.swing.GroupLayout(menuAwal);
        menuAwal.setLayout(menuAwalLayout);
        menuAwalLayout.setHorizontalGroup(
            menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAwalLayout.createSequentialGroup()
                .addGroup(menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAwalLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNorekAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuAwalLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuAwalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel13)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        menuAwalLayout.setVerticalGroup(
            menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addGroup(menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNorekAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(menuAwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );

        tabIndex.addTab("tab1", menuAwal);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel14.setText("TRANSFER ANTAR REKENING");

        label6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label6.setText("NO REKENING");

        label7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label7.setText("NAMA");

        labelNamaAntarRek.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelNamaAntarRek.setText("NAMA");

        label9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label9.setText("Rekening Penerima");

        labelRekAntarRekening.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelRekAntarRekening.setText("REK");

        textJumlah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        label11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label11.setText("Jumlah");

        textNoRekening.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        label12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label12.setText("No Rekening");

        label13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label13.setText("Berita");

        textBerita.setColumns(20);
        textBerita.setRows(5);
        jScrollPane1.setViewportView(textBerita);

        btnBatal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnLanjutkan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLanjutkan.setText("LANJUTKAN");
        btnLanjutkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRekAntarRekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnBatal)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLanjutkan))
                                .addComponent(textNoRekening, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addComponent(labelNamaAntarRek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textJumlah)
                                .addComponent(jScrollPane1)))))
                .addGap(297, 297, 297))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(labelRekAntarRekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaAntarRek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNoRekening, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLanjutkan)
                    .addComponent(btnBatal))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tabIndex.addTab("tab2", jPanel2);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel15.setText("TRANSFER ANTAR BANK");

        label14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label14.setText("NO REKENING");

        label15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label15.setText("NAMA");

        labelNamaAntarBank.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelNamaAntarBank.setText("NAMA");

        label17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label17.setText("Rekening Penerima");

        labelNoRekAntarBank.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelNoRekAntarBank.setText("REK");

        textJumlahAntarBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        label19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label19.setText("Jumlah");

        textNorekAntarBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        label20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label20.setText("Nama Bank");

        label21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label21.setText("Berita");

        textBeritaAntarBank.setColumns(20);
        textBeritaAntarBank.setRows(5);
        jScrollPane2.setViewportView(textBeritaAntarBank);

        btnBatalAntarBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBatalAntarBank.setText("BATAL");
        btnBatalAntarBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalAntarBankActionPerformed(evt);
            }
        });

        btnLanjutAntarBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLanjutAntarBank.setText("LANJUTKAN");
        btnLanjutAntarBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutAntarBankActionPerformed(evt);
            }
        });

        label22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label22.setText("No Rekening");

        comboNamaBank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboNamaBank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih", "Mandiri", "BCA", "BRI", "BTN" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelNoRekAntarBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnBatalAntarBank)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLanjutAntarBank))
                            .addComponent(labelNamaAntarBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textJumlahAntarBank)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(textNorekAntarBank)
                            .addComponent(comboNamaBank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNoRekAntarBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaAntarBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJumlahAntarBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(comboNamaBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textNorekAntarBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLanjutAntarBank)
                            .addComponent(btnBatalAntarBank)))
                    .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        tabIndex.addTab("tab4", jPanel4);

        add(tabIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -40, 1110, 550));
        tabIndex.getAccessibleContext().setAccessibleName("tab1");
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTransferActionPerformed
        // TODO add your handling code here:
        if(jComboBoxTransfer.getSelectedIndex()==1){
            
            labelRekAntarRekening.setText(rekening.getNorek());
            labelNamaAntarRek.setText(rekening.getNasabah().getNamaNasabah());
            tabIndex.setSelectedIndex(1);
        }
        else if (jComboBoxTransfer.getSelectedIndex()==2){
            labelNoRekAntarBank.setText(rekening.getNorek());
            labelNamaAntarBank.setText(rekening.getNasabah().getNamaNasabah());
            tabIndex.setSelectedIndex(2);
        }
    }//GEN-LAST:event_jComboBoxTransferActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
            // TODO add your handling code here:
        tabIndex.setSelectedIndex(0);
        jComboBoxTransfer.setSelectedIndex(0);
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnBatalAntarBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalAntarBankActionPerformed
        // TODO add your handling code here:
        tabIndex.setSelectedIndex(0);
        jComboBoxTransfer.setSelectedIndex(0);
    }//GEN-LAST:event_btnBatalAntarBankActionPerformed

    private void btnLanjutkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutkanActionPerformed
        // TODO add your handling code here:
        System.out.println("masuk");
        
        try{
            ArrayList<Rekening> users = db.getAllUser();
            
            boolean status = false;
            Rekening penerima = null;
            for(int i=0; i<users.size(); i++){
                if(textNoRekening.getText().equals(users.get(i).getNorek())){
                    penerima = users.get(i);
                    status = true;
                    break;
                }
            }
            
            if(status){
                
                double limit = 0.00;
                
                if(rekening instanceof RekeningBisnis){
                    RekeningBisnis rekbis = (RekeningBisnis) rekening;
                    limit = rekbis.limitTransfer;
                }
                else if(rekening instanceof RekeningBiasa){
                    RekeningBiasa rekbiasa = (RekeningBiasa) rekening;
                    limit = rekbiasa.limitTransfer;
                }
                System.out.println("limit: "+ limit);
               if(db.getNominal(rekening) >=limit) throw new InvalidLimitException();
                
                System.out.println("sebelum di transfer: " + penerima.getSaldo());
                rekening.transfer(Double.parseDouble(textJumlah.getText()), penerima);
                System.out.println("setelah di transfer: " + penerima.getSaldo());
                db.updateBalance(rekening);
                db.updateBalance(penerima);
                db.insertLog(rekening, "Berhasil Transfer ke: " + penerima.getNorek() +" berita: " + textBerita.getText(), Double.parseDouble(textJumlah.getText()), "debit");
                db.insertLog(penerima, rekening.getNorek() + " mentransfer dana" +" berita: " + textBerita.getText(), Double.parseDouble(textJumlah.getText()), "kredit");
                JOptionPane.showMessageDialog(null, "Transfer Berhasil", "Success!", JOptionPane.INFORMATION_MESSAGE);
                textJumlah.setText("");
                textNoRekening.setText("");
                textBerita.setText("");
                tabIndex.setSelectedIndex(0);
                jComboBoxTransfer.setSelectedIndex(0);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Tidak ada rekening yang sama", "Fail", JOptionPane.INFORMATION_MESSAGE);
            }
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (InvalidBalanceExeption ibe){
            JOptionPane.showMessageDialog(null, ibe.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (InvalidSaldoException ise){
            JOptionPane.showMessageDialog(null, ise.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(InvalidLimitException ile){
            JOptionPane.showMessageDialog(null, ile.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLanjutkanActionPerformed

    private void btnLanjutAntarBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutAntarBankActionPerformed
        // TODO add your handling code here:
        try{
                double limit = 0.00;
                
                if(rekening instanceof RekeningBisnis){
                    RekeningBisnis rekbis = (RekeningBisnis) rekening;
                    limit = rekbis.limitTransfer;
                }
                else if(rekening instanceof RekeningBiasa){
                    RekeningBiasa rekbiasa = (RekeningBiasa) rekening;
                    limit = rekbiasa.limitTransfer;
                }
                System.out.println("limit: "+ limit);
               if(db.getNominal(rekening) >=limit) throw new InvalidLimitException();
                
                if(rekening instanceof RekeningBisnis){
                    RekeningBisnis rekbis = (RekeningBisnis) rekening;
                    rekbis.transfer(Double.parseDouble(textJumlahAntarBank.getText()), textNorekAntarBank.getText());
                }
                else if(rekening instanceof RekeningBiasa){
                    RekeningBiasa rekbis = (RekeningBiasa) rekening;
                    rekbis.transfer(Double.parseDouble(textJumlahAntarBank.getText()), textNorekAntarBank.getText());
                }
                
                db.updateBalance(rekening);
                db.insertLog(rekening, "Berhasil Transfer ke: " + comboNamaBank.getSelectedItem() +"  "+ textNorekAntarBank.getText() +" berita: " + textBeritaAntarBank.getText(), Double.parseDouble(textJumlahAntarBank.getText()), "debit");
                JOptionPane.showMessageDialog(null, "Transfer Berhasil", "Success!", JOptionPane.INFORMATION_MESSAGE);
                textJumlahAntarBank.setText("");
                textNorekAntarBank.setText("");
                textBeritaAntarBank.setText("");
                tabIndex.setSelectedIndex(0);
                jComboBoxTransfer.setSelectedIndex(0);
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (InvalidBalanceExeption ibe){
            JOptionPane.showMessageDialog(null, ibe.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (InvalidSaldoException ise){
            JOptionPane.showMessageDialog(null, ise.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(InvalidLimitException ile){
            JOptionPane.showMessageDialog(null, ile.getMessage(), "Fail", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnLanjutAntarBankActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatalAntarBank;
    private javax.swing.JButton btnLanjutAntarBank;
    private javax.swing.JButton btnLanjutkan;
    private javax.swing.JComboBox<String> comboNamaBank;
    private javax.swing.JComboBox<String> jComboBoxTransfer;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label17;
    private java.awt.Label label19;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label9;
    private java.awt.Label labelNamaAntarBank;
    private java.awt.Label labelNamaAntarRek;
    private java.awt.Label labelNamaAwal;
    private java.awt.Label labelNoRekAntarBank;
    private java.awt.Label labelNorekAwal;
    private java.awt.Label labelRekAntarRekening;
    private javax.swing.JPanel menuAwal;
    private javax.swing.JTabbedPane tabIndex;
    private javax.swing.JTextArea textBerita;
    private javax.swing.JTextArea textBeritaAntarBank;
    private javax.swing.JTextField textJumlah;
    private javax.swing.JTextField textJumlahAntarBank;
    private javax.swing.JTextField textNoRekening;
    private javax.swing.JTextField textNorekAntarBank;
    // End of variables declaration//GEN-END:variables
}
