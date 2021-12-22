public class Kullanicilar {
    String sira;
    String pkullaniciad;
    String email;
    String premiumsifre;
    String abonelikturu;
    String abonelik;
    String ulke;

    public Kullanicilar(String sira, String pkullaniciad, String email, String premiumsifre, String abonelikturu, String abonelik, String ulke) {
        this.sira = sira;
        this.pkullaniciad = pkullaniciad;
        this.email = email;
        this.premiumsifre = premiumsifre;
        this.abonelikturu = abonelikturu;
        this.abonelik = abonelik;
        this.ulke = ulke;
    }

    public String getSira() {
        return sira;
    }

    public void setSira(String sira) {
        this.sira = sira;
    }

    public String getPkullaniciad() {
        return pkullaniciad;
    }

    public void setPkullaniciad(String pkullaniciad) {
        this.pkullaniciad = pkullaniciad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPremiumsifre() {
        return premiumsifre;
    }

    public void setPremiumsifre(String premiumsifre) {
        this.premiumsifre = premiumsifre;
    }

    public String getAbonelikturu() {
        return abonelikturu;
    }

    public void setAbonelikturu(String abonelikturu) {
        this.abonelikturu = abonelikturu;
    }

    public String getAbonelik() {
        return abonelik;
    }

    public void setAbonelik(String abonelik) {
        this.abonelik = abonelik;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }
    
    
}
