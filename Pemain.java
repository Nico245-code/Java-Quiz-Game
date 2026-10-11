public class Pemain {
	String nama;
	int jumlahBenar;
	int skor;
	static int jumlahPemain = 0;
	public Pemain(String nama) {
		nama = nama;
		jumlahBenar = 0;
		skor = 0;
		jumlahPemain++;
	}
	public void hitungSkor() {
		skor = jumlahBenar * 20;
	}
	public void tampilHasil() {
		System.out.println("====== Hasil Game ======");
		System.out.println("Nama Pemain: " + nama);
		System.out.println("Jumlah Benar: " + jumlahBenar);
		System.out.println("Skor: " + skor);
	}
}
