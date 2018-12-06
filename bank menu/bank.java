import java.util.Scanner;

class Bank{
	
	int noRekening = 12345;
	double saldoAwal = 500000, sisaSaldo1, sisaSaldo2, jumlahUang, transferUang; 
	int pin = 6690, rekTujuan;
	int pilih;
	String nama = "Rizal";
	String atm = "BRI";
	
	Scanner input = new Scanner(System.in);
	
public static void main(String[] args){
	Bank abc = new Bank();
	abc.runThis();
}

void runThis(){
	System.out.print("Masukkan PIN: ");
	pin = input.nextInt();
	if (pin != 6690){
		System.out.println("PIN Salah");
	}
	else{
		System.out.println("Menu :");
		System.out.println("1. Info");
		System.out.println("2. Transfer");
		System.out.println("3. Tarik");
		System.out.println("4. Keluar");
		System.out.print("Pilih 1-4 : ");
		pilih = input.nextInt();
	}
	switch (pilih){
		case 1:
		info();
		lagi();
		break;
		case 2:
		transfer();
		lagi();
		break;
		case 3:
		tarik();
		lagi();
		break;
		case 4:
		System.out.println("Silahkan ambil kartu anda");
		break;
	}
}

void info(){
	System.out.println("Info");
	System.out.println("");
	System.out.println("Nama 	:"+nama);
	System.out.println("Nomor	:"+noRekening);
	System.out.println("Jenis	:"+atm);
	System.out.println("Saldo	:"+saldoAwal);
	System.out.println("");
}

void transfer(){
	System.out.println("Transfer");
	System.out.print("Masukkan Rekening	:");
	rekTujuan = input.nextInt();
	System.out.print("Jumlah Transfer		:");
	transferUang = input.nextDouble();
	if (transferUang <= saldoAwal){
		sisaSaldo1 = saldoAwal - transferUang;
		System.out.println("Sisa saldo		:"+sisaSaldo1);
	}
	else{
		System.out.println("Saldo tidak cukup");
	}
}

void tarik(){
	System.out.println("Tarik");
	System.out.println("");
	System.out.print("Masukkan jumlah		:");
	jumlahUang = input.nextDouble();
	if (jumlahUang <= saldoAwal){
		sisaSaldo2 = sisaSaldo1 - transferUang;
		System.out.println("Sisa saldo		:"+sisaSaldo2);
	}
	else{
		System.out.println("Saldo tidak cukup");
	}
}

void lagi(){
	String warn;
	System.out.print("Transaksi Lagi ? [y/n] : ");
	warn = input.next();
	System.out.println("");
	if (warn.equalsIgnoreCase("y")){
		runThis();
	} 
	else if(warn.equalsIgnoreCase("n")){
	System.out.println("Silahkan ambil kartu anda");
	}
}
}
	