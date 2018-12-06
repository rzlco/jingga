import java.io.*;
//syahrizal hanif 6701184059
class syahrizal{
	
	String nama, kodeKendaraan, namaKendaraan, jenisPembayaran;
	int jamBer, menBer, jamKem, menKem;
	double harga, disc, bayar;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isr);
	
	public static void main(String[]args){
		syahrizal sewa = new syahrizal();
		
		sewa.runThis();
		sewa.hitung();
		sewa.cetak();
		sewa.lagi();
		
	}
	
	void runThis(){
		
		System.out.println();
		System.out.println("M01 | Motor Sport | 5000");
		System.out.println("M02 | Motor Bebek | 4600");
		System.out.println("M03 | Motor Matic | 3500");
		System.out.println("M04 | Mobil Sedan | 12000");
		System.out.println("M05 | Mobil Avanza| 15000");
		
		try{
			
			System.out.println();
			System.out.print("Masukkan Nama		: ");
			nama = in.readLine();
			System.out.print("Kode Kendaraan 		: ");
			kodeKendaraan = in.readLine();
			System.out.print("Jam Berangkat		: ");
			jamBer = Integer.parseInt(in.readLine());
			System.out.print("Menit Berangkat 	: ");
			menBer = Integer.parseInt(in.readLine());
			System.out.print("Jam Kembali		: ");
			jamKem = Integer.parseInt(in.readLine());
			System.out.print("Menit Kembali		: ");
			menKem = Integer.parseInt(in.readLine());
			System.out.print("Jenis Pembayaran	: ");
			jenisPembayaran = in.readLine();
			
		}
		
		catch(Exception e){
		
		}
		
	}
	
	void hitung(){
		
		switch(kodeKendaraan){
			
			case "M01":
				namaKendaraan = "Motor Sport";
				harga = 5000*((jamKem+menKem)-(jamBer+menBer));
					if (harga>25000){
						disc = harga*0.1;
					}
					else if ((harga>15000)&&(harga<25000)){
						disc = harga*0.05;
					}
					else{
						disc = harga;
					}
					bayar = harga-disc;
			break;
			
			case "M02":
				namaKendaraan = "Motor Bebek";
				harga = 4600*((jamKem+menKem)-(jamBer+menBer));
					if (harga>25000){
						disc = harga*0.1;
					}
					else if ((harga>15000)&&(harga<25000)){
						disc = harga*0.05;
					}
					else{
						disc = harga;
					}
					bayar = harga-disc;
			break;
			
			case "M03":
				namaKendaraan = "Motor Matic";
				harga = 35000*((jamKem+menKem)-(jamBer+menBer));
					if (harga>25000){
						disc = harga*0.1;
					}
					else if ((harga>15000)&&(harga<25000)){
						disc = harga*0.05;
					}
					else{
						disc = harga;
					}
					bayar = harga-disc;
			break;
			
			case "M04":
				namaKendaraan = "Mobil Sedan";
				harga = 12000*((jamKem+menKem)-(jamBer+menBer));
					if (harga>25000){
						disc = harga*0.1;
					}
					else if ((harga>15000)&&(harga<25000)){
						disc = harga*0.05;
					}
					else{
						disc = harga;
					}
					bayar = harga-disc;
			break;
			
			case "M05":
				namaKendaraan = "Mobil Avanza";
				harga = 15000*((jamKem+menKem)-(jamBer+menBer));
					if (harga>25000){
						disc = harga*0.1;
					}
					else if ((harga>15000)&&(harga<25000)){
						disc = harga*0.05;
					}
					else{
						disc = harga;
					}
					bayar = harga-disc;
			break;
			
			default:
				System.out.println("404");
			break;
			
		}
	}
	
	void cetak(){
		
		double ovo = 1000;
		double gopay = 5000;
		
		if (jenisPembayaran.equalsIgnoreCase("Ovo")){
			
			System.out.println();
			System.out.println("Terima kasih "+nama +". Anda telah menyewa "+namaKendaraan +" dari pukul "+jamBer +":"+menBer +" - "+jamKem +":"+menKem +
			" dengan pembayaran "+jenisPembayaran +" dan total biaya sewa "+ovo);
			System.out.println();
		
		}
		else if (jenisPembayaran.equalsIgnoreCase("Go-pay")){
			
			System.out.println();
			System.out.println("Terima kasih "+nama +". Anda telah menyewa "+namaKendaraan +" dari pukul "+jamBer +":"+menBer +" - "+jamKem +":"+menKem +
			" dengan pembayaran "+jenisPembayaran +" dan total biaya sewa "+gopay);
			System.out.println();
		
		}
		else if (jenisPembayaran.equalsIgnoreCase("Gopay")){
			
			System.out.println();
			System.out.println("Terima kasih "+nama +". Anda telah menyewa "+namaKendaraan +" dari pukul "+jamBer +":"+menBer +" - "+jamKem +":"+menKem +
			" dengan pembayaran "+jenisPembayaran +" dan total biaya sewa "+gopay);
			System.out.println();
		
		}
		else{
			
			System.out.println();
			System.out.println("Terima kasih "+nama +". Anda telah menyewa "+namaKendaraan +" dari pukul "+jamBer +":"+menBer +" - "+jamKem +":"+menKem +
			" dengan pembayaran "+jenisPembayaran +" dan total biaya sewa "+bayar);
			System.out.println();
		
		}
	
	}
	
	void lagi(){
		
		try{
		
		String anyar;
			System.out.print("Transaksi Lagi ? [y/n] : ");
				anyar = in.readLine();
			System.out.println("");
			
				if (anyar.equalsIgnoreCase("y")){
				runThis();
				hitung();
				cetak();
				lagi();
				} 
				else if(anyar.equalsIgnoreCase("n")){
				System.out.println("Keluar");
				
				}
		
		}
		
		catch(Exception e){
		
		}


}

}