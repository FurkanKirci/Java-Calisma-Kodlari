package ders8;

public abstract class Muhendis {

	public String ad;
	public int yas;
	public int puan;
	public String brans;
	public Muhendis(String ad, int yas) {
		super();
		this.ad = ad;
		this.yas = yas;
	}
	public void BilgileriGoster() {
		System.out.println("---------------Muhendis Sınıfı-------------------");
		System.out.println("İsim: " + ad);
		System.out.println("yas: " + yas);
		System.out.println("Brans: " +brans);
		System.out.println("puan: " + puan);
		System.out.println("-------------------------------------------------");
	}
	
	public abstract int PuanHesapla();
	
}
