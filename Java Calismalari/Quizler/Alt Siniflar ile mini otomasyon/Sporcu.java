package quizler;

public class Sporcu {
	public String ad;
	public String soyad;
	public int yas;
	public String brans;
	public static int sayac = 0;
	
	public Sporcu() {
		
	}
	
	public Sporcu(String ad, String soyad, int yas) {
		super();
	
		this.sayac = ++sayac;
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}

	public Sporcu(String ad, String soyad) {
		super();
		this.sayac = ++sayac;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public void BilgiYazdir() {
		System.out.println("sporcu adý:" + ad);
		System.out.println("sporcu soyadý:" + soyad);
		System.out.println("sporcu yaþý:" + yas);
	}
	public final void SporcuSayisiVer() {
		System.out.println("___________________________");
		System.out.println("Toplam kisi sayisi:" + sayac);
		System.out.println("___________________________");
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	
}
