package quizler;

import java.util.Scanner;

public class anasayfa {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String ad,soyad;
		int yas,gs,fs;
		System.out.print("kac Futbolcu bilgisi girilecek:");
		fs = reader.nextInt();
		Futbolcu[] futbolcular = new Futbolcu[fs];
		
		for(int i=0 ; i<fs ; i++) {
			
			reader.nextLine();
			
			System.out.print( (i+1) + ". Futbolcunun adý:");
			ad = reader.nextLine();
			System.out.print( (i+1) + ". Futbolcunun soyadý:");
			soyad = reader.nextLine();
			System.out.print( (i+1) + ". Futbolcunun yasi:");
			yas = reader.nextInt();
			System.out.print( (i+1) + ". Futbolcunun klüpteki toplam süresi:");
			gs = reader.nextInt();
			
			futbolcular[i] = new Futbolcu(ad,soyad,yas,gs);
		
		}
		futbolcular[0].SporcuSayisiVer();
		for(int i=0 ; i<fs ; i++) {
			futbolcular[i].BilgiYazdir();
			futbolcular[i].ZamHesapla(futbolcular[i].getYas(),futbolcular[i].getGs());
		}
	}

}
