package Hafta7Tekrar;

public class ElektrikMuhendisi extends Muhendis{

	public ElektrikMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans = "Elektrik muhendisi";
	}

	@Override
	public void BilgileriGoster() {
		System.out.println("---------------Elektrik Muhendis Sınıfı-------------------");
		System.out.println("İsim: " + ad);
		System.out.println("yas: " + yas);
		System.out.println("Brans: " +brans);
		System.out.println("puan: " + puan);
		System.out.println("----------------------------------------------------------");
	}

	@Override
	public int PuanHesapla() {
		return this.puan = yas*4;
	}

	
	
}
