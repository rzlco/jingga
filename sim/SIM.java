import java.util.ArrayList;
import java.util.Scanner;

public class SIM {
    static ArrayList<String> nama = new ArrayList<>();
    static ArrayList<String> tgl = new ArrayList<>();
    static ArrayList<String> tmp = new ArrayList<>();
    static ArrayList<String> goldar = new ArrayList<>();
    static ArrayList<String> jk = new ArrayList<>();
    static ArrayList<String> alm = new ArrayList<>();
    static ArrayList<String> jns = new ArrayList<>();
    static ArrayList<String> kota = new ArrayList<>();
    static ArrayList<String> kad = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
	
	int a=0;
	
	public static void main(String[] args) {
        SIM a = new SIM();
		
		a.runThis();
    }
	
    void runThis(){
        int pilihan=0;
        boolean y = true;
        do {
            System.out.println("                Program Pembuatan SIM                 ");
            System.out.println("======================================================");
            System.out.println("1.    Tambah Data");
            System.out.println("2.    Tampilkan Data");
            System.out.println("3.    Keluar");
            System.out.println("======================================================");
            System.out.print("Masukkan Pilihan    :   ");
            pilihan = in.nextInt();

            switch (pilihan){
                case 1:
					input();
                    break;
                case 2:
                    cetak();
                    break;
                case 3:
                    y = false;
                    System.out.println("======================================================");
                    System.out.println("Terimakasih Telah Menggunakan Program ini !!!");
                    System.out.println("======================================================");
            }
        }while(pilihan != 3);
    }
	
	void input(){
		
                    System.out.println("======================================================");
                    System.out.print("Masukkan Jumlah SIM yang Akan dibuat    :   ");
                    a = in.nextInt();
                    System.out.println("======================================================");
                    for (int i = 0; i <a ; i++) {
                        System.out.println("SIM Ke - "+(i+1));
                        System.out.print("Masukkan Nama             :  ");
                        nama.add(in.next());
                        System.out.print("Masukkan Tanggal Lahir    :  ");
                        tgl.add(in.next());
                        System.out.print("Masukkan Tempat Lahir     :  ");
                        tmp.add(in.next());
                        System.out.print("Masukkan Golongan Darah   :  ");
                        goldar.add(in.next());
                        System.out.print("Masukkan Jenis Kelamin    :  ");
                        jk.add(in.next());
                        System.out.print("Masukkan Alamat           :  ");
                        alm.add(in.next());
                        System.out.print("Masukkan Jenis SIM (A/B/C):  ");
                        jns.add(in.next());
                        System.out.print("Masukkan Kota Penerbitan  :  ");
                        kota.add(in.next());
                        System.out.print("Masukkan Kadaluarsa SIM   :  ");
                        kad.add(in.next());
                        System.out.println("======================================================");
                    }
		
	}
	
	void cetak(){
		
		System.out.println("======================================================");
                    System.out.print("Masukkan Data Yang Ingin ditampilkan    :   ");
                    a = in.nextInt();
                    System.out.println("======================================================");
                    for (int i = 0; i <a ; i++) {
                        System.out.println("Data SIM Ke - " + (i + 1));
                        System.out.println("Nama                :   " + nama.get(i));
                        System.out.println("Tanggal Lahir       :   " + tgl.get(i));
                        System.out.println("Tempat Lahir        :   " + tmp.get(i));
                        System.out.println("Golongan Darah      :   " + goldar.get(i));
                        System.out.println("Jenis Kelamin       :   " + jk.get(i));
                        System.out.println("Alamat              :   " + alm.get(i));
                        System.out.println("Jenis SIM           :   " + jns.get(i));
                        System.out.println("Kota Penerbitan     :   " + kota.get(i));
                        System.out.println("Kadaluarsa          :   " + kad.get(i));
                        System.out.println("======================================================");
                    }
		
	}

}
