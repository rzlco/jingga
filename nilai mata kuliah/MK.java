import java.io.BufferedReader;
import java.io.InputStreamReader;

class NilaiMK{
	private String nim;
	private int a1;
	private int a2;
	private int a3;
	private int tugas;
	private int prakt;
	private double nilai;
	
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader inp = new BufferedReader(isr);

void inputData(){
	System.out.println("Nilai Algoritma dan Pemrograman");
	try{
	System.out.print("NIM : ");
	this.nim = inp.readLine();
	System.out.print("Nilai assessment 1 : ");
	this.a1= Integer.parseInt(inp.readLine());
	System.out.print("Nilai assessment 2 : ");
	this.a2= Integer.parseInt(inp.readLine());
	System.out.print("Nilai assessment 3 : ");
	this.a3= Integer.parseInt(inp.readLine());
	System.out.print("Nilai tugas : ");
	this.tugas= Integer.parseInt(inp.readLine());
	System.out.print("Nilai praktikum : ");
	this.prakt= Integer.parseInt(inp.readLine());
}
	catch(Exception e){
	System.out.println("Error : "+e);
}
	hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.prakt);
}

void hitungNilai(int a1, int a2, int a3, int tugas, int prakt){
	this.nilai = (0.15*a1);
	this.nilai = nilai + (0.15*a2);
	this.nilai = nilai + (0.1*a3);
	this.nilai = nilai + (0.2*tugas);
	this.nilai = nilai + (0.4*prakt);
}

void viewNilai(){ 
	System.out.println("\n\n\nNilai Assessment"); 
	System.out.println("NIM     : " + this.nim);
	System.out.println("Assessment 1 : " + this.a1);
	System.out.println("Assessment 2 : " + this.a2);
	System.out.println("Assessment 3 : " + this.a3);
	System.out.println("Tugas        : " + this.tugas);
	System.out.println("Praktikum    : " + this.prakt);
	System.out.println("Nilai Akhir  : " + this.nilai);
	}
	
public static void main(String[] xyz){ 
	NilaiMK nmk = new NilaiMK();
	nmk.inputData();
	nmk.viewNilai();
	}
}