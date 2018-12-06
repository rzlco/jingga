import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class syahrizal {

    String[] data = {"NIM", "NAMA"};
    int[] data2 = new int[7];
    private double nilai;
    String index;
    private String IndeksNilaiAkhir;

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(ir);

    public static void main(String[] args) {
        syahrizal A = new syahrizal();
        Scanner inp = new Scanner(System.in);
        A.menu();
    }

    void Data() {
		System.out.println(" ");
        System.out.println("Input");
		System.out.println(" ");
        try {
            System.out.print("Nama                  : ");
            this.data[0] = inp.readLine();
            System.out.print("NIM                   : ");
            this.data[1] = inp.readLine();
            System.out.print("Nilai Assesment 1     : ");
            this.data2[1] = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Assesment 2     : ");
            this.data2[2] = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Assesment 3     : ");
            this.data2[3] = Integer.parseInt(inp.readLine());
            System.out.print("Nilai tugas           : ");
            this.data2[4] = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Praktikum       : ");
            this.data2[5] = Integer.parseInt(inp.readLine());
			System.out.println(" ");
            System.out.println("Berhasil Input Data Nilai ");
            pressEnter();
        } catch (Exception e) {
            System.out.println(e);
        }
        menu();

    }

    void hasil() {
        this.nilai = nilai + (0.15 * data2[1]);
        this.nilai = nilai + (0.15 * data2[2]);
        this.nilai = nilai + (0.1 * data2[3]);
        this.nilai = nilai + (0.2 * data2[4]);
        this.nilai = nilai + (0.4 * data2[5]);
        System.out.println("Hasil Nilai");
        System.out.println("Nama            : " + this.data[0]);
        System.out.println("NIM             : " + this.data[1]);
        System.out.println("Assesment 1     : " + this.data2[1]);
        System.out.println("Assesment 2     : " + this.data2[2]);
        System.out.println("Assesment 3     : " + this.data2[3]);
        System.out.println("Tugas	    	: " + this.data2[4]);
        System.out.println("Praktikum       : " + this.data2[5]);
        System.out.println("Akhir           : " + this.nilai);
        if (nilai > 81) {
            index = "A";
        } else if (nilai <= 81) {
            index = "AB";
        } else if (nilai <= 75) {
            index = "B";
        } else if (nilai <= 65) {
            index = "C";
        } else if (nilai < 55) {
            index = "D";
        }
        System.out.println("Indeks Nilai    : " + this.index);
        pressEnter();

        menu();
    }

    public void menu() {
        int pilihan;

        Scanner inputMenu = new Scanner(System.in);
		System.out.println(" ");
        System.out.println("Indeks Nilai Mahasiswa");
		System.out.println(" ");
        System.out.println("1. Input Data ");
        System.out.println("2. View Nilai");
        System.out.println("3. Exit");
        System.out.println(" ");
        System.out.print("Tentukan Pilihan Anda : ");

        pilihan = inputMenu.nextInt();

        switch (pilihan) {
            case 1:
                Data();
                break;
            case 2:
                hasil();
                break;
            case 3:
                System.out.println("Exit ");
                break;
            default:
                System.out.println("404");
                break;
        }
    }

    void pressEnter() {
        try {
            System.out.println(" ");
            System.out.println("Enter");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
