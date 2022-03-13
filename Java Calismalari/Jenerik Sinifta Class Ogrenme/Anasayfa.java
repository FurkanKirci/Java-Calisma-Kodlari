package hafta102;

public class Anasayfa {

	public static <Veritipi> String Bilgiler(Veritipi veri) {
		System.out.println("Nesnenin Class'ý:" + veri.getClass().getName());

		return veri.toString();
	}

	public static void main(String[] args) {

	Ogrenci ogrenci = new Ogrenci(1010," Mehmet"," Kýlýç");
	Ogretmen ogretmen = new Ogretmen(" ayþe", " Gülcü ",40, " Matematik");
	System.out.println(Bilgiler(ogrenci));
	System.out.println(Bilgiler(ogretmen));
	System.out.println(Bilgiler(10));
	System.out.println(Bilgiler("Kitap"));
	}

}
