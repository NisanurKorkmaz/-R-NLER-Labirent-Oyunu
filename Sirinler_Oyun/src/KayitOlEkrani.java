
public class KayitOlEkrani extends javax.swing.JFrame {

    
    public KayitOlEkrani() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uyelik = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        kullaniciadikayit = new javax.swing.JTextField();
        emailkayit = new javax.swing.JTextField();
        sifrekayit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        klasikkayit = new javax.swing.JRadioButton();
        premiumkayit = new javax.swing.JRadioButton();
        ulkekayit = new javax.swing.JTextField();
        kayitOlButonu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        vazgec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));

        kullaniciadikayit.setBackground(new java.awt.Color(51, 51, 51));
        kullaniciadikayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kullaniciadikayit.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciadikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciadikayitActionPerformed(evt);
            }
        });

        emailkayit.setBackground(new java.awt.Color(51, 51, 51));
        emailkayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailkayit.setForeground(new java.awt.Color(255, 255, 255));

        sifrekayit.setBackground(new java.awt.Color(51, 51, 51));
        sifrekayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sifrekayit.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Kullanıcı Adı :");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Email :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Şifre :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Abonelik Türü :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ülke :");

        klasikkayit.setBackground(new java.awt.Color(51, 51, 51));
        uyelik.add(klasikkayit);
        klasikkayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        klasikkayit.setForeground(new java.awt.Color(255, 255, 255));
        klasikkayit.setText("Klasik");

        premiumkayit.setBackground(new java.awt.Color(51, 51, 51));
        uyelik.add(premiumkayit);
        premiumkayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        premiumkayit.setForeground(new java.awt.Color(255, 255, 255));
        premiumkayit.setText("Premium");

        ulkekayit.setBackground(new java.awt.Color(51, 51, 51));
        ulkekayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ulkekayit.setForeground(new java.awt.Color(255, 255, 255));

        kayitOlButonu.setBackground(new java.awt.Color(51, 51, 51));
        kayitOlButonu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOlButonu.setForeground(new java.awt.Color(255, 255, 255));
        kayitOlButonu.setText("Kayıt Ol");
        kayitOlButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButonuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(131, 223, 149));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Kayıt Ol");

        vazgec.setBackground(new java.awt.Color(51, 51, 51));
        vazgec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vazgec.setForeground(new java.awt.Color(255, 255, 255));
        vazgec.setText("Vazgeç");
        vazgec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vazgecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(511, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(klasikkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(premiumkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ulkekayit)
                    .addComponent(sifrekayit)
                    .addComponent(emailkayit)
                    .addComponent(kullaniciadikayit))
                .addGap(635, 635, 635))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(641, 641, 641)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kayitOlButonu, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(vazgec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullaniciadikayit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sifrekayit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(klasikkayit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(premiumkayit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ulkekayit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(kayitOlButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vazgec, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciadikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciadikayitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciadikayitActionPerformed

    private void kayitOlButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButonuActionPerformed

        Sql baglanti = new Sql();
        String abonelikturu = "";
        String odemebilgisi = "odenmedi";
        if(klasikkayit.isSelected()){
            abonelikturu = "normal";
        }
        else if(premiumkayit.isSelected()){
            abonelikturu = "premium";
        }
        baglanti.kayitEkle(kullaniciadikayit.getText(), emailkayit.getText(), sifrekayit.getText(), abonelikturu, odemebilgisi, ulkekayit.getText());
        GirisEkrani girisekrani = new GirisEkrani();    
        girisekrani.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kayitOlButonuActionPerformed

    private void vazgecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vazgecActionPerformed
        setVisible(false);
        GirisEkrani girisekrani = new GirisEkrani();
        girisekrani.setVisible(true);
    }//GEN-LAST:event_vazgecActionPerformed

    
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
            java.util.logging.Logger.getLogger(KayitOlEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitOlEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitOlEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitOlEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitOlEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailkayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kayitOlButonu;
    private javax.swing.JRadioButton klasikkayit;
    private javax.swing.JTextField kullaniciadikayit;
    private javax.swing.JRadioButton premiumkayit;
    private javax.swing.JTextField sifrekayit;
    private javax.swing.JTextField ulkekayit;
    private javax.swing.ButtonGroup uyelik;
    private javax.swing.JButton vazgec;
    // End of variables declaration//GEN-END:variables
}
