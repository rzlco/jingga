import java.util.ArrayList;
import java.util.Scanner;

class syahrizalDriver {

    Scanner inp = new Scanner(System.in);
    ArrayList<syahrizal> rek = new ArrayList<>();
    double saldoMinimal = 500000;
	int a;
	String nama;
	double saldo;
	int no;
	
	public static void main(String[] args) {

        syahrizalDriver a = new syahrizalDriver();
        a.runThis();

    }
    void runThis(){
        int pilihan=0;
        boolean y = true;
        do {
            System.out.println("                Bank                 ");
            System.out.println("======================================================");
            System.out.println("1.    Buat Rekening");
            System.out.println("2.    Tabung");
			System.out.println("3.    Tarik");
			System.out.println("4.    Transfer");
			System.out.println("5.    Cek Rekening");
            System.out.println("6.    Keluar");
            System.out.println("======================================================");
            System.out.print("Masukkan Pilihan    :   ");
            pilihan = inp.nextInt();

            switch (pilihan){
                case 1:
					input();
                    break;
                case 2:
                    tabung();
                    break;
				case 3:
                    tarik();
                    break;
				case 4:
					transfer();
                    break;
				case 5:
					cetak();
                    break;
                case 6:
                    y = false;
                    System.out.println("======================================================");
                    System.out.println("Terimakasih Telah Menggunakan Program ini !!!");
                    System.out.println("======================================================");
            }
        }while(pilihan != 6);
    }
	
	void input(){
		
                    System.out.println("======================================================");
                    System.out.print("Masukkan Jumlah Rekening yang Akan dibuat    :   ");
                    a = inp.nextInt();
                    System.out.println("======================================================");
                    for (int i = 0; i <a ; i++) {
                        System.out.println("Rekening Ke - "+(i+1));
						System.out.print("Masukan No Rekening : ");
						no = inp.nextInt();
                        System.out.print("Masukan Nama : ");
						nama = inp.next();
						System.out.print("Masukan saldo : ");
						saldo = inp.nextDouble();

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
						
                        System.out.println("======================================================");
                    }
		
	}
	
	public int cekRekening() {
        int ketemu = 1;
        for (int i = 0; i < rek.size(); i++) {
            if (rek.get(i).getNo() == 1) {
                ketemu = i;
                break;
            }
        }
        return ketemu;
    }
	
	public void tabung() {

        System.out.print("Masukan Nomor Rekening : ");
        int noRek = inp.nextInt();
	int post = cekRekening();
        System.out.print("Masukan Saldo Tambahan : ");
        int jumlah = inp.nextInt();
        if (post >= 0) {
            double saldoAkhir = rek.get(post).getSaldo() + jumlah;
            rek.get(post).setSaldo(saldoAkhir);
            System.out.println("Saldo telah di tambahkan");
			System.out.println("Saldo sekarang : " + saldoAkhir);
        } else {
            System.out.println("no rekening tidak di temukan,Transaksi di batalkan");
        }
    }
	
	public void tarik() {

		System.out.print("Masukan Nomor Rekening : ");
        int noRek = inp.nextInt();
	int post = cekRekening();
        System.out.print("Masukan jumlah Yang Akan Ditarik :  : ");
        int tarik = inp.nextInt();
        if (post >= 0) {
            double saldoAkhir = rek.get(post).getSaldo() - tarik;
            rek.get(post).setSaldo(saldoAkhir);
            System.out.println("Saldo telah di kurangi");
			System.out.println("Saldo sekarang : " + saldoAkhir);
        } else {
            System.out.println("no rekening tidak di temukan,Transaksi di batalkan");
        }
    }
	
	public void transfer() {

		System.out.print("Masukan Nomor Rekening Tujuan : ");
        int noRek = inp.nextInt();
	int post = cekRekening();
        System.out.print("Masukan jumlah Yang Akan Ditransfer : ");
        int transfer = inp.nextInt();
        if (post >= 0) {
            double saldoAkhir = rek.get(post).getSaldo() - transfer;
            rek.get(post).setSaldo(saldoAkhir);
            System.out.println("Saldo telah di kurangi");
			System.out.println("Transfer ke no rekening " + noRek + " sejumlah Rp. " + transfer + " Sukses");
			System.out.println("Saldo sekarang : " + saldoAkhir);
        } else {
            System.out.println("no rekening tidak di temukan,Transaksi di batalkan");
        }
    }
	
	void cetak(){
		
					System.out.println("======================================================");
                    System.out.print("Masukkan Data Yang Ingin ditampilkan    :   ");
                    a = inp.nextInt();
                    System.out.println("======================================================");
                    for (int i = 0; i < a ; i++) {
                        System.out.println("Data Rekening Ke - " + (i + 1));
						syahrizal r = new syahrizal(no, nama, saldo); 
						rek.add(r); 
						r.cetak();
                    }
					System.out.println("======================================================");
	}

}
