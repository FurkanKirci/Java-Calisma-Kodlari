package hafta102;

public class Ogrenci {
	public int no;
	public String ad;
	public String soyad;
	
	
	
	public Ogrenci(int no, String ad, String soyad) {
		super();
		this.no = no;
		this.ad = ad;
		this.soyad = soyad;
	}



	@Override
	public String toString() {
		
		return "Ogrenci No: " + no + "Ogrenci ad:" + ad + "Ogrenci Soyad:" + soyad;
	}



	
}
