import java.io.BufferedReader;
import java.io.InputStreamReader;

class barang{
	String kode;
	String nama;
	int stock;
	int hargaJual;

InputStreamReader isr = new InputStreamReader(System.in);	
BufferedReader inp = new BufferedReader(isr);


public void inputData(){
	try{
		String temp="";
		System.out.println("Menu Input Data Barang ");
		System.out.print("Kode				: ");
		kode = inp.readLine();
		System.out.print("Nama				: ");
		nama = inp.readLine();
		System.out.print("Stock Awal			: ");
		temp = inp.readLine();
		stock = Integer.parseInt(temp);
		System.out.print("Harga Jual				: ");
		temp = inp.readLine();
		hargaJual = Integer.parseInt(temp);
		pressEnter();
	}
	catch (Exception e){
		System.out.println(e);
	}
}

public void viewData(){
	System.out.println("Menampilkan detail barang");
	System.out.println("Nama	:"+nama);
	System.out.println("Kode	:"+kode);
	System.out.println("Jumlah Stock	:"+stock);
	System.out.println("Harga Jual	:"+hargaJual);
	pressEnter();
}

public void jualStock(int ubah){
	System.out.println("Menu Penjualan Barang");
	System.out.println("Stock awal	:"+stock);
	this.stock = this.stock - ubah;
	System.out.println("Pengurangan	:"+ubah);
	System.out.println("Stock Akhir	:"+stock);
	System.out.println("Data telah diubah");
	pressEnter();
}

void pressEnter(){
	try{
	System.out.println("Tekan enter untuk melanjutkan");
	inp.readLine();
	}
	catch (Exception e){
		System.out.println(e);
	}
}
}
