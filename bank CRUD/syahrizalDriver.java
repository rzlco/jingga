import java.util.ArrayList;
import java.util.Scanner;

class syahrizalDriver {

    Scanner inp = new Scanner(System.in);
    ArrayList<syahrizal> rek = new ArrayList<>();
    double saldoMinimal = 500000;

    public static void main(String[] args) {

        syahrizalDriver a = new syahrizalDriver();
        a.menu();

    }
	
	private void menu() {
		
		int pilih = 0;
		boolean y = true;
		
        System.out.println("=== MENU ===");
        System.out.println("1. Buat rekening");
        System.out.println("2. Cek rekening");
        System.out.println("3. Tabung");
        System.out.println("4. Tarik");
        System.out.println("5. Transfer");
        System.out.println("6. keluar");
        System.out.print("Masukan Pilihan : ");
        pilih = inp.nextInt();
		do {
        switch (pilih) {
            case 1:
                BuatRekening();
                break;
            case 2:
                cekRekening();
                break;
            case 3:
                tabung();
                break;
            case 4:
                tarik();
                break;
//                case 5;
            //              transfer();
            //          break;
            case 6:
				y = false;
				System.out.println("Exit");
				break;
//                    default;
        }
		}while(pilih != 3);
    }

    private void BuatRekening() {
        System.out.println("Anda Memilih Buat Rekening");
        System.out.println("Masuka Nama : ");
        String nama = inp.next();
        System.out.println("Masukan saldo");
        double saldo = inp.nextDouble();

        if (saldo < saldoMinimal) {
            System.out.println("Saldo awal tidak cukup");
        } else {
            int no;
            if (!rek.isEmpty()) {
                no = rek.get(rek.size() - 1).getNo() + 1;
            } else {
                no = 1;
            }
            syahrizal rek1 = new syahrizal(no, nama, saldo);
            rek.add(rek1);
            System.out.println("Rekening Telah di Tambahkan");
        }
    }

    public int cekRekening() {
        int ketemu = -1;
        for (int i = 0; i < rek.size(); i++) {
            if (rek.get(i).getNo() == -1) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }

    public void tabung() {

        int post = cekRekening();
        System.out.print("Masukan Nomor Rekening : ");
        int noRek = inp.nextInt();
        System.out.print("Masukan Saldo Tambahan : ");
        int jumlah = inp.nextInt();
        if (post >= 0) {
            double saldoAkhir = rek.get(post).getSaldo() + jumlah;
            rek.get(post).setSaldo(saldoAkhir);
            System.out.println("saldo telah di tambahkan");
        } else {
            System.out.println("no rekening tidak di temukan,Transaksi di batalkan");
        }
    }

    private void tarik() {
        System.out.print("Masukan Nomor Rekening : ");
        int noRek = inp.nextInt();
        System.out.print("Masukan jumlah Yang Akan Ditarik :  : ");
        int tarik = inp.nextInt();

        int post = cekRekening();
        if (post >= 0) {
            double saldoAkhir = rek.get(post).getSaldo() - tarik;
            if (saldoAkhir < saldoMinimal) {
                rek.get(post).setSaldo(saldoAkhir);
                System.out.println("Transaksi Selesai");
            } else {
                System.out.println("Saldo tidak cukup,Transaksi Dibatalkan");
            }
        } else {
            System.out.println("NO rekening Tidak Ditemukan,Transaksi Dibatalkan");
        }
    }
}