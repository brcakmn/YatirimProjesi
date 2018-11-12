/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.models;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author burcu
 */
public class Test {// test sýnýfý oluþturdum

    //burada 3 tane müþteri için bilgileri yazdýrdým istediði hesabý kullandýrdým
    public static void main(String[] args) {

        Date ilk = new GregorianCalendar(2007, 10, 12).getTime();
        Date son = new GregorianCalendar(2007, 10, 30).getTime();

        Hesap Hesap = new Hesap("hesap", 5000, ilk, son);
        Faiz kar = new Faiz("faiz hesabý", 2000, ilk, son, 10);
        Tahvil Tahvil = new Tahvil("tahvil hesabý", 1250, ilk, son, 2);
        Doviz Döviz = new Doviz("döviz hesabý", 1750, ilk, son, 5, 1.5);
        Musteri Musteri = new Musteri("musteri", Hesap, kar, Döviz, Tahvil);
        System.out.println("iþlemler sonunda toplam anapara= " + (Musteri.getDoviz().getiri() + Musteri.getFaiz().getiri() + Musteri.getHesap().getAnaPara() + Musteri.getTahvil().getiri()));
        System.out.println();
        System.out.println();
        System.out.println();

        Hesap Hesap1 = new Hesap("hesap", 10000, ilk, son);
        Faiz kar1 = new Faiz("faiz hesabý", 5000, ilk, son, 12);
        Tahvil Tahvil1 = new Tahvil("tahvil hesabý", 2500, ilk, son, 3);
        Doviz Döviz1 = new Doviz("döviz hesabý", 2500, ilk, son, 7, 2);
        Musteri Musteri1 = new Musteri("musteri", Hesap1, kar1, Döviz1, Tahvil1);
        System.out.println("iþlemler sonunda toplam anapara= " + (Musteri1.getDoviz().getiri() + Musteri1.getFaiz().getiri() + Musteri1.getHesap().getAnaPara() + Musteri1.getTahvil().getiri()));
        System.out.println();
        System.out.println();
        System.out.println();

        Hesap Hesap2 = new Hesap("hesap", 20000, ilk, son);
        Faiz kar2 = new Faiz("faiz hesabý", 0, ilk, son, 17);
        Tahvil Tahvil2 = new Tahvil("tahvil hesabý", 7000, ilk, son, 3.5);
        Doviz Döviz2 = new Doviz("döviz hesabý", 13000, ilk, son, 3, 4);
        Musteri Musteri2 = new Musteri("musteri", Hesap2, kar2, Döviz2, Tahvil2);
        System.out.println("iþlemler sonunda toplam anapara= " + (Musteri2.getDoviz().getiri() + Musteri2.getFaiz().getiri() + Musteri2.getHesap().getAnaPara() + Musteri2.getTahvil().getiri()));
        System.out.println();
        System.out.println();
        System.out.println();

    }

}

//burada müþterinin danýþmana ne kadar para verdiðini,bunun ne kadarýnýn faize yatýrýldýðý ve 
//faizden ne kadar kazandýðý,ne kadarýnýn dözvize yatýrýldýðý ne kadar kazandýðý,ne kadarýnýn tahvile yatýrýldýðý
//ve ne kadar kazanýldýðý bilgileri incelenebilir.ve bütün iþlemler sonunda ne kadar parasý olacaðý görülebilir.

