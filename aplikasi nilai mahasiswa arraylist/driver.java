import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class driver {

    Scanner inp = new Scanner(System.in);
	InputDataMahasiswa input = new InputDataMahasiswa();
	
	double uts,uas,quiz,akhir;
	String nama,nim;
	int a;
	
	public static void main(String[] args) {

        driver a = new driver();
        a.runThis();

    }
    void runThis(){
        int pilihan=0;
        boolean y = true;
        do {
            System.out.println("                Hitung Nilai                 ");
            System.out.println("======================================================");
            System.out.println("1.    Input Nilai");
            System.out.println("2.    Statistik");
            System.out.println("3.    Keluar");
            System.out.println("======================================================");
			System.out.print("Masukkan Pilihan         :   ");
            pilihan = inp.nextInt();

            switch (pilihan){
                case 1:
					input();
                    break;
				case 2:
					statistic();
                    break;
                case 3:
                    y = false;
                    System.out.println("======================================================");
                    System.out.println("Terimakasih Telah Menggunakan Program ini");
                    System.out.println("======================================================");
            }
        }while(pilihan != 3);
    }
	
	void input(){
		
					System.out.println("======================================================");
                    System.out.print("Masukkan data sebanyak    :   ");
                    a = inp.nextInt();
                    System.out.println("======================================================");
                    for (int i = 0; i <a ; i++) {
						System.out.println("Data ke - "+(i+1));
		
						System.out.print("Nama  : ");
						nama = inp.next();
                        System.out.print("NIM   : ");
						nim = inp.next();
						System.out.print("UTS   : ");
						uts = inp.nextDouble();
						System.out.print("UAS   : ");
						uas = inp.nextDouble();
						System.out.print("Quiz  : ");
						quiz = inp.nextDouble();
							
						
						input.insertData(nama,nim,uts,uas,quiz);
						System.out.println("Nilai Telah di Tambahkan");
		
					}
	}
	
	
	void statistic(){
		
        for (control mhs : input.getALL()) {
			
		
		System.out.println("======================================================");
		System.out.println("Statistik"); 
		System.out.println("======================================================");
		System.out.println("Nama           : " + mhs.getNama()); 
		System.out.println("NIM            : " + mhs.getNim());
		System.out.println("Nilai UTS      : " + mhs.getUts());
		System.out.println("Nilai UAS      : " + mhs.getUas());
		System.out.println("Nilai Quiz     : " + mhs.getQuiz());
		akhir = ((mhs.getUts()*0.3)+(mhs.getUas()*0.4)+(mhs.getQuiz()*0.3));
		System.out.println("Nilai Akhir    : " + akhir);
		
		}
	}

}