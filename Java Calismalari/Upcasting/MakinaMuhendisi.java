package Hafta7Tekrar;

public class MakinaMuhendisi extends Muhendis{

	public MakinaMuhendisi(String ad, int yas) {
		super(ad, yas);
		this.brans = "Makina muhendisi";
	}

	@Override
	public void BilgileriGoster() {
		System.out.println("---------------Makina Muhendis Sınıfı-------------------");
		System.out.println("İsim: " + ad);
		System.out.println("yas: " + yas);
		System.out.println("Brans: " +brans);
		System.out.println("puan: " + puan);
		System.out.println("--------------------------------------------------------");
	}

	@Override
	public int PuanHesapla() {
		return this.puan = this.yas*3;
	}

	

	
	
}
