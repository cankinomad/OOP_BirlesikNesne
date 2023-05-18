package com.berka;

import java.util.Arrays;

//her seyi bu paket icersinde yapacagimiz icin public yazmamiza gerek yok
public class Ders {
	//Uye degiskenler;
	String kod;
	String ad;
	int kredi;
	
	Bolum bolum;
	Hoca hoca;
	Ogrenci[] ogrenciler; // birden fazla ogrenci olacagi icin o derste, dizi olarak tanimlayabiliyoruz
	@Override
	public String toString() {
		return "Ders [kod=" + kod + ", ad=" + ad + ", kredi=" + kredi + ", bolum=" + bolum + ", hoca=" + hoca
				+ ", ogrenciler=" + Arrays.toString(ogrenciler) + "]";
	}
	
	
}
