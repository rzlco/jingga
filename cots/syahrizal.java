import java.io.*;

class syahrizal{
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isr);
	
	public static void main(String[]args){
		syahrizal a = new syahrizal();
		
		a.menu();
		
	}
	
	//variabel sewa
	String nama, kodeKendaraan, namaKendaraan, jenisPembayaran;
	int jamBer, menBer, jamKem, menKem;
	double harga, disc, bayar;
	
	//variabel fibonacci
	int aFib, angkaAwalFib, hasil=0, deret, whileFib, pilih;
	
	//variabel prima
	int deretPrim;
	
	//variabel x
	int sisi;
	
	void menu(){
		
		int pilih=0;
		boolean yes = true;
		
		try{
			
			do{
			
			System.out.println();
			System.out.println("Nama  : Syahrizal Hanif");
			System.out.println("NIM   : 6701184059");
			System.out.println("Kelas : D3MI-42-03");
			System.out.println();
			System.out.println("1. Program Sewa Motor");
			System.out.println("2. Program Daftar Bilangan Prima");
			System.out.println("3. Program Fibonacci");
			System.out.println("4. Program Nazi");
			System.out.println("5. Program X");
			System.out.println("6. Keluar");
			System.out.println();
			System.out.print("Masukkan Pilihan : ");
            pilih = Integer.parseInt(in.readLine());
			System.out.println();
			
			switch (pilih){
                case 1:
					sewaMenu();
                    break;
				case 2:
                    prima();
                    break;
                case 3:
                    fibonacci();
                    break;
				case 4:
                    nazi();
                    break;
				case 5:
                    x();
                    break;
                case 6:
                    yes = false;
                    System.out.println("Keluar");
            }
			
			}while(pilih != 6);
			
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void sewaMenu(){
		
		int pilih=0;
		boolean yes = true;
		
		try{
			
			do{
		
			System.out.println("Program Sewa Motor");
			System.out.println("1. Sewa Motor");
			System.out.println("2. Lihat Data");
			System.out.println("3. Keluar");
			System.out.println();
			System.out.print("Masukkan Pilihan : ");
            pilih = Integer.parseInt(in.readLine());
			System.out.println();
			
			switch (pilih){
                case 1:
					sewa();
                    break;
				case 2:
                    lihatSewa();
                    break;
                case 3:
                    yes = false;
                    System.out.println("Keluar");
            }
			
			}while(pilih != 3);
			
		}
			
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void sewa(){
		
		try{
			
			System.out.println("M01 | Motor Sport | 5000");
			System.out.println("M02 | Motor Bebek | 4600");
			System.out.println("M03 | Motor Matic | 3500");
			System.out.println();
		
			System.out.print("Masukkan Nama    : ");
			nama = in.readLine();
			System.out.print("Kode Kendaraan   : ");
			kodeKendaraan = in.readLine();
			System.out.print("Jam Berangkat    : ");
			jamBer = Integer.parseInt(in.readLine());
			System.out.print("Menit Berangkat  : ");
			menBer = Integer.parseInt(in.readLine());
			System.out.print("Jam Kembali      : ");
			jamKem = Integer.parseInt(in.readLine());
			System.out.print("Menit Kembali    : ");
			menKem = Integer.parseInt(in.readLine());
			System.out.print("Jenis Pembayaran : ");
			jenisPembayaran = in.readLine();
			System.out.println();
			
			switch(kodeKendaraan){
			
			case "M01":
				namaKendaraan = "Motor Sport";
				harga = 5000*((jamKem+menKem)-(jamBer+menBer));
					
					if ((harga<15000)){
						disc = 0;
					}
					else if (harga>25000){
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
				
					if ((harga<15000)){
						disc = 0;
					}
					else if (harga>25000){
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
					
					if ((harga<15000)){
						disc = 0;
					}
					else if (harga>25000){
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
			
			}
			
		}
			
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void lihatSewa(){
		
		double ovo = 1000;
		double gopay = 5000;
		
		if (jenisPembayaran.equalsIgnoreCase("Ovo")){
			
			System.out.println("Nama             : "+ nama);
			System.out.println("Kode Kendaraan   : "+ kodeKendaraan);
			System.out.println("Nama Kendaraan   : "+ namaKendaraan);
			System.out.println("Jam Sewa         : " +jamBer +":"+menBer +" - "+jamKem +":"+menKem);
			System.out.println("Jenis Pembayaran : " +jenisPembayaran);
			System.out.println("Total Bayar      : "+ ovo);
			System.out.println();
		
		}
		else if (jenisPembayaran.equalsIgnoreCase("Go-pay")){
			
			System.out.println("Nama             : "+ nama);
			System.out.println("Kode Kendaraan   : "+ kodeKendaraan);
			System.out.println("Nama Kendaraan   : "+ namaKendaraan);
			System.out.println("Jam Sewa         : " +jamBer +":"+menBer +" - "+jamKem +":"+menKem);
			System.out.println("Jenis Pembayaran : " +jenisPembayaran);
			System.out.println("Total Bayar      : "+ gopay);
			System.out.println();
		
		}
		else if (jenisPembayaran.equalsIgnoreCase("Gopay")){
			
			System.out.println("Nama             : "+ nama);
			System.out.println("Kode Kendaraan   : "+ kodeKendaraan);
			System.out.println("Nama Kendaraan   : "+ namaKendaraan);
			System.out.println("Jam Sewa         : " +jamBer +":"+menBer +" - "+jamKem +":"+menKem);
			System.out.println("Jenis Pembayaran : " +jenisPembayaran);
			System.out.println("Total Bayar      : "+ gopay);
			System.out.println();
		
		}
		else{
			
			System.out.println("Nama             : "+ nama);
			System.out.println("Kode Kendaraan   : "+ kodeKendaraan);
			System.out.println("Nama Kendaraan   : "+ namaKendaraan);
			System.out.println("Jam Sewa         : " +jamBer +":"+menBer +" - "+jamKem +":"+menKem);
			System.out.println("Jenis Pembayaran : " +jenisPembayaran);
			System.out.println("Total Bayar      : "+ bayar);
			System.out.println("Diskon           : "+ disc);
			System.out.println();
		
		}
	
	}
	
	void fibonacci(){
		
		int pilih=0;
		boolean yes = true;
		
		try{
			
			do{
			
			System.out.println();
			System.out.println("1. Jumlah Deret");
			System.out.println("2. Angka Awal");
			System.out.println("3. Lihat Data");
			System.out.println("4. Keluar");
			System.out.println();
			System.out.print("Masukkan Pilihan : ");
            pilih = Integer.parseInt(in.readLine());
			System.out.println();
			
			switch (pilih){
                case 1:
					fibDeret();
                    break;
				case 2:
                    fibAwal();
                    break;
                case 3:
                    fibLihat();
                    break;
                case 4:
                    yes = false;
                    System.out.println("Keluar");
            }
			
			}while(pilih != 4);
				
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void fibDeret(){
		
		try{
			
			System.out.print ("Masukan deret fibonacci  : ");
			deret = Integer.parseInt(in.readLine());
			
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void fibAwal(){
		
		try{
			
			System.out.print ("Masukan angka awal  : ");
			angkaAwalFib = Integer.parseInt(in.readLine());
		
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void fibLihat(){
		
		try{
			
			while(whileFib<=deret){            
					
			aFib=angkaAwalFib;
			angkaAwalFib=hasil;
			System.out.print(hasil+" ");
			System.out.println();
			hasil=aFib+angkaAwalFib;
			whileFib++;
				
			}
		
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void prima(){
		
		int pilih=0;
		boolean yes = true;
		
		try{
			
			do{
			
			System.out.println();
			System.out.println("1. Jumlah Angka");
			System.out.println("2. Lihat Data");
			System.out.println("3. Keluar");
			System.out.println();
			System.out.print("Masukkan Pilihan : ");
            pilih = Integer.parseInt(in.readLine());
			System.out.println();
			
			switch (pilih){
                case 1:
					primDeret();
                    break;
				case 2:
                    primLihat();
                    break;
                case 3:
                    yes = false;
                    System.out.println("Keluar");
            }
			
			}while(pilih != 3);
				
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void primDeret(){
		
		try{
			
			System.out.print ("Masukan deret angka  : ");
			deretPrim = Integer.parseInt(in.readLine());
			
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void primLihat(){
		
		try{
			
			for (int i = 2; i < deretPrim; i++){
			boolean isPrima = true;
			
				for (int j = 2; j < i; j++){
					if(i%j == 0){
						isPrima = false;
						break;
					}
				}
	
			if(isPrima == true){
			System.out.println(i+" = Prima");
			}
			else{
			System.out.println(i+" = bukan Prima");
			}
			}
			
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
	
	void nazi(){
		
		int x,y;
		
		for( x = 1;
					x <= 7;
					x++){
						
						for( y =1;
									y <= 7;
									y++){
										
										if( x == 4 && y == 2 || x == 4 && y == 3 || x == 4 && y == 4 || y == 4 || x == 1 && y == 5
											|| x == 1 && y == 6 || x == 1 && y == 7 || x == 4 && y == 5 || x == 4 && y == 6 || x == 4 && y == 7
											|| x == 7 && y == 1 || x == 7 && y == 2 || x == 7 && y == 3 || x == 4 && y == 1 || x== 2 && y ==1
											|| x== 1 && y ==1 || x== 3 && y ==1 || x== 5 && y ==7 || x== 6 && y ==7 || x== 7 && y ==7){
											
											System.out.print(" *");
											
										}
										else{
											
											System.out.print("  ");
											
										}
										
									}
										
						
						
						System.out.println();
					}
						
	}
	
	void x(){
		
		try{
		
		System.out.print ("Jumlah : ");
		sisi = Integer.parseInt(in.readLine());
		
		char cetak [] [] = new char [sisi][sisi];

		for (int b=0;b<sisi;b++)
		{
			for(int k=0;k<sisi;k++)
			{
				if ( b == k||b+k == sisi -1)
				{
					cetak[b] [k] = '*';
				}
				else
				{
					cetak[b] [k] =' ';
				}
				System.out.print (cetak [b] [k]);
			}
			System.out.println ();
		}
		
		}
		
		catch (Exception e) {
            
		System.out.println(e);
			
		}
		
	}
}