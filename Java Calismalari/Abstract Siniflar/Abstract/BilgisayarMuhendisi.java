package ders8;

public class BilgisayarMuhendisi extends Muhendis {
	public BilgisayarMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans = "Bilgisayar Muhendisi";
	}

	@Override
	public void BilgileriGoster() {
		System.out.println("---------------Bilgisayar Muhendis Sınıfı-------------------");
		System.out.println("İsim: " + ad);
		System.out.println("yas: " + yas);
		System.out.println("Brans: " +brans);
		System.out.println("puan: " + puan);
		System.out.println("------------------------------------------------------------");
	}

	@Override
	public int PuanHesapla() {
		return this.puan = yas*5;
	}

}
