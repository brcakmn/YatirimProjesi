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
 * @param ad: Döviz adı girilir.
 */
public class Doviz extends Faiz {

    private String ad;
    private double para;
    private Date itarih;
    private Date starih;
    private double y;
    private double kr;
    private double kur;

    public Doviz(String ad, double para, Date itarih, Date starih, double y, double kr) {
        super(ad, para, itarih, starih, y);
        kur = kr;
    }

    // Kur(Faiz) için Set ve Get metotları
    public void setkur(double kr) {
        kur = kr;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public double getPara() {
        return para;
    }

    public void setPara(double para) {
        this.para = para;
    }

    public Date getItarih() {
        return itarih;
    }

    public void setItarih(Date itarih) {
        this.itarih = itarih;
    }

    public Date getStarih() {
        return starih;
    }

    public void setStarih(Date starih) {
        this.starih = starih;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getKr() {
        return kr;
    }

    public void setKr(double kr) {
        this.kr = kr;
    }

    public double getKur() {
        return kur;
    }

    public void setKur(double kur) {
        this.kur = kur;
    }

    public double getkur() {
        return kur;
    }
    // Dövizden kazanılan toplam miktarı hesaplar.
    public double getiri() {

        return (this.getAnaPara() * this.getyfo() * gun() / 36500) * kur;

    }

}
