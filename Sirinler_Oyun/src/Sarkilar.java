
public class Sarkilar {
    private String sira;
    private String sarkiadi;
    private String sanatci;
    private String dinlenmesayisi;
    private String tur;
    
    public Sarkilar(String sira, String sarkiadi, String sanatci, String dinlenmesayisi, String tur) {
        this.sira = sira;
        this.sarkiadi = sarkiadi;
        this.sanatci = sanatci;
        this.dinlenmesayisi = dinlenmesayisi;
        this.tur = tur;
    }

    public String getSira() {
        return sira;
    }

    public void setSira(String sira) {
        this.sira = sira;
    }

    public String getSarkiadi() {
        return sarkiadi;
    }

    public void setSarkiadi(String sarkiadi) {
        this.sarkiadi = sarkiadi;
    }

    public String getSanatci() {
        return sanatci;
    }

    public void setSanatci(String sanatci) {
        this.sanatci = sanatci;
    }

    public String getDinlenmesayisi() {
        return dinlenmesayisi;
    }

    public void setDinlenmesayisi(String dinlenmesayisi) {
        this.dinlenmesayisi = dinlenmesayisi;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
    
}
