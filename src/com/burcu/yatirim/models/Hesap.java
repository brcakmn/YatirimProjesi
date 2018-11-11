/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.models;

import java.util.Date;

/**
 *
 * @author burcu
 */
public class Hesap extends Object {//HESAP CLASSI AÇIP DEGÝSKENLERÝ TANIMLADIM

    private String hesapAdi;
    private double anaPara;
    private Date atarih;
    private Date ktarih;
    private double kfiyat;

    public Hesap(String ad, double para, Date itarih, Date starih)//constructor tanýmlandý,
    {
        hesapAdi = ad;
        anaPara = para;
        atarih = itarih;
        ktarih = starih;

    }

    public String getHesapAdi() {
        return hesapAdi;
    }

    public void setHesapAdi(String hesapAdi) {
        this.hesapAdi = hesapAdi;
    }

    public double getAnaPara() {
        return anaPara;
    }

    public void setAnaPara(double anaPara) {
        this.anaPara = anaPara;
    }

    public Date getAtarih() {
        return atarih;
    }

    public void setAtarih(Date atarih) {
        this.atarih = atarih;
    }

    public Date getKtarih() {
        return ktarih;
    }

    public void setKtarih(Date ktarih) {
        this.ktarih = ktarih;
    }

    public double getKfiyat() {
        return kfiyat;
    }

    public void setKfiyat(double kfiyat) {
        this.kfiyat = kfiyat;
    }
    
    

    

    public double getiri() {
        return anaPara;
    }

    public long gun() {//iki tarih arasýndaki farký gün olarak bulan fonksiyon yazdým
        long fark = ktarih.getTime() - atarih.getTime();
        fark = fark / (1000 * 60 * 60 * 24);
        return fark;
    }

}
