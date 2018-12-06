import java.util.Scanner;

class rekening{
	String nama, rek;
	double saldo,awal,tambah,tarik;
	int kel=0;

Scanner inp = new Scanner(System.in);

public void getNama(){
		System.out.print("Nama 					: ");
		
		nama = inp.next();
}

public void getNoRek(){
		System.out.print("No Rekening 				: ");
		
		rek = inp.next();

}

public void setJenisKel(){
		System.out.print("Jenis Kelamin 				: ");
		kel = inp.nextInt();
}
public int getJenisKel(){
		if(this.kel==1){
		System.out.println("");	
		System.out.println("Jenis Kelamin				: Laki-Laki");
	} 
	else if(this.kel==2){
		System.out.println("");
		System.out.println("Jenis Kelamin				: Perempuan");
	}
	else{
		System.out.println("");
		System.out.println("Jenis Kelamin				: Tidak ditentukkan");
	}
		return kel;
}

public void setSaldo(){
		System.out.print("Saldo 					: ");
		awal = inp.nextDouble();
}
public void getSaldo(){
		this.awal = this.awal;
}

public void tabung(){
		System.out.print("Tabung 					: ");
		tambah = inp.nextDouble();
		this.saldo = this.awal + tambah;
}

public void lihat(){
	System.out.println("");
	System.out.println("Nama					: "+nama);
	System.out.println("No Rekening				: "+rek);
	System.out.println("Saldo Awal				: "+awal);
	System.out.println("Tabung					: "+tambah);
	System.out.println("Tarik					: "+tarik);
	System.out.println("Cek Saldo				: "+saldo);
	System.out.println("=============================");
}

public void tarik(){
		System.out.print("Tarik 					: ");
		tarik = inp.nextDouble();
	this.saldo = this.saldo - tarik;
}

}