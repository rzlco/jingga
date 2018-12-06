import java.util.Scanner;
class Kalender2{

Scanner input = new Scanner(System.in);
public static void main (String[] asd){

	Kalender2 ia = new Kalender2();
	ia.runThis();
	
}
void runThis(){
int hari=0;
int tanggal=0;
int bulan=0;
int tahun=0;

	System.out.print("Masukkan tanggal : ");
	tanggal = input.nextInt();
	System.out.print("Masukkan bulan : ");
	int angka = input.nextInt();
	System.out.print("Masukkan tahun : ");
	tahun = input.nextInt();
	if(angka==1){
	bulan	=1;
	hari= 31;
	}
	else if((angka==2)&&((tahun%4)==0)){
	bulan=2;
	hari=29;
	}
	else if((angka==2)){
	bulan=2;
	hari=28;
	}
	else if(angka==3){
	bulan=3;
	hari= 31;
	}
	else if(angka==4){
	bulan=4;
	hari= 30;
	}
	else if(angka==5){
	bulan=5;
	hari= 31;
	}
	else if(angka==6){
	bulan=6;
	hari= 30;
	}
	else if(angka==7){
	bulan=7;
	hari= 31;
	}
	else if(angka==8){
	bulan=8;
	hari= 31;
	}
	else if(angka==9){
	bulan=9;
	hari= 30;
	}
	else if(angka==10){
	bulan=10;
	hari= 31;
	}
	else if(angka==11){
	bulan=11;
	hari= 30;
	}
	else if(angka==12){
	bulan=12;
	hari= 31;
	}
	else{
	bulan=0;
	}

	System.out.print("tanggal = "+tanggal);
	System.out.print("\nbulan = "+bulan);
	System.out.print("\ntahun = "+tahun);
	System.out.print("\nJadi, bulan "+bulan+" ada "+hari+" hari");

	System.out.print("\nMasukkan angka : ");
	int tambah = input.nextInt();
	int hasil =tambah+tanggal;
	if(hasil<=hari){
	hasil=tambah+tanggal;
	angka=angka;
	tahun=tahun;
	}
	else {
		hasil=hasil-hari;
		angka=angka+1;
		tahun=tahun;
	}
	System.out.print("\nTanggal sekarang adalah : "+hasil+" "+angka+" "+tahun);
	}


}

