package hafta102;

public class Ogretmen {
	public String ad;
	public String soyad;
	public int yas;
	public String brans;
	public Ogretmen(String ad, String soyad, int yas, String brans) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
		this.brans = brans;
	}
	@Override
	public String toString() {
		
		return "Ogretmen ad:" + ad +" Ogretmen soyad:" + soyad + " Ogretmen yas:" + yas +" Ogretmen brans:" + brans;
	}
	
}
