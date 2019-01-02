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

// Hesaptan miras olarak tanımlandı.
public class Faiz extends Hesap { 

    private double yfo;

    public Faiz(String ad, double para, Date itarih, Date starih, double y) {
        super(ad, para, itarih, starih);
        yfo = y;

    }
    // Yıllık faiz oranına ait Set ve Get metotları
    public double getyfo() {
        return yfo;
    }

    public void setyfo(double y) {
        yfo = y;
    }
    // Faizden kazanılan toplam miktarı hesaplar.
    public double getiri() {

        return this.getAnaPara() * yfo * gun() / 36500;

    }

}
