package Hafta8devam;

public class �kizkenarUcgen extends Ucgen implements Alan,Cevre {

	public int ac�;
	public �kizkenarUcgen(int kenar1, int kenar2,int ac�) {
		super(kenar1, kenar2);
		this.ac� = ac�;

		
	}

	@Override
	public void UcgenTipiYazdir() {
		// TODO Auto-generated method stub
		System.out.println("Bu ikizkenar");
		
	}

	@Override
	public int CevreHesapla() {
		// TODO Auto-generated method stub
	
		return 0;
	}

	@Override
	public int AlanHesapla(){
		
		int alan = (int) (1/2 * kenar1 * kenar2 * Math.sin(ac�));
		return alan;
	}

}
