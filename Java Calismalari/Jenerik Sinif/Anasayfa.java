package Hafta10;

import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		jenerik<Integer> nesne1 = new jenerik<Integer>(50);
		jenerik<String> nesne2 = new jenerik<String>("Mehmet");
		jenerik<Double> nesne3 = new jenerik<Double>(2.5);
		nesne1.NesneBilgileriniGoruntule();
		nesne2.NesneBilgileriniGoruntule();
		nesne3.NesneBilgileriniGoruntule();
		String ad,soyad;
		int yas;
		System.out.println("ad:");
		ad =reader.next();
		System.out.println("soyad:");
		soyad = reader.next();
		System.out.println("Yas");
		yas = reader.nextInt();
		Calisan calisanlar = new Calisan(ad,soyad,yas);
		jenerik<Calisan>  nesne4 = new jenerik<Calisan> (calisanlar);
		nesne4.NesneBilgileriniGoruntule();
	}

}
