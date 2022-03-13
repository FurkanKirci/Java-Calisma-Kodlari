package Hafta92;

import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {
		int secim;
		Scanner reader = new Scanner(System.in);
		String ad, soyad;
		int Vize, Final, kisi_sayisi;
		boolean kontrol = true;
		ArrayList<Ogrenci> liste = new ArrayList<Ogrenci>();

		while (kontrol) {

			System.out.println("---------------------Men�------------------");
			System.out.println("1.) ogrenci ekle");
			System.out.println("2.) Listele");
			System.out.println("3.) ara");
			System.out.println("4.) sil");
			System.out.println("5.) ��k��");

			System.out.println("Se�im yap:");
			secim = reader.nextInt();

			switch (secim) {
			case 1:

				System.out.println("ogrencinin adi:");
				ad = reader.next();
				System.out.println("ogrencinin Soyadi:");
				soyad = reader.next();
				System.out.println("ogrencinin Vize notu:");
				Vize = reader.nextInt();
				System.out.println("ogrencinin final notu:");
				Final = reader.nextInt();
				Ogrenci ogrenciler = new Ogrenci(ad, soyad, Vize, Final);
				liste.add(ogrenciler);

				break;
			case 2:
				for (Ogrenci ogrencii : liste) {
					System.out.println("��renci No:" + ogrencii.getNo());
					System.out.println("ad:" + ogrencii.getAd());
					System.out.println("soyad:" + ogrencii.getSoyad());
					System.out.println("vize:" + ogrencii.getVize_not());
					System.out.println("final:" + ogrencii.getFinal_not());
					System.out.println("gecme notu:" + ogrencii.getGecme_notu());
				}
				break;
			case 3:
				System.out.println("Aranacak �pgrencini ad�n� giriniz:");
				ad = reader.next();
				int sayac = 0;
				for (Ogrenci ogrenci : liste) {
					if (ogrenci.getAd().equals(ad)) {
						sayac++;
						System.out.println("��renci No:" + ogrenci.getNo());
						System.out.println("ad:" + ogrenci.getAd());
						System.out.println("soyad:" + ogrenci.getSoyad());
						System.out.println("vize:" + ogrenci.getVize_not());
						System.out.println("final:" + ogrenci.getFinal_not());
						System.out.println("gecme notu:" + ogrenci.getGecme_notu());
					}
					if (sayac == 0) {
						System.out.println("yok ");
					}
				}
				break;
			case 4:
				System.out.println("Silinecek ��renci ad:");
				ad = reader.next();
				for(int i=0 ; i<liste.size() ; i++) {
					if(ad.equals(liste.get(i).getAd())) {
						liste.remove(i);
						System.out.println("ogrenci listeden silindi");
					}
				}
				
				break;
			case 5:
				kontrol = false;
				break;
			}

		}
	}

}
