package hafta11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {

		ArrayList<Ogrenci> liste = new ArrayList<Ogrenci>();
		String ad, soyad;
		String line;
		String[] okunanlar;
		int no, secim;
		Scanner reader = new Scanner(System.in);

		try {
			File dosya = new File("Ogrenciler.txt");
			if (!dosya.exists()) {
				dosya.createNewFile();
			}
			FileReader fr = new FileReader(dosya);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				okunanlar = line.split(" ");
				no = Integer.parseInt(okunanlar[0]);
				ad = okunanlar[1];
				soyad = okunanlar[2];
				liste.add(new Ogrenci(no, ad, soyad));
			}

			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
		}

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("---------------------Menü------------------");
			System.out.println("1.) ogrenci ekle");
			System.out.println("2.) Listele");
			System.out.println("3.) Çýkýþ");
			System.out.println("4.) Deðiþiklik yap");
			System.out.println("-------------------------------------------");
			System.out.print("Secim yapiniz:");
			secim = reader.nextInt();
			
			switch (secim) {
			case 1: {
				System.out.print("ogrencinin No:");
				no = reader.nextInt();
				System.out.print("ogrencinin adi:");
				ad = reader.next();
				System.out.print("ogrencinin Soyadi:");
				soyad = reader.next();
				liste.add(new Ogrenci(no, ad, soyad));
				break;
			}
			case 2: {

				for (Ogrenci ogr : liste) {
					System.out.println("Ogrenci NO:" + ogr.no + " Ogrenci Ad:" + ogr.ad + " Ogrenci Soyad:" + ogr.soyad);
				}
				break;
			}
			case 3: {

				try {
					File dosya1 = new File("Ogrenciler.txt");
					if (!dosya1.exists()) {
						dosya1.createNewFile();
					}
					FileWriter fw = new FileWriter(dosya1);
					BufferedWriter bw = new BufferedWriter(fw);
					for (Ogrenci ogrenci : liste) {
						bw.write(ogrenci.no + " " + ogrenci.ad + " " + ogrenci.soyad + "\n");
					}
					bw.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				catch (IOException e) {

					e.printStackTrace();
				}

				System.out.println("Cikis Yaptiniz");
				kontrol = false;
				break;
			}
			case 4: {
				int degisim;
				System.out.println("Hangi indiste degisiklik yapmak istiyorsunuz:");
				degisim = reader.nextInt();
				System.out.print("ogrencinin No:");
				no = reader.nextInt();
				System.out.print("ogrencinin adi:");
				ad = reader.next();
				System.out.print("ogrencinin Soyadi:");
				soyad = reader.next();
				liste.set(degisim, new Ogrenci(no, ad, soyad));
				break;
			}

			default:
				System.out.println("yanlýþ seçim yaptýnýz");
			}
		}

	}

}
