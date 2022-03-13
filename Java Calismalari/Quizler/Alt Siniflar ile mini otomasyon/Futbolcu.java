package quizler;

public class Futbolcu extends Sporcu {

		private int id;
		public int gs;
		private static int sayac = 0; 
		
		public Futbolcu() {
			
		}
		

		@Override
		public void BilgiYazdir() {
			// TODO Auto-generated method stub
			System.out.println("ID:" + id);
			System.out.println("Brans:" + brans);
			super.BilgiYazdir();
			System.out.println("Futbolcunun toplam senesi" + gs);
		}

		public Futbolcu(String ad, String soyad, int yas, int gs) {
			super(ad, soyad, yas);
			this.id = ++sayac;
			this.gs = gs;
			this.brans = "Futbolcu";
		}


		public int getGs() {
			return gs;
		}


		public void setGs(int gs) {
			this.gs = gs;
		}




		public void ZamHesapla(int yas , int gs) {
			double zam = 0;
			if(gs > 7) {
				zam = yas*0.3;
			}else if(gs > 15) {
				zam = yas*0.4;
			}else {
				zam = yas*0.1;
			}
			System.out.println("Zam:" + zam);
			System.out.println("------------------------------");
		}
		
		
		
}
