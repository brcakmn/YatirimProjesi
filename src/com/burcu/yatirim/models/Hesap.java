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

// Hesap class'ı açılıp parametrelerin tanımlası yapıldı.
public class Hesap extends Object {

    private String hesapAdi;
    private double anaPara;
    private Date atarih;
    private Date ktarih;
    private double kfiyat;
    // Kurucu metot tanımlaması yapıldı.
    public Hesap(String ad, double para, Date itarih, Date starih)
    {
        hesapAdi = ad;
        anaPara = para;
        atarih = itarih;
        ktarih = starih;

    }
    // Hesap class'ı için Set ve Get metotları tanımlandı.
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
    // İki tarih arasındaki farkı gün olarak bulan metot tanımlandı.
    public long gun() {
        long fark = ktarih.getTime() - atarih.getTime();
        fark = fark / (1000 * 60 * 60 * 24);
        return fark;
    }

}
