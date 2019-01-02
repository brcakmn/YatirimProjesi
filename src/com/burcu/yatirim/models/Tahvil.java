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
// Hesap class'ından miras alan tahvil class'ı tanımladım.
public class Tahvil extends Hesap {

    private double vade;
    private double kazanc;

    public Tahvil(String ad, double para, Date itarih, Date starih, double vd) {
        super(ad, para, itarih, starih);
        kazanc = 1.5;
        vade = vd;

    }

    //Tahvil class'ı için gerekli Set ve Get metotları
    public void setvade(double vd) {
        vade = vd;
    }

    public double getvade() {
        return vade;
    }

    public double getkazanc() {
        return kazanc;
    }

    public void setVadeGetirisi(double vadeGetirisi) {
        kazanc = vadeGetirisi;
    }

    // Belli vade sonra tahvilden kazanılan miktarı verir.
    public double getiri() {
        return getAnaPara() * kazanc * gun() / vade;

    }

}
