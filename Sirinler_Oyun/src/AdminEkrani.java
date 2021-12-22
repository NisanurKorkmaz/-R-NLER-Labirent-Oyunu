
public class AdminEkrani extends javax.swing.JFrame {

    
    public AdminEkrani() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sarkiEkle = new javax.swing.JButton();
        EklemeYap = new javax.swing.JLabel();
        sanatciEkle = new javax.swing.JButton();
        albumEkle = new javax.swing.JButton();
        sarkiSil = new javax.swing.JButton();
        sanatciSil = new javax.swing.JButton();
        albumSil = new javax.swing.JButton();
        sarkiAdi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sanatciAdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tarih = new javax.swing.JTextField();
        sanatciTur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sarkiSure = new javax.swing.JTextField();
        dinlenmeSayisi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ulke = new javax.swing.JTextField();
        albumAdi = new javax.swing.JTextField();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setName("AdminEkrani"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 800));

        sarkiEkle.setBackground(new java.awt.Color(51, 51, 51));
        sarkiEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sarkiEkle.setForeground(new java.awt.Color(255, 255, 255));
        sarkiEkle.setText("Şarkı Ekle");
        sarkiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarkiEkleActionPerformed(evt);
            }
        });

        EklemeYap.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EklemeYap.setForeground(new java.awt.Color(162, 226, 168));
        EklemeYap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EklemeYap.setText("Yapmak istediğiniz  işlemin üstüne basınız");
        EklemeYap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sanatciEkle.setBackground(new java.awt.Color(51, 51, 51));
        sanatciEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sanatciEkle.setForeground(new java.awt.Color(255, 255, 255));
        sanatciEkle.setText("Sanatçı Ekle");
        sanatciEkle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sanatciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanatciEkleActionPerformed(evt);
            }
        });

        albumEkle.setBackground(new java.awt.Color(51, 51, 51));
        albumEkle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        albumEkle.setForeground(new java.awt.Color(255, 255, 255));
        albumEkle.setText("Albüm Ekle");
        albumEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumEkleActionPerformed(evt);
            }
        });

        sarkiSil.setBackground(new java.awt.Color(51, 51, 51));
        sarkiSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sarkiSil.setForeground(new java.awt.Color(255, 255, 255));
        sarkiSil.setText("Şarkı Sil");
        sarkiSil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sarkiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarkiSilActionPerformed(evt);
            }
        });

        sanatciSil.setBackground(new java.awt.Color(51, 51, 51));
        sanatciSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sanatciSil.setForeground(new java.awt.Color(255, 255, 255));
        sanatciSil.setText("Sanatçı Sil");
        sanatciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sanatciSilActionPerformed(evt);
            }
        });

        albumSil.setBackground(new java.awt.Color(51, 51, 51));
        albumSil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        albumSil.setForeground(new java.awt.Color(255, 255, 255));
        albumSil.setText("Albüm Sil");
        albumSil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        albumSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumSilActionPerformed(evt);
            }
        });

        sarkiAdi.setBackground(new java.awt.Color(51, 51, 51));
        sarkiAdi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sarkiAdi.setForeground(new java.awt.Color(255, 255, 255));
        sarkiAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sarkiAdiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 226, 168));
        jLabel1.setText("Şarkı adını giriniz :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 226, 168));
        jLabel2.setText("Sanatçı adını giriniz :");

        sanatciAdi.setBackground(new java.awt.Color(51, 51, 51));
        sanatciAdi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sanatciAdi.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 226, 168));
        jLabel3.setText("Albümün adını giriniz :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(162, 226, 168));
        jLabel4.setText("Şarkının çıkış tarihini giriniz :");

        tarih.setBackground(new java.awt.Color(51, 51, 51));
        tarih.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tarih.setForeground(new java.awt.Color(255, 255, 255));

        sanatciTur.setBackground(new java.awt.Color(51, 51, 51));
        sanatciTur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sanatciTur.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(162, 226, 168));
        jLabel5.setText("Şarkının türünü giriniz :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(162, 226, 168));
        jLabel6.setText("Şarkının süresini giriniz :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(162, 226, 168));
        jLabel7.setText("Dinlenme sayısını giriniz :");

        sarkiSure.setBackground(new java.awt.Color(51, 51, 51));
        sarkiSure.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sarkiSure.setForeground(new java.awt.Color(255, 255, 255));

        dinlenmeSayisi.setBackground(new java.awt.Color(51, 51, 51));
        dinlenmeSayisi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dinlenmeSayisi.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(162, 226, 168));
        jLabel8.setText("(Şarkı adı , tarih, sanatçı, albüm adı, tür, dinlenme sayısı giriniz)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(162, 226, 168));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(Silmek istediğiniz şarkının adını ekleyiniz)");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(162, 226, 168));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("(Sanatçı adı ve ülke giriniz)");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(162, 226, 168));
        jLabel12.setText("(Şarkı adı, tarih, sanatçı, albüm adı, tür giriniz)");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(162, 226, 168));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("(Silmek istediğiniz sanatçının adını giriniz)");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(162, 226, 168));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("(Silmek istediğiniz albüm adını giriniz)");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(162, 226, 168));
        jLabel16.setText("Sanatçının ülkesini giriniz :");

        ulke.setBackground(new java.awt.Color(51, 51, 51));
        ulke.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ulke.setForeground(new java.awt.Color(255, 255, 255));

        albumAdi.setBackground(new java.awt.Color(51, 51, 51));
        albumAdi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        albumAdi.setForeground(new java.awt.Color(255, 255, 255));

        cikis.setBackground(new java.awt.Color(51, 51, 51));
        cikis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cikis.setForeground(new java.awt.Color(255, 255, 255));
        cikis.setText("Çıkış Yap");
        cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sanatciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EklemeYap, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sarkiAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(albumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(326, 326, 326)
                                .addComponent(sarkiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(sanatciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(225, 225, 225))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sanatciTur, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dinlenmeSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sarkiSure, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(188, 188, 188))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(albumEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(226, 226, 226))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sanatciEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(albumSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(82, 82, 82))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(49, 49, 49))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sarkiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(EklemeYap, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sarkiAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(sanatciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(albumAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sanatciEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sarkiEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sanatciTur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(albumEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sarkiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(albumSil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sanatciSil, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sarkiSure, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(dinlenmeSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ulke, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void sanatciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanatciEkleActionPerformed
        
        String sanatciadi = sanatciAdi.getText();
        String sanatciulke = ulke.getText();
        
        Sql baglanti = new Sql();
        baglanti.sanatciEkle(sanatciadi,sanatciulke);
        
    }//GEN-LAST:event_sanatciEkleActionPerformed

    private void sarkiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarkiEkleActionPerformed
        
        String sarkiadi = sarkiAdi.getText();
        String sanatciadi = sanatciAdi.getText();
        String tarihh = tarih.getText();
        String album = albumAdi.getText();
        String tur = sanatciTur.getText();
        String sure = sarkiSure.getText();
        String dinlenme = dinlenmeSayisi.getText();
        
        Sql baglanti = new Sql();
        baglanti.sarkiEkle(sarkiadi,tarihh,sanatciadi,album,tur,sure,dinlenme);
        
    }//GEN-LAST:event_sarkiEkleActionPerformed

    private void albumEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumEkleActionPerformed
        String sarkiadi = sarkiAdi.getText();
        String sanatciadi = sanatciAdi.getText();
        String tarihh = tarih.getText();
        String album = albumAdi.getText();
        String tur = sanatciTur.getText();
        
        Sql baglanti = new Sql();
        baglanti.albumEkle(album,sanatciadi,sarkiadi,tarihh,tur);

    }//GEN-LAST:event_albumEkleActionPerformed

    
    
    private void sarkiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarkiSilActionPerformed
        String sarkiadi = sarkiAdi.getText();
        
        Sql baglanti = new Sql();
        baglanti.sarkiSil(sarkiadi);
        
    }//GEN-LAST:event_sarkiSilActionPerformed

    private void sanatciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sanatciSilActionPerformed
        String sanatciadi = sanatciAdi.getText();
        
        Sql baglanti = new Sql();
        baglanti.sanatciSil(sanatciadi);
    }//GEN-LAST:event_sanatciSilActionPerformed

    private void albumSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_albumSilActionPerformed
        String album = albumAdi.getText();
        
        Sql baglanti = new Sql();
        baglanti.albumSil(album);
    }//GEN-LAST:event_albumSilActionPerformed

    
    
    
    
    private void sarkiAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sarkiAdiActionPerformed
        
    }//GEN-LAST:event_sarkiAdiActionPerformed

    private void cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisActionPerformed
        setVisible(false);
        GirisEkrani girisekrani = new GirisEkrani();
        girisekrani.setVisible(true);
    }//GEN-LAST:event_cikisActionPerformed
  
    
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
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EklemeYap;
    private javax.swing.JTextField albumAdi;
    private javax.swing.JButton albumEkle;
    private javax.swing.JButton albumSil;
    private javax.swing.JButton cikis;
    private javax.swing.JTextField dinlenmeSayisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField sanatciAdi;
    private javax.swing.JButton sanatciEkle;
    private javax.swing.JButton sanatciSil;
    private javax.swing.JTextField sanatciTur;
    private javax.swing.JTextField sarkiAdi;
    private javax.swing.JButton sarkiEkle;
    private javax.swing.JButton sarkiSil;
    private javax.swing.JTextField sarkiSure;
    private javax.swing.JTextField tarih;
    private javax.swing.JTextField ulke;
    // End of variables declaration//GEN-END:variables
}
