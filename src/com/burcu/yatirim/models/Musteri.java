/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burcu.yatirim.models;

/**
 *
 * @author burcu
 */
public class Musteri {//musteri sinifina acýp degiskenlerini tanýmladým

    private Long id;
    private String ad;
    private String soyad;
    private String telefon;
    private String adres;
    private Long puanyas;
    private Long puanegitim;
    private Long puanyatirim;
    private Long puangetiri;
    private String meslek;
    private Hesap Hesap;
    private Faiz Faiz;
    private Doviz Doviz;
    private Tahvil Tahvil;
    //müsteri için costructur tanýmladým burada müþteri herhangi bir hesabý kullanabilir 
    //ya da sadece birini ya da hepsine birden parasýný yatýrabilir.

    public Musteri() {
    }

    public Musteri(String isim, Hesap h, Faiz f, Doviz d, Tahvil t) {
        ad = isim;
        Hesap = h;
        Faiz = f;
        Doviz = d;
        Tahvil = t;
        System.out.println("***********MÜÞTERÝ**************");
        System.out.println("Musterinin Danismana verdigi para= " + h.getAnaPara());
        System.out.println("Faize yatirilan Para= " + Faiz.getAnaPara());
        System.out.println("faizden kazanilan Para= " + Faiz.getiri());
        System.out.println("Dovize yatirilan Para= " + Doviz.getAnaPara());
        System.out.println("dovizden kazanilan Para= " + Doviz.getiri());
        System.out.println("Tahvile yatirilan Para= " + Tahvil.getAnaPara());
        System.out.println("tahvilden kazanilan Para= " + Tahvil.getiri());
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Long getPuanyas() {
        return puanyas;
    }

    public void setPuanyas(Long puanyas) {
        this.puanyas = puanyas;
    }

    public Hesap getHesap() {
        return Hesap;
    }

    public void setHesap(Hesap Hesap) {
        this.Hesap = Hesap;
    }

    public Faiz getFaiz() {
        return Faiz;
    }

    public void setFaiz(Faiz Faiz) {
        this.Faiz = Faiz;
    }

    public Doviz getDoviz() {
        return Doviz;
    }

    public void setDoviz(Doviz Doviz) {
        this.Doviz = Doviz;
    }

    public Tahvil getTahvil() {
        return Tahvil;
    }

    public void setTahvil(Tahvil Tahvil) {
        this.Tahvil = Tahvil;
    }

    public Long getPuanegitim() {
        return puanegitim;
    }

    public void setPuanegitim(Long puanegitim) {
        this.puanegitim = puanegitim;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public Long getPuanyatirim() {
        return puanyatirim;
    }

    public void setPuanyatirim(Long puanyatirim) {
        this.puanyatirim = puanyatirim;
    }

    public Long getPuangetiri() {
        return puangetiri;
    }

    public void setPuangetiri(Long puangetiri) {
        this.puangetiri = puangetiri;
    }
    
    
    
    
    
    
    
    

}
