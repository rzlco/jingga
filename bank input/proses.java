import java.io.BufferedReader;
import java.io.InputStreamReader;

class proses{
	String nama, alamat, rek, pin;
	double awal,sekarang,tambah,ambil;

InputStreamReader isr = new InputStreamReader(System.in);	
BufferedReader inp = new BufferedReader(isr);

public void input(){
	try{
		String temp="";
		System.out.println("Banking Application");
		pressEnter();
		System.out.println("Add new data");
		pressEnter();
		System.out.print("Nama 				: ");
		nama = inp.readLine();
		System.out.print("Alamat 				: ");
		alamat = inp.readLine();
		System.out.print("Nomor Rekening 			: ");
		rek = inp.readLine();
		System.out.print("PIN 				: ");
		pin = inp.readLine();
		System.out.print("Saldo Awal 			: ");
		temp = inp.readLine();
		awal = Double.parseDouble(temp);
		pressEnter();
}
	catch (Exception e){
		System.out.println(e);
	}
}

public void lihat(){
	System.out.println("---------------------------------");
	System.out.println("Information");
	System.out.println("---------------------------------");
	System.out.println("Nama				: "+nama);
	System.out.println("Alamat				: "+alamat);
	System.out.println("No Rekening			: "+rek);
	System.out.println("PIN				: "+pin);
	System.out.println("Saldo Awal			: "+awal);
	System.out.println("Tambahan Saldo			: "+tambah);
	System.out.println("Tarikan Saldo			: "+ambil);
	System.out.println("Saldo Sekarang			: "+sekarang);
	System.out.println("---------------------------------");
	System.out.println("Thank You");
	System.out.println("---------------------------------");
	pressEnter();
}

public void tambah(){
	try{
		String temp="";
		System.out.print("Tambah Saldo 			: ");
		tambah = Double.parseDouble(inp.readLine());
	System.out.println("Saldo awal			: "+awal);
	this.sekarang = this.awal + tambah;
	System.out.println("Saldo tambahan			: "+tambah);
	System.out.println("Saldo sekarang			: "+sekarang);
	pressEnter();
}
	catch (Exception e){
		System.out.println();
	}
}
public void ambil(){
	try{
		String temp="";
	System.out.println("Saldo sekarang			: "+sekarang);
		System.out.print("Tarik Saldo 			: ");
		ambil = Double.parseDouble(inp.readLine());
	this.sekarang = this.sekarang - ambil;
	pressEnter();
}
	catch (Exception e){
		System.out.println();
	}
}


void pressEnter(){
	try{
	System.out.println("Press enter");
	inp.readLine();
}
	catch (Exception e){
		System.out.println(e);
	}
 }
}