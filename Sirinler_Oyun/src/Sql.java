import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Sql {
    
    private String kullaniciadi = "root";
    private String sifre = "";    
    private String veritabanadi = "muzikdosyam";
    private String host = "localhost";
    private int port = 3306;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedstatement = null;
    
    public Sql(){
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + veritabanadi;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            System.out.println("Driver bulunamadi");
        }
        
        try{
            con = DriverManager.getConnection(url, kullaniciadi, sifre);
            System.out.println("Baglanti basarili");
        }catch(SQLException ex){
            System.out.println("Baglanti basarisiz");
        }
    }
    
    public int girisYap (String kullaniciadi, String kullanicisifre){
        String sorgu = "select * from kullanicilar where kullaniciAdi = ? and sifre = ?";
        try {
          preparedstatement = con.prepareStatement(sorgu);
          preparedstatement.setString(1, kullaniciadi);
          preparedstatement.setString(2, kullanicisifre);
          
          ResultSet rs = preparedstatement.executeQuery();
          
          while (rs.next()) {
            return 1;
        }

        } catch (SQLException ex) {
            System.out.println("Basarisiz");
            
        }
    return 0;   
    }
    
    public int kullaniciKontrol(String kullaniciadi) //kayit kullanici adi kontrol
  {
      
      String sorgu = "select * from kullanicilar where kullaniciAdi = '" + kullaniciadi + "'";
      
      try {
          statement = con.createStatement();
          ResultSet rs = statement.executeQuery(sorgu);
          while (rs.next()) {
              return 1;
              
          }
          
      } catch (SQLException e) {
          System.out.println("Basarisiz");
      }
      
      return 0;
      
  }
    
    public int sifreKontrol(String kullanicisifre) //kayit kullanici adi kontrol
  {
      
      String sorgu = "select * from kullanicilar where sifre = '" + kullanicisifre + "'";
      
      try {
          statement = con.createStatement();
          ResultSet rs = statement.executeQuery(sorgu);
          while (rs.next()) {
              return 1;
              
          }
          
      } catch (SQLException e) {
          System.out.println("Basarisiz");
      }
      
      return 0;
      
  }
    
    public String ulkeKontrol(String kullaniciadi){
        
        String sorgu = "select ulkeBilgisi from kullanicilar where kullaniciAdi = '" + kullaniciadi + "'";
        String ulkebilgisi;
      try {
          statement = con.createStatement();
          ResultSet rs = statement.executeQuery(sorgu);
          while (rs.next()) {
              ulkebilgisi = rs.getString("ulkeBilgisi");
              return ulkebilgisi;
              
          }
          
      } catch (SQLException e) {
          System.out.println("Basarisiz");
          
      }
      
      return null;
    }
    
    public String kullaniciadiKontrol(String kullaniciad){
        
        String sorgu = "select * from kullanicilar where kullaniciAdi = '" + kullaniciad + "'";
      try {
          statement = con.createStatement();
          ResultSet rs = statement.executeQuery(sorgu);
          while (rs.next()) {
              kullaniciadi = rs.getString("kullaniciAdi");
              return kullaniciadi;
              
          }
          
      } catch (SQLException e) {
          System.out.println("Basarisiz");
          
      }
      
      return null;
    }
    
    
    public void kayitEkle (String kullaniciadi,String kullaniciemail, String kullanicisifre,String kullaniciabonelik,String kullaniciodeme,String kullaniciulke){
        try {
            statement = con.createStatement();
        //    String kcalmalist = kullaniciadi + "clistesi";
            String sorgu = "insert into kullanicilar (kullaniciAdi,email,sifre,abonelikTuru,abonelik,ulkeBilgisi) values ("+ "'" + kullaniciadi + "'," + "'" + kullaniciemail + "'," 
                + "'" + kullanicisifre + "'," + "'" + kullaniciabonelik + "'," + "'" + kullaniciodeme + "'," + "'" + kullaniciulke + "')" ;
        //    String tablosorgu = "create table muzikdosyam." + kcalmalist + "(sarkiID INT(10) NOT NULL , sarkiAdi VARCHAR(50) NOT NULL ,tarih DATE(10) NOT NULL , sanatci VARCHAR(50) NOT NULL , album VARCHAR(50) NOT NULL , tur VARCHAR(50) NOT NULL , sure FLOAT(10) NOT NULL , dinlenmeSayisi INT(50) NOT NULL)";
            statement.executeUpdate(sorgu);
        //    statement.executeUpdate(tablosorgu);
        }catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Sarkilar> tumSarkilar(){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from sarkilar";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> genelTop10(){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from sarkilar order by dinlenmeSayisi desc limit 10";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> ulkeTop10(String kullaniciad,String kullaniciulke){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        String ulke = kullaniciulke;
        String ad = kullaniciad;
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from where ulkeBilgisi =" + "'" + ulke + "'" + "order by dinlenmeSayisi desc limit 10";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> popTop10(){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from sarkilar where tur = 'pop' order by dinlenmeSayisi desc limit 10";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");              
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> jazzTop10(){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from sarkilar where tur = 'jazz' order by dinlenmeSayisi desc limit 10";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");              
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> klasikTop10(){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from sarkilar where tur = 'klasik' order by dinlenmeSayisi desc limit 10";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");              
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> kullaniciPopCalmaListesi(String kullanicia){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        String k_adi = kullanicia + "clistesi"; 
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from " + k_adi + " where tur = 'pop' ";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> kullaniciJazzCalmaListesi(String kullanicia){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        String k_adi = kullanicia + "clistesi"; 
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from " + k_adi + " where tur = 'jazz' ";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> kullaniciKlasikCalmaListesi(String kullanicia){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        String k_adi = kullanicia + "clistesi"; 
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from " + k_adi + " where tur = 'klasik' ";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Sarkilar> premiumCalmaListesi (String kullanicia){
        ArrayList<Sarkilar> sarkilar = new ArrayList<Sarkilar>();
        String k_adi = kullanicia + "clistesi";
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from " + k_adi;
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {
                String sira = String.valueOf(i);
                String sarkiadi = rs.getString("sarkiAdi");
                String sanatci = rs.getString("sanatci");
                String dinlenmesayisi = String.valueOf(rs.getInt("dinlenmeSayisi"));
                String tur = rs.getString("tur");
                
                sarkilar.add(new Sarkilar(sira,sarkiadi,sanatci,dinlenmesayisi,tur));
                i++;
          }
            return sarkilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public ArrayList<Kullanicilar> premiumKullanici (){
        ArrayList<Kullanicilar> pkullanicilar = new ArrayList<Kullanicilar>();       
        int i=1;
        try{       
            statement = con.createStatement();
            String sorgu = "select * from kullanicilar where abonelikTuru = 'premium'";
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {
                String sira = String.valueOf(i);
                String pkullaniciadi = rs.getString("kullaniciAdi");
                String email = String.valueOf(rs.getString("email"));
                String premiumsifre = String.valueOf(rs.getInt("sifre"));
                String abonelikturu = rs.getString("abonelikTuru");
                String abonelik = String.valueOf(rs.getString("abonelik"));
                String ulke = rs.getString("ulkeBilgisi");
                
                pkullanicilar.add(new Kullanicilar(sira,pkullaniciadi,email,premiumsifre,abonelikturu,abonelik,ulke));
                i++;
          }
            return pkullanicilar;
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }              
    }
    
    public int odemeBilgisi(String kullaniciadi){
        
        String sorgu = "select abonelik from kullanicilar where kullaniciAdi = '" + kullaniciadi + "'";
      try {
          statement = con.createStatement();
          ResultSet rs = statement.executeQuery(sorgu);
          
          while(rs.next()){
              String odeme = rs.getString("abonelik");              
          
                if(odeme.equals("odendi")){
                    return 1;
                }
                else if(odeme.equals("odenmedi")){
                    return 0;
                }
                else{
                    return 2;
                }
              
            }        
      } catch (SQLException e) {
          System.out.println("Basarisiz");
          
      }
      return 0;     
    }
    
    public int takipEt(String kullanici, String takipet){
        String takipeden = kullanici;
        String takipedilecek = takipet;
        ArrayList<String> takipedilenler = new ArrayList<String>();
        
        if(takipedilenler.isEmpty()){
            takipedilenler.add(takipedilecek);
            return 1;
        }
        else{
            if(!takipedilenler.contains(takipedilecek)){
                takipedilenler.add(takipedilecek);
                return 1;
            }
            else{
                return 0;
            }
        }
        
    }
    
    public ArrayList<String> takipEdilenler(String kullanici, String takipet){
        String takipeden = kullanici;
        String takipedilecek = takipet;
        ArrayList<String> takipedilenler = new ArrayList<String>();
        
        if(takipedilenler.isEmpty()){
            return null;
        }
        else{
            if(takipedilenler.contains(takipedilecek)){
                return takipedilenler;
            }
            else{
                return null;
            }
        }
        
    }
    
    public int takipKontrol(String takipet, ArrayList<String> takipedilen){
        String takipedilecek = takipet;
        
        if(takipedilen.isEmpty()){
            return 0;
        }
        else {
            if(takipedilen.contains(takipedilecek)){  
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    
    public int calmaListesineSarkiEkle(String kullanici, String sarkiadi) {
        String sarki = sarkiadi;
        String kad = kullanici + "clistesi";   
        
        try{       
            statement = con.createStatement();
            String sorgu = "select * from sarkilar where sarkiAdi ="+ "'" + sarki + "'";
            ResultSet rs = statement.executeQuery(sorgu);
            
            if(rs.next()){
                
                try{       
            statement = con.createStatement();
            String sorgu2 = "insert into " + kad + "(select * from sarkilar where sarkiAdi =" + "'" + sarki + "')";
            statement.executeUpdate(sorgu2);          
            return 1;
            
            } catch (SQLException ex) {
                Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex); 
                return 0;
            }             
        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
           
        }              
        return 0;
        
    }
    
    public void sanatciEkle(String sanatciadi, String sanatciulke) {
        try {
            statement = con.createStatement();

            String sorgu = "insert into sanatcilar (sanatciAdi,ulkeBilgisi) values (" + "'" + sanatciadi + "'," + "'" + sanatciulke + "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sarkiEkle(String sarkiadi, String tarih, String sanatci, String album, String tur, String sure, String dinlenme) {
        try {
            statement = con.createStatement();

            String sorgu = "insert into sarkilar (sarkiAdi,tarih,sanatci,album,tur,sure,dinlenmeSayisi) values (" + "'" + sarkiadi + "'," + "'" + tarih + "',"
                    + "'" + sanatci + "'," + "'" + album + "'," + "'" + tur + "'," + "'" + sure + "'," + "'" + dinlenme + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void albumEkle(String album, String sanatci, String sarkiadi, String tarih, String tur) {
        try {
            statement = con.createStatement();

            String sorgu = "insert into albumler (albumAdi,sanatci,sarki,tarih,tur) values (" + "'" + album + "'," + "'" + sanatci + "',"
                    + "'" + sarkiadi + "'," + "'" + tarih + "'," + "'" + tur + "')";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sarkiSil(String sarkiadi) {
        try {
            statement = con.createStatement();

            String sorgu = "delete from sarkilar where sarkiAdi = "+"'"+sarkiadi +"'" ;

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sanatciSil(String sanatciadi) {
        try {
            statement = con.createStatement();

            String sorgu = "delete from sanatcilar where sanatciAdi = "+"'" + sanatciadi + "'";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void albumSil(String album) {
        try {
            statement = con.createStatement();

            String sorgu = "delete from albumler where albumAdi =  " + "'" + album + "'";

            statement.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Sql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        Sql baglanti = new Sql();
    }
    
}
