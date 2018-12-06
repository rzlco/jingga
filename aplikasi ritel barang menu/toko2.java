import java.util.Scanner;

class toko{
	
	private String namaBarang;
	private String namaToko;
	private int jumlahBarang;
	private double hargaTotal;
	private double hargaTotalJual;
	private double hargaSatuan;
	private int pilihan;
	private int total;
	
	Scanner inp = new Scanner(System.in);
	
	public static void main(String[] xyz){
	toko nmk = new toko();
	nmk.menu();
	}
void menu(){
	System.out.println("Aplikasi Ritel Makanan");
	System.out.println("Menu");
	System.out.println("1. Penambahan Barang");
	System.out.println("2. Penjualan Barang");
	System.out.println("3. Pembelian Barang");
	System.out.println("4. Tampilkan Data");
	System.out.println("5. Keluar");
	System.out.println("");
	System.out.print("Masukkan pilihan anda 1-5 :");
	pilihan = inp.nextInt();
	
	switch (pilihan){
		case 1 :
			TambahBarang();
		case 2 :
			PenjualanBarang();
		case 3 :
			PembelianBarang();
		case 4 :
			dataBarang();
			break;
		case 5 :
			System.out.println("Keluar");
			break;
}
}


void TambahBarang(){
	System.out.println("");
	System.out.println("Tambah Stok Barang");
	System.out.println("");
	System.out.print("Nama Toko : "); 
	this.namaToko = inp.next();
	System.out.print("Nama barang : "); 
	this.namaBarang = inp.next();
	System.out.print("Harga Satuan : "); 
	hargaSatuan = inp.nextInt();
	System.out.print("Jumlah barang : "); 
	jumlahBarang = inp.nextInt();
	hargaTotal = hitungHargaTotal(hargaSatuan,jumlahBarang);
	System.out.print("Harga total : "+hargaTotal);
}

	double hitungHargaTotal(double hs, int jb){
	double hargaTotal = (hs*jb);
	return hargaTotal;
}
	
	//pembatas
	void PenjualanBarang(){
	System.out.println("");
	System.out.println("");
	System.out.println("Penjualan Barang");
	System.out.println("");
	System.out.println("Nama barang : "+this.namaBarang);
	System.out.println("Jumlah barang : "+this.jumlahBarang);
	System.out.print("Total : "); 
	total = inp.nextInt();
	hargaTotalJual = hitungHargaJual(hargaSatuan,total);
	System.out.print("Harga total : "+hargaTotalJual);
}
	double hitungHargaJual(double hs, int tt){
	double hargaTotalJual = (hs*tt);
	return hargaTotalJual;
}

//pembatas
	void PembelianBarang(){
	int jml_stock;
	System.out.println("");
	System.out.println("");
	System.out.println("Pembelian Barang");
	System.out.println("");
	System.out.println("Nama barang : "+this.namaBarang);
	System.out.print("Jumlah Stock : "); 
	jml_stock = inp.nextInt();
	hargaTotal = hitungHargaBeli(hargaSatuan,jml_stock);
	System.out.print("Harga total : "+hargaTotal);
}
	double hitungHargaBeli(double hs, int st){
	double hargaTotal = (hs*st);
	return hargaTotal;
}
	
	//pembatas
	void dataBarang(){
	System.out.println("");
	System.out.println("");
	System.out.println("Keterangan Stok");
	System.out.println("Toko "+namaToko);
	System.out.println("Nama Barang : " + this.namaBarang);
	System.out.println("Stok Terjual : "+ total);
	System.out.println("Total hasil Penjual :"+hargaTotalJual);
}

}