
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class KullaniciEkrani extends javax.swing.JFrame {
    DefaultTableModel geneltablo;
    DefaultTableModel ulketablo;
    DefaultTableModel poptablo;
    DefaultTableModel jazztablo;
    DefaultTableModel klasiktablo;
    Sql islemler = new Sql();
    String k_adi;
    
    public KullaniciEkrani() {
        initComponents();
    }
    public KullaniciEkrani(String kadi){
        initComponents();
        k_adi = kadi;
        geneltablo = (DefaultTableModel) geneltop10.getModel();
        ulketablo = (DefaultTableModel) ulketop10.getModel();
        poptablo = (DefaultTableModel) poptop10.getModel();
        jazztablo = (DefaultTableModel) jazztop10.getModel();
        klasiktablo = (DefaultTableModel) klasiktop10.getModel();
        geneltop10Goster();
        poptop10Goster();
        jazztop10Goster();
        klasiktop10Goster();
    //    ulketop10Goster(kadi,ulkeb);
    }
    
    private void geneltop10Goster(){
        geneltablo.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.genelTop10();
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                geneltablo.addRow(eklenecek);
            }
        }
    }
    
    private void ulketop10Goster(String kullanicia,String ulkebil){
        ulketablo.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.ulkeTop10(kullanicia,ulkebil);
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                ulketablo.addRow(eklenecek);
            }
        }
    }
    
    private void poptop10Goster(){
        poptablo.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.popTop10();
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                poptablo.addRow(eklenecek);
            }
        }
    }
    
    private void jazztop10Goster(){
        jazztablo.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.jazzTop10();
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                jazztablo.addRow(eklenecek);
            }
        }
    }
    
    private void klasiktop10Goster(){
        klasiktablo.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.klasikTop10();
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                klasiktablo.addRow(eklenecek);
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        geneltop10 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ulketop10 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        poptop10 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jazztop10 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        klasiktop10 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calmalistesinegit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setName("KullaniciEkrani"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));

        geneltop10.setBackground(new java.awt.Color(51, 51, 51));
        geneltop10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        geneltop10.setForeground(new java.awt.Color(162, 226, 168));
        geneltop10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Şarkı Adı", "Sanatçı", "Dinlenme Sayısı", "Tür"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        geneltop10.setGridColor(new java.awt.Color(51, 51, 51));
        geneltop10.setOpaque(false);
        geneltop10.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(geneltop10);
        if (geneltop10.getColumnModel().getColumnCount() > 0) {
            geneltop10.getColumnModel().getColumn(0).setResizable(false);
            geneltop10.getColumnModel().getColumn(1).setResizable(false);
            geneltop10.getColumnModel().getColumn(2).setResizable(false);
            geneltop10.getColumnModel().getColumn(3).setResizable(false);
            geneltop10.getColumnModel().getColumn(4).setResizable(false);
        }

        ulketop10.setBackground(new java.awt.Color(51, 51, 51));
        ulketop10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ulketop10.setForeground(new java.awt.Color(162, 226, 168));
        ulketop10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Şarkı Adı", "Sanatçı", "Dinlenme Sayısı", "Tür"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ulketop10.setGridColor(new java.awt.Color(51, 51, 51));
        ulketop10.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(ulketop10);
        if (ulketop10.getColumnModel().getColumnCount() > 0) {
            ulketop10.getColumnModel().getColumn(0).setResizable(false);
            ulketop10.getColumnModel().getColumn(1).setResizable(false);
            ulketop10.getColumnModel().getColumn(2).setResizable(false);
            ulketop10.getColumnModel().getColumn(4).setResizable(false);
        }

        poptop10.setBackground(new java.awt.Color(51, 51, 51));
        poptop10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        poptop10.setForeground(new java.awt.Color(162, 226, 168));
        poptop10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Şarkı Adı", "Sanatçı", "Dinlenme Sayısı", "Tür"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        poptop10.setGridColor(new java.awt.Color(51, 51, 51));
        poptop10.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(poptop10);
        if (poptop10.getColumnModel().getColumnCount() > 0) {
            poptop10.getColumnModel().getColumn(0).setResizable(false);
            poptop10.getColumnModel().getColumn(1).setResizable(false);
            poptop10.getColumnModel().getColumn(2).setResizable(false);
            poptop10.getColumnModel().getColumn(3).setResizable(false);
            poptop10.getColumnModel().getColumn(4).setResizable(false);
        }

        jazztop10.setBackground(new java.awt.Color(51, 51, 51));
        jazztop10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jazztop10.setForeground(new java.awt.Color(162, 226, 168));
        jazztop10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Şarkı Adı", "Sanatçı", "Dinlenme Sayısı", "Tür"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jazztop10.setGridColor(new java.awt.Color(51, 51, 51));
        jazztop10.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(jazztop10);
        if (jazztop10.getColumnModel().getColumnCount() > 0) {
            jazztop10.getColumnModel().getColumn(0).setResizable(false);
            jazztop10.getColumnModel().getColumn(1).setResizable(false);
            jazztop10.getColumnModel().getColumn(2).setResizable(false);
            jazztop10.getColumnModel().getColumn(3).setResizable(false);
            jazztop10.getColumnModel().getColumn(4).setResizable(false);
        }

        klasiktop10.setBackground(new java.awt.Color(51, 51, 51));
        klasiktop10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        klasiktop10.setForeground(new java.awt.Color(162, 226, 168));
        klasiktop10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Şarkı Adı", "Sanatçı", "Dinlenme Sayısı", "Tür"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        klasiktop10.setGridColor(new java.awt.Color(51, 51, 51));
        klasiktop10.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane5.setViewportView(klasiktop10);
        if (klasiktop10.getColumnModel().getColumnCount() > 0) {
            klasiktop10.getColumnModel().getColumn(0).setResizable(false);
            klasiktop10.getColumnModel().getColumn(1).setResizable(false);
            klasiktop10.getColumnModel().getColumn(2).setResizable(false);
            klasiktop10.getColumnModel().getColumn(3).setResizable(false);
            klasiktop10.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 226, 168));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GENEL TOP 10");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 226, 168));
        jLabel2.setText("ÜLKE TOP 10");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 226, 168));
        jLabel3.setText("POP TOP 10");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 226, 168));
        jLabel4.setText("JAZZ TOP 10");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 226, 168));
        jLabel5.setText("KLASİK TOP 10");

        calmalistesinegit.setBackground(new java.awt.Color(51, 51, 51));
        calmalistesinegit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calmalistesinegit.setForeground(new java.awt.Color(255, 255, 255));
        calmalistesinegit.setText("Çalma Listesine Git");
        calmalistesinegit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calmalistesinegitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(calmalistesinegit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(305, 305, 305))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calmalistesinegit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1501, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calmalistesinegitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calmalistesinegitActionPerformed
    //    KullaniciCalmaListesi kullanicilistesi = new KullaniciCalmaListesi();
        new KullaniciCalmaListesi (k_adi).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_calmalistesinegitActionPerformed

    
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
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciEkrani().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calmalistesinegit;
    private javax.swing.JTable geneltop10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jazztop10;
    private javax.swing.JTable klasiktop10;
    private javax.swing.JTable poptop10;
    private javax.swing.JTable ulketop10;
    // End of variables declaration//GEN-END:variables
}
