import javax.swing.JOptionPane;


public class GirisEkrani extends javax.swing.JFrame {

    
    public GirisEkrani() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GirisEkrani = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kullaniciadigirisi = new javax.swing.JTextField();
        girisYapButonu = new javax.swing.JButton();
        adminGirisButonu = new javax.swing.JButton();
        kayitOlButonu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sifregirisi = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setName("GirisEkrani"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));

        GirisEkrani.setBackground(new java.awt.Color(51, 51, 51));
        GirisEkrani.setMaximumSize(new java.awt.Dimension(1500, 800));
        GirisEkrani.setMinimumSize(new java.awt.Dimension(1500, 800));
        GirisEkrani.setPreferredSize(new java.awt.Dimension(1500, 800));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 226, 168));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Kullanıcı Adı :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 226, 168));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Şifre :");

        kullaniciadigirisi.setBackground(new java.awt.Color(51, 51, 51));
        kullaniciadigirisi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kullaniciadigirisi.setForeground(new java.awt.Color(255, 255, 255));
        kullaniciadigirisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciadigirisiActionPerformed(evt);
            }
        });

        girisYapButonu.setBackground(new java.awt.Color(51, 51, 51));
        girisYapButonu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        girisYapButonu.setForeground(new java.awt.Color(255, 255, 255));
        girisYapButonu.setText("Giriş Yap");
        girisYapButonu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        girisYapButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButonuActionPerformed(evt);
            }
        });

        adminGirisButonu.setBackground(new java.awt.Color(51, 51, 51));
        adminGirisButonu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminGirisButonu.setForeground(new java.awt.Color(255, 255, 255));
        adminGirisButonu.setText("Admin Girişi");
        adminGirisButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminGirisButonuActionPerformed(evt);
            }
        });

        kayitOlButonu.setBackground(new java.awt.Color(51, 51, 51));
        kayitOlButonu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kayitOlButonu.setForeground(new java.awt.Color(255, 255, 255));
        kayitOlButonu.setText("Kayıt Ol");
        kayitOlButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButonuActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gulay\\Documents\\NetBeansProjects\\prolabproje2.3\\img\\icon.png")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 226, 168));
        jLabel4.setText("Üye değil misiniz ?");

        sifregirisi.setBackground(new java.awt.Color(51, 51, 51));
        sifregirisi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sifregirisi.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout GirisEkraniLayout = new javax.swing.GroupLayout(GirisEkrani);
        GirisEkrani.setLayout(GirisEkraniLayout);
        GirisEkraniLayout.setHorizontalGroup(
            GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkraniLayout.createSequentialGroup()
                .addGap(674, 674, 674)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirisEkraniLayout.createSequentialGroup()
                .addGap(0, 499, Short.MAX_VALUE)
                .addGroup(GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(GirisEkraniLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(kullaniciadigirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(adminGirisButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girisYapButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(GirisEkraniLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sifregirisi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(593, 593, 593))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GirisEkraniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kayitOlButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(679, 679, 679))
        );
        GirisEkraniLayout.setVerticalGroup(
            GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkraniLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kullaniciadigirisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifregirisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addComponent(girisYapButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminGirisButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(kayitOlButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisEkrani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GirisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciadigirisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciadigirisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciadigirisiActionPerformed

    private void girisYapButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButonuActionPerformed
        String kullaniciadi = kullaniciadigirisi.getText();
        String kullanicisifre = new String(sifregirisi.getPassword());
        Sql baglanti = new Sql();
        
        int flag1 = baglanti.kullaniciKontrol(kullaniciadi);
        int flag2 = baglanti.sifreKontrol(kullanicisifre);
        String ulkeadi = baglanti.ulkeKontrol(kullaniciadi);
        String kuladi = baglanti.kullaniciadiKontrol(kullaniciadi);
       
        if ((flag1 == 1) && (flag2 == 1)){
            new KullaniciEkrani(kuladi).setVisible(true);
        //    kullaniciekrani.setVisible(true);
            setVisible(false);
        }
        else if ((flag1 == 1) && (flag2 == 0)){
            JOptionPane.showMessageDialog(this, "Girdiginiz sifre yanlis");
        }
        else if ((flag1 == 0) && (flag2 == 1)){
            JOptionPane.showMessageDialog(this, "Girdiginiz kullanici adi yanlis");
        }
        else if ((flag1 == 0) && (flag2 == 0)){
            JOptionPane.showMessageDialog(this, "Böyle bir kullanici bulunmamaktadir. Lütfen kayit butonuna basarak kayit olunuz");
        }
    }//GEN-LAST:event_girisYapButonuActionPerformed

    private void adminGirisButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminGirisButonuActionPerformed
        String kullaniciadi = kullaniciadigirisi.getText();
        String kullanicisifre = new String(sifregirisi.getPassword());
        AdminEkrani adminekrani =new AdminEkrani();
        adminekrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminGirisButonuActionPerformed

    private void kayitOlButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButonuActionPerformed
        KayitOlEkrani kayitekrani = new KayitOlEkrani();
        kayitekrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kayitOlButonuActionPerformed

    
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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new GirisEkrani().setVisible(true);             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GirisEkrani;
    private javax.swing.JButton adminGirisButonu;
    private javax.swing.JButton girisYapButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton kayitOlButonu;
    private javax.swing.JTextField kullaniciadigirisi;
    private javax.swing.JPasswordField sifregirisi;
    // End of variables declaration//GEN-END:variables
}
