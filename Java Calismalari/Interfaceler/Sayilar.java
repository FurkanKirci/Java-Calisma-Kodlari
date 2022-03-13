package hafta9;

public abstract class Sayilar implements BasamakToplamiHesapla{

	public int sayi;
	
	public Sayilar(int sayi) {
		super();
		this.sayi = sayi;
	}

	public abstract void SayiBilgisi();
}
