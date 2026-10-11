import java.util.Scanner;;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("JAVA QUIZ GAME");
		System.out.println("==========================");
		System.out.print("Masukan nama pemain: ");
		String nama = input.next();
		int jawabanBenar = 0;
		int menu = -1;
		while (menu != 0) {
			System.out.println("1. Mulai Kuis");
			System.out.println("2. Petunjuk");
			System.out.println("0. Keluar");
			
			System.out.print("Pilih Menu: ");
			menu = input.nextInt();
			System.out.println(" ");
			
			switch (menu){
			case 1:
				System.out.println("Kuis dimulai");
				for(int i= 0; i < BankSoal.pertanyaan.length; i++) {
					System.out.println("\nPertanyaan" + (i + 1));
					System.out.println(BankSoal.pertanyaan[i]);
					for (int j = 0; j < BankSoal.pilihan[i].length; j++) {
						System.out.println(BankSoal.pilihan[i][j]);
						
					}
					System.out.print("Jawaban Anda: ");
					String jawaban = input.next().toUpperCase();
					
					if (jawaban.equals(BankSoal.kunci[i])) {
						System.out.println("selamat Jawaban anda benar");
						jawabanBenar++;
					} else {
						System.out.println("salah");
						System.out.println("Kunci: " + BankSoal.kunci[i]);
					}
				}
				Pemain pemain = new Pemain(nama);
				pemain.jumlahBenar = jawabanBenar;
				pemain.hitungSkor();
				pemain.tampilHasil();
				
				break;
			case 2:
				System.out.println("======== PETUNJUK GAME =======");
				System.out.println("1. Masukan nama anda\n"
						+ "2. Pilih Menu"
						+ "3. Pilih 0 untuk melihat Hasil");
				break;
			case 0:
				System.out.println("Terima Kasih! Program Telah selesai");
				break;
			}
			System.out.println(" ");
			
				
		}
		input.close();
		
	
	}
}
