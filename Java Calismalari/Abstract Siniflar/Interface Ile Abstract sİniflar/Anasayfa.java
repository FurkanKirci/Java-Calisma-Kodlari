package Hafta8devam;

public class Anasayfa {

	public static void main(String[] args) {
		
		DikUcgen du = new DikUcgen(3,4);
		�kizkenarUcgen iu = new �kizkenarUcgen(4,4,30);
		
		System.out.println("Dik ucgen alan:" + du.AlanHesapla());
		System.out.println("Dik ucgen cevre:" + du.CevreHesapla());
		
		System.out.println("�kizKenar ucgen alan:" + iu.AlanHesapla());
		System.out.println("�kizkenar ucgen cevre:" + iu.CevreHesapla());

	}

}
