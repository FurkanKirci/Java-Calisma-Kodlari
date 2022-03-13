package Hafta8devam;

public class DikUcgen extends Ucgen implements Alan,Cevre{

	public int acı;
	public DikUcgen(int kenar1, int kenar2) {
		super(kenar1, kenar2);
		this.acı = 90;
		this.kenar3 = (int) Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
		
	}

	@Override
	public void UcgenTipiYazdir() {
		System.out.println("bu dik ucgen");
		
	}

	@Override
	public int CevreHesapla() {
		// TODO Auto-generated method stub
		return kenar1+kenar2+kenar3;
	}

	@Override
	public int AlanHesapla() {
		// TODO Auto-generated method stub
		return (kenar1*kenar2)/2;
	}

}
