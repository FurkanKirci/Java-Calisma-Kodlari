
public class Yildizlar {

	public static void main(String[] args) {

		int i = 0, j = 0;
		int satir = 6;
		int sutun = 6;
		for (i = 0; i < satir; i++) { // dik a��s� sol �stte olan ��gen
			for (j = i; j < sutun; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("---------------------------------------");

		for (i = 0; i < satir; i++) { // dik a��s� sol altta olan ��gen
			System.out.print("*");

			for (j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}
		System.out.println("---------------------------------------");

		for (i = 0; i < satir; i++) { // dik a��s� sa� �stte olan ��gen
			for (j = 0; j < sutun; j++) {

				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");

		for (i = 0; i < satir; i++) { // dik a��s� sa� altta olan ��gen
			for (j = 0; j < sutun; j++) {

				if (i + j < satir - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");

		for (i = 0; i < satir / 2; i++) { // kum saati �rne�i
			for (j = 0; j < sutun; j++) {
				if (i > j || i + j > satir - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		for (i = 0; i < satir / 2; i++) {
			for (j = 0; j < sutun; j++) {
				if (i + j < satir / 2 - 1 || j - i > satir / 2) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");

		for (i = 0; i < satir; i++) { // i�i bo� kare �rne�i
			for (j = 0; j < sutun; j++) {
				if (i == 0 || i == satir - 1 || j == satir - 1 || j == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("------------------------------");

		for (i = 0; i < satir; i++) { // baklava dilimi �rne�i
			for (j = 0; j < sutun; j++) {
				if (sutun % 2 == 1) {
					if (j + i == sutun / 2 || j - i == sutun / 2 || i - j == sutun / 2 || i + j == (sutun / 2) * 3) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				} else {
					if (i + j == sutun / 2 || j - i == sutun / 2 || i - j == sutun / 2 || i + j == ((sutun / 2) * 3) - 2) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();
		}

		System.out.println("------------------------------");

		for (i = 0; i < satir; i++) {
			for (j = 0; j < sutun; j++) {
				if (i + j < satir / 2 || j - i > satir / 2 || i+j > (satir*4)/3 || (i-j) > 4 ) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
