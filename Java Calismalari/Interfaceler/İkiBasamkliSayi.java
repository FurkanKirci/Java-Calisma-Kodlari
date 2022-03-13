package hafta9;

public class ÝkiBasamkliSayi extends Sayilar{

	public int bs;
	public ÝkiBasamkliSayi(int sayi) {
		super(sayi);
		this.bs = 2;
		
	}

	
	@Override
	public int[] SayiBabul() {
		int[] dizi = new int[2];
		int kalan,indis=0;
		while(sayi>0) {
			kalan = sayi%10;
			sayi = sayi - kalan;
			sayi=sayi/10;
			dizi[indis] = kalan;
			indis++;
		}
		return dizi;
		
	
		
	}
	@Override
	public void SayiBilgisi() {
		System.out.println("iki basamaklý sayi:" + sayi);
		
	}

	@Override
	public void Topla() {
	int toplam = 0;
	int[] basamaklar = SayiBabul();
	for(int i=0 ; i<bs ; i++) {
		toplam = toplam + basamaklar[i];
	}
	 System.out.println("Basamak toplamý:" + toplam);
	}
		
	

	

}
