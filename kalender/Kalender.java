import java.util.Scanner;
public class Kalender{
	String bulan;
public static void main(String[] asd){
	Kalender hn = new Kalender();
	hn.runThis();
}
Scanner input = new Scanner(System.in);
void runThis(){
	System.out.print("Masukkan Tanggal : ");
	int tanggal = input.nextInt();
	System.out.print("Masukkan Bulan : ");
	int nilai = input.nextInt();
	System.out.print("Masukkan Tahun : ");
	int tahun = input.nextInt();
	if (nilai==1){
		bulan="January";
	}
	else if (nilai==2){
		bulan="February";
	}
	else if (nilai==3){
		bulan="Maret";
	}
	else if (nilai==4){
		bulan="April";
	}
	else if (nilai==5){
		bulan="Mei";
	}
	else if (nilai==6){
		bulan="Juni";
	}
	else if (nilai==7){
		bulan="Juli";
	}
	else if (nilai==8){
		bulan="Agustus";
	}
	else if (nilai==9){
		bulan="September";
	}
	else if (nilai==10){
		bulan="Oktober";
	}
	else if (nilai==11){
		bulan="November";
	}
	else if (nilai==12){
		bulan="Desember";
	}
	else{
		System.out.print("Inputan salah");
	}
	System.out.print("Tanggal "+tanggal +", bulan ="+bulan +", tahun =" +tahun); 
}
}