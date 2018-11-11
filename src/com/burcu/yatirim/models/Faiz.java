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
public class Faiz extends Hesap { //hesaptan miras olarak tanýmlandý

    private double yfo;

    public Faiz(String ad, double para, Date itarih, Date starih, double y) {
        super(ad, para, itarih, starih);
        yfo = y;

    }
// yýllýk faiz oranýna ait set ve get metotlarý

    public double getyfo() {
        return yfo;
    }

    public void setyfo(double y) {
        yfo = y;
    }

    public double getiri() {//faizden kazanýlan toplam miktarý hesaplar

        return this.getAnaPara() * yfo * gun() / 36500;

    }

}
