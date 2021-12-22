/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YeniProjeSirinler;


public class Oyuncu extends Karakter{
    int oyuncuID;
    String oyuncuAdi;
    String oyuncuTur;
    public int skor=20;
    
    public int PuaniGoster(int skor){
        return skor;
    }
    
    //GETTER VE SETTER
    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public String getTur() {
        return tur;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public void setTur(String tur) {
        this.tur = tur;
    }
    
}

