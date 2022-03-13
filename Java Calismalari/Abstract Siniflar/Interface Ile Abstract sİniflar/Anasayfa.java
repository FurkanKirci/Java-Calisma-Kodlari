package Hafta8devam;

public class Anasayfa {

	public static void main(String[] args) {
		
		DikUcgen du = new DikUcgen(3,4);
		ÝkizkenarUcgen iu = new ÝkizkenarUcgen(4,4,30);
		
		System.out.println("Dik ucgen alan:" + du.AlanHesapla());
		System.out.println("Dik ucgen cevre:" + du.CevreHesapla());
		
		System.out.println("ÝkizKenar ucgen alan:" + iu.AlanHesapla());
		System.out.println("Ýkizkenar ucgen cevre:" + iu.CevreHesapla());

	}

}
