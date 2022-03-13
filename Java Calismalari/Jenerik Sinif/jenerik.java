package Hafta10;

public class jenerik <T>{
	T ozellik;
	
	
	
	
	public jenerik(T ozellik) {
		super();
		this.ozellik = ozellik;
	}
	public void NesneBilgileriniGoruntule() {
		System.out.println("_____________________________________________");
		System.out.println("Nesnenin Tipi:" + ozellik.getClass().getName());
		System.out.println("Nesne degeri:" + ozellik.toString());
		System.out.println("_____________________________________________");
	}
}
