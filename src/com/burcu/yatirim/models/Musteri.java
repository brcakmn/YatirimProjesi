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
	public String ad;
	public Hesap Hesap;
	public Faiz Faiz;
	public Doviz Doviz;
	public Tahvil Tahvil;
	//müsteri için costructur tanýmladým burada müþteri herhangi bir hesabý kullanabilir 
	//ya da sadece birini ya da hepsine birden parasýný yatýrabilir.
	
	public Musteri(String isim,Hesap h,Faiz f,Doviz d,Tahvil t){
		ad=isim;
		Hesap=h;
		Faiz=f;
		Doviz=d;
		Tahvil=t;
		System.out.println("***********MÜÞTERÝ**************");
		System.out.println("Musterinin Danismana verdigi para= "+h.getAnaPara());
		System.out.println("Faize yatirilan Para= "+Faiz.getAnaPara());
		System.out.println("faizden kazanilan Para= "+Faiz.getiri());
		System.out.println("Dovize yatirilan Para= "+Doviz.getAnaPara());
		System.out.println("dovizden kazanilan Para= "+Doviz.getiri());
		System.out.println("Tahvile yatirilan Para= "+Tahvil.getAnaPara());
		System.out.println("tahvilden kazanilan Para= "+Tahvil.getiri());
		System.out.println();
		System.out.println();
		System.out.println();
	}
    
}
