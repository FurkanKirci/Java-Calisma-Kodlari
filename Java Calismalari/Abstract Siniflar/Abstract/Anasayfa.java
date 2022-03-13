package ders8;

import java.util.Scanner;



public class Anasayfa {

	public static void BilgileriGoster(Muhendis[] muhendis) {
		for(int i=0 ; i<muhendis.length ; i++) {
			muhendis[i].BilgileriGoster();
		}
	}
	public static void PuanHesap(Muhendis muhendis) {
		muhendis.PuanHesapla();
	}
	
	
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int toplam,bs,es,ms,yas;
		String ad;
		
		System.out.print("kac adet bilgisayar muhendisi girilecek");
		bs = reader.nextInt();
		System.out.print("kac adet makina muhendisi girilecek");
		ms = reader.nextInt();
		System.out.print("kac adet elektrik muhendisi girilecek");
		es=reader.nextInt();
		toplam = bs+ms+es;
		
		Muhendis[] muhendisler = new Muhendis[toplam];
		for(int i=0 ; i<bs ; i++) {
			System.out.print("Bilgisayarcýnýn Ýsim:");
			ad = reader.next();
			System.out.print("bilgisayarcýnýn Yas:");
			yas=reader.nextInt();
			muhendisler[i] = new BilgisayarMuhendisi(ad,yas);
		}
		for(int i=bs ; i<bs+es ; i++) {
			System.out.print("Elektrikçinin Ýsim:");
			ad = reader.next();
			System.out.print("elektrikcinin Yas:");
			yas=reader.nextInt();
			muhendisler[i] = new ElektrikMuhendisi(ad,yas);
		}
		for(int i=bs+es ; i<bs+es+ms ; i++) {
			System.out.print("Makinacýnýn Ýsim:");
			ad = reader.next();
			System.out.print("Makinacýnýn Yas:");
			yas=reader.nextInt();
			muhendisler[i] = new MakinaMuhendisi(ad,yas);
		}
		BilgileriGoster(muhendisler);
		for(int i=0 ; i<toplam ; i++) {
			PuanHesap(muhendisler[i]);
		}
		
		BilgileriGoster(muhendisler);

		
	}
}
