package com.berka;

public class Runner {

	public static void main(String[] args) {
		//nesne olusturup adresi referans degiskene aktarma
		Bolum bolum1=new Bolum();
		Hoca hoca1=new Hoca();
		Ders ders1=new Ders();
		Ogrenci ogrenci1=new Ogrenci();
		
		bolum1.ad="Yazilim Muhendisligi";
		bolum1.baskan=hoca1;
		bolum1.dersler=new Ders[50];
		bolum1.dersler[0]=ders1;
		bolum1.ogrenciler=new Ogrenci[200];
		bolum1.ogrenciler[0]=ogrenci1;
		
		hoca1.ad="Ahmet Kara";
		hoca1.unvan="Prof.";
		hoca1.bolum=bolum1;
		hoca1.danisanlar=new Ogrenci[10];
		hoca1.danisanlar[0]=ogrenci1;
		hoca1.verdigiDersler=new Ders[5];
		hoca1.verdigiDersler[0]=ders1;
		
		ders1.kod="CS50";
		ders1.ad="Computer Science";
		ders1.kredi=3;
		ders1.bolum=bolum1;
		ders1.hoca=hoca1;
		ders1.ogrenciler=new Ogrenci[50];
		ders1.ogrenciler[0]=ogrenci1;
		
		ogrenci1.no="20231250";
		ogrenci1.ad="Berk Aktas";
		ogrenci1.bolum=bolum1;
		ogrenci1.danisman=hoca1;
		ogrenci1.aldigiDersler=new Ders[8];
		ogrenci1.aldigiDersler[0]=ders1;
		
		//ogrenci1'in aldigi ilk dersi yazdirin
		System.out.println("Ogrenci1'in aldigi ilk dersin adi: ");
		System.out.println(ogrenci1.aldigiDersler[0].ad);//direk nesneye gidersen adres dondurur. ozelligine gidersen adini verir
		System.out.println("======================================");
		//ogrenci1'in aldigi derslerin ilkinin hocasinin adi:
		System.out.println("ogrencinin ilk hocasi: ");
		System.out.println(ogrenci1.aldigiDersler[0].toString());
		
		System.out.println("======================================");
		
		//ogrenci1'in aldigi derslerin ilkinin hocasinin bolumunun adi
		System.out.println(ogrenci1.aldigiDersler[0].hoca.bolum.ad);
	
	}

}
