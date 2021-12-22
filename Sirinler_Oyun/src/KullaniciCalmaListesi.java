
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KullaniciCalmaListesi extends javax.swing.JFrame {
    DefaultTableModel kpopcalmalistesi;
    DefaultTableModel kjazzcalmalistesi;
    DefaultTableModel kklasikcalmalistesi;
    DefaultTableModel pkullanicicalmalistesi;
    Sql islemler = new Sql();
    String k_calmalist;
    
    public KullaniciCalmaListesi() {
        initComponents();
    }
    
    public KullaniciCalmaListesi(String k_calmal){
        initComponents();
        k_calmalist = k_calmal;
        kpopcalmalistesi = (DefaultTableModel) kullaniciPopCalmaListesi.getModel();
        kjazzcalmalistesi = (DefaultTableModel) kullaniciJazzCalmaListesi.getModel();
        kklasikcalmalistesi = (DefaultTableModel) kullaniciKlasikCalmaListesi.getModel();
        pkullanicicalmalistesi = (DefaultTableModel) pkullaniciCalmaListesi.getModel();
        kullaniciPopCalmaListesiGoster();
        kullaniciJazzCalmaListesiGoster();
        kullaniciKlasikCalmaListesiGoster();
        pkullaniciCalmaListesiGoster();
        pkullaniciGoster();
        odemeBilgisiGoster(k_calmalist);
    }
    public void kullaniciPopCalmaListesiGoster(){
        kpopcalmalistesi.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.kullaniciPopCalmaListesi(k_calmalist);
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                kpopcalmalistesi.addRow(eklenecek);
            }
        }
    }
    
    public void kullaniciJazzCalmaListesiGoster(){
        kjazzcalmalistesi.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.kullaniciJazzCalmaListesi(k_calmalist);
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                kjazzcalmalistesi.addRow(eklenecek);
            }
        }
    }
    
    public void kullaniciKlasikCalmaListesiGoster(){
        kklasikcalmalistesi.setRowCount(0);
        
        ArrayList<Sarkilar> top10 = new ArrayList<Sarkilar>();
        top10 = islemler.kullaniciKlasikCalmaListesi(k_calmalist);
        
        if(top10 != null){
            for(Sarkilar sarki : top10){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                kklasikcalmalistesi.addRow(eklenecek);
            }
        }
    }
    
    public void odemeBilgisiGoster(String kullaniciadi){
        if((islemler.odemeBilgisi(kullaniciadi)) == 1){
            odemebilgisi.setText("Ödendi");
        }
        else if((islemler.odemeBilgisi(kullaniciadi) == 0)){
            odemebilgisi.setText("Ödenmedi");
        }
        else{
            odemebilgisi.setText("-");
        }
    }
    
    public void pkullaniciCalmaListesiGoster(){ //tüm şarkılar çekildi (düzeltilecek)
        pkullanicicalmalistesi.setRowCount(0);
        
        ArrayList<Sarkilar> tum = new ArrayList<Sarkilar>();
        tum = islemler.tumSarkilar();
        
        if(tum != null){
            for(Sarkilar sarki : tum){
                String[] eklenecek = {sarki.getSira(),sarki.getSarkiadi(),sarki.getSanatci(),sarki.getDinlenmesayisi(),sarki.getTur()};
                pkullanicicalmalistesi.addRow(eklenecek);
            }
        }
    }
    
    public void pkullaniciGoster(){
        
        ArrayList<Kullanicilar> p_kullanici = new ArrayList<Kullanicilar>();
        ArrayList<String> pkontrol = new ArrayList<String>();
        p_kullanici = islemler.premiumKullanici();
        
        for(int i=0;i<p_kullanici.size();i++){
            if(!(p_kullanici.get(i).pkullaniciad).equals(islemler.kullaniciadiKontrol(k_calmalist))){         
                String pad = String.valueOf( p_kullanici.get(i).pkullaniciad);
                pkontrol.add(pad);
            }
        }    
        
        if(pkontrol != null){
            for(int j=0;j<pkontrol.size();j++){
                String gosterilecek = (pkontrol.get(j));
                if(j == 0){
                   premium1.setText(gosterilecek); 
                }
                else if (j == 1){
                    premium2.setText(gosterilecek); 
                }
                else if (j == 2){
                    premium3.setText(gosterilecek); 
                }
                else if (j == 3){
                    premium4.setText(gosterilecek); 
                }
                else if (j == 4){
                    premium5.setText(gosterilecek); 
                }
            }
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kullaniciPopCalmaListesi = new javax.swing.JTable();
        premium1takipet = new javax.swing.JButton();
        premium2takipet = new javax.swing.JButton();
        premium3takipet = new javax.swing.JButton();
        premium4takipet = new javax.swing.JButton();
        premium5takipet = new javax.swing.JButton();
        premium1 = new javax.swing.JTextField();
        premium2 = new javax.swing.JTextField();
        premium3 = new javax.swing.JTextField();
        premium4 = new javax.swing.JTextField();
        premium5 = new javax.swing.JTextField();
        premium1calmalistesi = new javax.swing.JButton();
        premium2calmalistesi = new javax.swing.JButton();
        premium3calmalistesi = new javax.swing.JButton();
        premium4calmalistesi = new javax.swing.JButton();
        premium5calmalistesi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pkullaniciCalmaListesi = new javax.swing.JTable();
        kullanicisarkiarama = new javax.swing.JTextField();
        kullanicisarkiekle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        takip1 = new javax.swing.JTextField();
        takip2 = new javax.swing.JTextField();
        takip3 = new javax.swing.JTextField();
        takip4 = new javax.swing.JTextField();
        takip5 = new javax.swing.JTextField();
        sarkieklendi = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        kullaniciJazzCalmaListesi = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        kullaniciKlasikCalmaListesi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        odemebilgisi = new javax.swing.JTextField();
        cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 800));
        setMinimumSize(new java.awt.Dimension(1500, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        kullaniciPopCalmaListesi.setBackground(new java.awt.Color(51, 51, 51));
        kullaniciPopCalmaListesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kullaniciPopCalmaListesi.setForeground(new java.awt.Color(162, 226, 168));
        kullaniciPopCalmaListesi.setModel(new javax.swing.table.DefaultTableModel(
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
        kullaniciPopCalmaListesi.setGridColor(new java.awt.Color(51, 51, 51));
        kullaniciPopCalmaListesi.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(kullaniciPopCalmaListesi);
        if (kullaniciPopCalmaListesi.getColumnModel().getColumnCount() > 0) {
            kullaniciPopCalmaListesi.getColumnModel().getColumn(0).setResizable(false);
            kullaniciPopCalmaListesi.getColumnModel().getColumn(1).setResizable(false);
            kullaniciPopCalmaListesi.getColumnModel().getColumn(2).setResizable(false);
            kullaniciPopCalmaListesi.getColumnModel().getColumn(3).setResizable(false);
            kullaniciPopCalmaListesi.getColumnModel().getColumn(4).setResizable(false);
        }

        premium1takipet.setBackground(new java.awt.Color(51, 51, 51));
        premium1takipet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium1takipet.setForeground(new java.awt.Color(255, 255, 255));
        premium1takipet.setText("Takip Et");
        premium1takipet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium1takipetActionPerformed(evt);
            }
        });

        premium2takipet.setBackground(new java.awt.Color(51, 51, 51));
        premium2takipet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium2takipet.setForeground(new java.awt.Color(255, 255, 255));
        premium2takipet.setText("Takip Et");
        premium2takipet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium2takipetActionPerformed(evt);
            }
        });

        premium3takipet.setBackground(new java.awt.Color(51, 51, 51));
        premium3takipet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium3takipet.setForeground(new java.awt.Color(255, 255, 255));
        premium3takipet.setText("Takip Et");
        premium3takipet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium3takipetActionPerformed(evt);
            }
        });

        premium4takipet.setBackground(new java.awt.Color(51, 51, 51));
        premium4takipet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium4takipet.setForeground(new java.awt.Color(255, 255, 255));
        premium4takipet.setText("Takip Et");
        premium4takipet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium4takipetActionPerformed(evt);
            }
        });

        premium5takipet.setBackground(new java.awt.Color(51, 51, 51));
        premium5takipet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium5takipet.setForeground(new java.awt.Color(255, 255, 255));
        premium5takipet.setText("Takip Et");
        premium5takipet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium5takipetActionPerformed(evt);
            }
        });

        premium1.setEditable(false);
        premium1.setBackground(new java.awt.Color(51, 51, 51));
        premium1.setForeground(new java.awt.Color(255, 255, 255));

        premium2.setEditable(false);
        premium2.setBackground(new java.awt.Color(51, 51, 51));
        premium2.setForeground(new java.awt.Color(255, 255, 255));

        premium3.setEditable(false);
        premium3.setBackground(new java.awt.Color(51, 51, 51));
        premium3.setForeground(new java.awt.Color(255, 255, 255));

        premium4.setEditable(false);
        premium4.setBackground(new java.awt.Color(51, 51, 51));
        premium4.setForeground(new java.awt.Color(255, 255, 255));
        premium4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium4ActionPerformed(evt);
            }
        });

        premium5.setEditable(false);
        premium5.setBackground(new java.awt.Color(51, 51, 51));
        premium5.setForeground(new java.awt.Color(255, 255, 255));

        premium1calmalistesi.setBackground(new java.awt.Color(51, 51, 51));
        premium1calmalistesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium1calmalistesi.setForeground(new java.awt.Color(255, 255, 255));
        premium1calmalistesi.setText("Çalma Listesini Aç");
        premium1calmalistesi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        premium1calmalistesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium1calmalistesiActionPerformed(evt);
            }
        });

        premium2calmalistesi.setBackground(new java.awt.Color(51, 51, 51));
        premium2calmalistesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium2calmalistesi.setForeground(new java.awt.Color(255, 255, 255));
        premium2calmalistesi.setText("Çalma Listesini Aç");
        premium2calmalistesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium2calmalistesiActionPerformed(evt);
            }
        });

        premium3calmalistesi.setBackground(new java.awt.Color(51, 51, 51));
        premium3calmalistesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium3calmalistesi.setForeground(new java.awt.Color(255, 255, 255));
        premium3calmalistesi.setText("Çalma Listesini Aç");
        premium3calmalistesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium3calmalistesiActionPerformed(evt);
            }
        });

        premium4calmalistesi.setBackground(new java.awt.Color(51, 51, 51));
        premium4calmalistesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium4calmalistesi.setForeground(new java.awt.Color(255, 255, 255));
        premium4calmalistesi.setText("Çalma Listesini Aç");
        premium4calmalistesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium4calmalistesiActionPerformed(evt);
            }
        });

        premium5calmalistesi.setBackground(new java.awt.Color(51, 51, 51));
        premium5calmalistesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        premium5calmalistesi.setForeground(new java.awt.Color(255, 255, 255));
        premium5calmalistesi.setText("Çalma Listesini Aç");
        premium5calmalistesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premium5calmalistesiActionPerformed(evt);
            }
        });

        pkullaniciCalmaListesi.setBackground(new java.awt.Color(51, 51, 51));
        pkullaniciCalmaListesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pkullaniciCalmaListesi.setForeground(new java.awt.Color(162, 226, 168));
        pkullaniciCalmaListesi.setModel(new javax.swing.table.DefaultTableModel(
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
        pkullaniciCalmaListesi.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(pkullaniciCalmaListesi);
        if (pkullaniciCalmaListesi.getColumnModel().getColumnCount() > 0) {
            pkullaniciCalmaListesi.getColumnModel().getColumn(0).setResizable(false);
            pkullaniciCalmaListesi.getColumnModel().getColumn(1).setResizable(false);
            pkullaniciCalmaListesi.getColumnModel().getColumn(2).setResizable(false);
            pkullaniciCalmaListesi.getColumnModel().getColumn(3).setResizable(false);
            pkullaniciCalmaListesi.getColumnModel().getColumn(4).setResizable(false);
        }

        kullanicisarkiarama.setBackground(new java.awt.Color(51, 51, 51));
        kullanicisarkiarama.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kullanicisarkiarama.setForeground(new java.awt.Color(255, 255, 255));
        kullanicisarkiarama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicisarkiaramaActionPerformed(evt);
            }
        });

        kullanicisarkiekle.setBackground(new java.awt.Color(51, 51, 51));
        kullanicisarkiekle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kullanicisarkiekle.setForeground(new java.awt.Color(255, 255, 255));
        kullanicisarkiekle.setText("Çalma Listesine Ekle");
        kullanicisarkiekle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kullanicisarkiekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicisarkiekleActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\gulay\\Documents\\NetBeansProjects\\prolabproje2.3\\img\\loupe(1).png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(162, 226, 168));
        jLabel3.setText("Listenize eklemek istediğiniz şarkının ismini giriniz");

        takip1.setEditable(false);
        takip1.setBackground(new java.awt.Color(51, 51, 51));
        takip1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        takip1.setForeground(new java.awt.Color(162, 226, 168));

        takip2.setEditable(false);
        takip2.setBackground(new java.awt.Color(51, 51, 51));
        takip2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        takip2.setForeground(new java.awt.Color(162, 226, 168));

        takip3.setEditable(false);
        takip3.setBackground(new java.awt.Color(51, 51, 51));
        takip3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        takip3.setForeground(new java.awt.Color(162, 226, 168));

        takip4.setEditable(false);
        takip4.setBackground(new java.awt.Color(51, 51, 51));
        takip4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        takip4.setForeground(new java.awt.Color(162, 226, 168));

        takip5.setEditable(false);
        takip5.setBackground(new java.awt.Color(51, 51, 51));
        takip5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        takip5.setForeground(new java.awt.Color(162, 226, 168));

        sarkieklendi.setEditable(false);
        sarkieklendi.setBackground(new java.awt.Color(51, 51, 51));
        sarkieklendi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sarkieklendi.setForeground(new java.awt.Color(162, 226, 168));
        sarkieklendi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sarkieklendi.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        kullaniciJazzCalmaListesi.setBackground(new java.awt.Color(51, 51, 51));
        kullaniciJazzCalmaListesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kullaniciJazzCalmaListesi.setForeground(new java.awt.Color(162, 226, 168));
        kullaniciJazzCalmaListesi.setModel(new javax.swing.table.DefaultTableModel(
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
        kullaniciJazzCalmaListesi.setGridColor(new java.awt.Color(51, 51, 51));
        kullaniciJazzCalmaListesi.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(kullaniciJazzCalmaListesi);
        if (kullaniciJazzCalmaListesi.getColumnModel().getColumnCount() > 0) {
            kullaniciJazzCalmaListesi.getColumnModel().getColumn(0).setResizable(false);
            kullaniciJazzCalmaListesi.getColumnModel().getColumn(1).setResizable(false);
            kullaniciJazzCalmaListesi.getColumnModel().getColumn(2).setResizable(false);
            kullaniciJazzCalmaListesi.getColumnModel().getColumn(3).setResizable(false);
            kullaniciJazzCalmaListesi.getColumnModel().getColumn(4).setResizable(false);
        }

        kullaniciKlasikCalmaListesi.setBackground(new java.awt.Color(51, 51, 51));
        kullaniciKlasikCalmaListesi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kullaniciKlasikCalmaListesi.setForeground(new java.awt.Color(162, 226, 168));
        kullaniciKlasikCalmaListesi.setModel(new javax.swing.table.DefaultTableModel(
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
        kullaniciKlasikCalmaListesi.setGridColor(new java.awt.Color(51, 51, 51));
        kullaniciKlasikCalmaListesi.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(kullaniciKlasikCalmaListesi);
        if (kullaniciKlasikCalmaListesi.getColumnModel().getColumnCount() > 0) {
            kullaniciKlasikCalmaListesi.getColumnModel().getColumn(0).setResizable(false);
            kullaniciKlasikCalmaListesi.getColumnModel().getColumn(1).setResizable(false);
            kullaniciKlasikCalmaListesi.getColumnModel().getColumn(2).setResizable(false);
            kullaniciKlasikCalmaListesi.getColumnModel().getColumn(3).setResizable(false);
            kullaniciKlasikCalmaListesi.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 226, 168));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Ödeme Bilgisi :");

        odemebilgisi.setEditable(false);
        odemebilgisi.setBackground(new java.awt.Color(51, 51, 51));
        odemebilgisi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        odemebilgisi.setForeground(new java.awt.Color(162, 226, 168));
        odemebilgisi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        odemebilgisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemebilgisiActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kullanicisarkiarama))
                                    .addGap(18, 18, 18)
                                    .addComponent(kullanicisarkiekle, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(odemebilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(takip4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(takip5))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(premium5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(premium4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(premium5takipet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(premium4takipet, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(premium5calmalistesi, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(premium4calmalistesi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(premium3takipet)
                                .addGap(164, 164, 164)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(sarkieklendi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(takip1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(premium1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(premium1takipet, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(takip2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(takip3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(premium3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(premium2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(premium2takipet)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(premium2calmalistesi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(premium1calmalistesi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(premium3calmalistesi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odemebilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premium1takipet)
                    .addComponent(premium1calmalistesi)
                    .addComponent(premium1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takip1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premium2takipet)
                    .addComponent(premium2calmalistesi)
                    .addComponent(premium2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premium3takipet)
                    .addComponent(premium3calmalistesi)
                    .addComponent(takip3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premium3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premium4takipet)
                    .addComponent(takip4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premium4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(premium4calmalistesi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(premium5calmalistesi)
                    .addComponent(premium5takipet)
                    .addComponent(premium5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(takip5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kullanicisarkiarama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kullanicisarkiekle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sarkieklendi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void premium4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium4ActionPerformed
        //premium4.setText(p1);
    }//GEN-LAST:event_premium4ActionPerformed

    private void kullanicisarkiaramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicisarkiaramaActionPerformed
        String aranacaksarki = kullanicisarkiarama.getText();
    }//GEN-LAST:event_kullanicisarkiaramaActionPerformed

    private void premium1takipetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium1takipetActionPerformed
        if((islemler.takipEt(k_calmalist, premium1.getText())) == 1){
            takip1.setText("Takip ediliyor.");
        }
    }//GEN-LAST:event_premium1takipetActionPerformed

    private void premium2takipetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium2takipetActionPerformed
        if((islemler.takipEt(k_calmalist, premium2.getText())) == 1){
            takip2.setText("Takip ediliyor.");
        }
    }//GEN-LAST:event_premium2takipetActionPerformed

    private void premium3takipetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium3takipetActionPerformed
        if((islemler.takipEt(k_calmalist, premium3.getText())) == 1){
            takip3.setText("Takip ediliyor.");
        }
    }//GEN-LAST:event_premium3takipetActionPerformed

    private void premium4takipetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium4takipetActionPerformed
        if((islemler.takipEt(k_calmalist, premium4.getText())) == 1){
            takip4.setText("Takip ediliyor.");
        }
    }//GEN-LAST:event_premium4takipetActionPerformed

    private void premium5takipetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium5takipetActionPerformed
        if((islemler.takipEt(k_calmalist, premium5.getText())) == 1){
            takip5.setText("Takip ediliyor.");
        }
    }//GEN-LAST:event_premium5takipetActionPerformed

    private void premium1calmalistesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium1calmalistesiActionPerformed
        if((islemler.takipKontrol(premium1.getText(),islemler.takipEdilenler(k_calmalist, premium1.getText()))) == 0){
            JOptionPane.showMessageDialog(this, "Kullanıcı takip edilmiyor. Çalma listesini açmak için önce takip edin");
        }
        else{
            islemler.premiumCalmaListesi(premium1.getText());
        }
    }//GEN-LAST:event_premium1calmalistesiActionPerformed

    private void premium2calmalistesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium2calmalistesiActionPerformed
        if((islemler.takipKontrol(premium2.getText(),islemler.takipEdilenler(k_calmalist, premium2.getText()))) == 0){
            JOptionPane.showMessageDialog(this, "Kullanıcı takip edilmiyor. Çalma listesini açmak için önce takip edin");
        }
        else{
            islemler.premiumCalmaListesi(premium2.getText());
        }
    }//GEN-LAST:event_premium2calmalistesiActionPerformed

    private void premium3calmalistesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium3calmalistesiActionPerformed
        if((islemler.takipKontrol(premium3.getText(),islemler.takipEdilenler(k_calmalist, premium3.getText()))) == 0){
            JOptionPane.showMessageDialog(this, "Kullanıcı takip edilmiyor. Çalma listesini açmak için önce takip edin");
        }
        else{
            islemler.premiumCalmaListesi(premium3.getText());
        }
    }//GEN-LAST:event_premium3calmalistesiActionPerformed

    private void premium4calmalistesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium4calmalistesiActionPerformed
        if((islemler.takipKontrol(premium4.getText(),islemler.takipEdilenler(k_calmalist, premium4.getText()))) == 0){
            JOptionPane.showMessageDialog(this, "Kullanıcı takip edilmiyor. Çalma listesini açmak için önce takip edin");
        }
        else{
            islemler.premiumCalmaListesi(premium4.getText());
        }
    }//GEN-LAST:event_premium4calmalistesiActionPerformed

    private void premium5calmalistesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premium5calmalistesiActionPerformed
        if((islemler.takipKontrol(premium5.getText(),islemler.takipEdilenler(k_calmalist, premium5.getText()))) == 0){
            JOptionPane.showMessageDialog(this, "Kullanıcı takip edilmiyor. Çalma listesini açmak için önce takip edin");
        }
        else{
            islemler.premiumCalmaListesi(premium5.getText());
        }
    }//GEN-LAST:event_premium5calmalistesiActionPerformed

    private void kullanicisarkiekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicisarkiekleActionPerformed

        if((islemler.calmaListesineSarkiEkle(k_calmalist, kullanicisarkiarama.getText())) == 1){
            sarkieklendi.setText("Şarkı eklendi");
            islemler.kullaniciPopCalmaListesi(k_calmalist);
            islemler.kullaniciJazzCalmaListesi(k_calmalist);
            islemler.kullaniciKlasikCalmaListesi(k_calmalist);
            kullaniciPopCalmaListesiGoster();
            kullaniciJazzCalmaListesiGoster();
            kullaniciKlasikCalmaListesiGoster();
        }
        else{
            JOptionPane.showMessageDialog(this, "Böyle bir şarkı bulunamadı. Lütfen tekrar girin");
        }
    }//GEN-LAST:event_kullanicisarkiekleActionPerformed

    private void odemebilgisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemebilgisiActionPerformed
 
    }//GEN-LAST:event_odemebilgisiActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciCalmaListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciCalmaListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciCalmaListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciCalmaListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciCalmaListesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable kullaniciJazzCalmaListesi;
    private javax.swing.JTable kullaniciKlasikCalmaListesi;
    private javax.swing.JTable kullaniciPopCalmaListesi;
    private javax.swing.JTextField kullanicisarkiarama;
    private javax.swing.JButton kullanicisarkiekle;
    private javax.swing.JTextField odemebilgisi;
    private javax.swing.JTable pkullaniciCalmaListesi;
    private javax.swing.JTextField premium1;
    private javax.swing.JButton premium1calmalistesi;
    private javax.swing.JButton premium1takipet;
    private javax.swing.JTextField premium2;
    private javax.swing.JButton premium2calmalistesi;
    private javax.swing.JButton premium2takipet;
    private javax.swing.JTextField premium3;
    private javax.swing.JButton premium3calmalistesi;
    private javax.swing.JButton premium3takipet;
    private javax.swing.JTextField premium4;
    private javax.swing.JButton premium4calmalistesi;
    private javax.swing.JButton premium4takipet;
    private javax.swing.JTextField premium5;
    private javax.swing.JButton premium5calmalistesi;
    private javax.swing.JButton premium5takipet;
    private javax.swing.JTextField sarkieklendi;
    private javax.swing.JTextField takip1;
    private javax.swing.JTextField takip2;
    private javax.swing.JTextField takip3;
    private javax.swing.JTextField takip4;
    private javax.swing.JTextField takip5;
    // End of variables declaration//GEN-END:variables
}
