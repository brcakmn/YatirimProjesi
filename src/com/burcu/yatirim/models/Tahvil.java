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
public class Tahvil extends Hesap{//hesaptan mirasla tahvil sýnýfý
      private double vade;
      private double kazanc;
	public Tahvil(String ad, double para,Date itarih, Date starih,double vd) {
		super(ad, para, itarih, starih);
	    kazanc=1.5;
		vade=vd;
		
	}
// gerekli set ve get metotlarý
	public void setvade(double vd)
	{
		vade=vd;
	}
	
	public double getvade()
	{
		return vade;
	}
	public double getkazanc() {
		return kazanc;
	}

	public void setVadeGetirisi(double vadeGetirisi) {
		kazanc = vadeGetirisi;
	}
	public double getiri(){// belli vade sonra tahvilden kazanýlan miktarý verir
		
		return getAnaPara() * kazanc * gun() / vade;
		
	}
    
}
