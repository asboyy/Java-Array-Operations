import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LARIK {
	static int [] Larik = new int [25];
	static int ukuranLarik;
	public static void main(String[] args) {
		System.out.print("Berapa ukuran larik? ");
		ukuranLarik = inputData();
		for (int j=0; j<ukuranLarik; j++) {
			System.out.print("Masukkan larik ke-" + (j+1) + " ");
			Larik[j] = inputData();
			}
			MAX();
			MIN();
			AVERAGE();
		}
		private static void AVERAGE(){
			double average = 0.0;
			for (int avg=0;avg<ukuranLarik; avg++) {
				average = average + Larik[avg];
			}
			average = average / ukuranLarik;
			System.out.println("Rata-rata bilangan dalam larik = "+ average); }

		private static int inputData() {
			BufferedReader bfr = new BufferedReader
			(new InputStreamReader(System.in));
			String angkaInput = null;
			try {
				angkaInput = bfr.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			int Data = Integer.valueOf(angkaInput).intValue();
			return Data;
		}
		private static void MIN() {
			int minimum = Larik[0];
			for (int min=0; min < ukuranLarik; min++) {
				if (minimum > Larik [min]) {
					minimum = Larik [min];
					}
				}
				System.out.println("Bilangan terkecil dalam larik = " + minimum);
			}
			private static void MAX () {
				int maximum = Larik[0];
				for (int max=0; max < ukuranLarik; max++) {
					if (maximum < Larik [max]) {
						maximum = Larik [max];
						}
					}
					System.out.println("Bilangan terbesar dalam larik = " + maximum);
			}
}