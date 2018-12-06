import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class penjara {
	
	ArrayList<dataDiri> dataD ;
	ArrayList<riwayatKejahatan> dataJ ;
	ArrayList<riwayatKesehatan> dataS ;
	ArrayList<dataKeluarga> dataK ;
	ArrayList<dataKepenjaraan> dataL ;
	
	InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);
	
	InputData input = new InputData();
	
	int a=0;
	int i=0;
	int pilihinput;
	String residivis;
	String sakitSebelumnya;
	String isiKejahatan;
	String isiKesehatan;
	
	String namaPelaku;
    String tglPelaku;
    String tmptPelaku;
    String jenisKel;
    String golDar;
    String tinggi;
    String berat;
    String warnaKul;
    String jenisRamb;
    String ciriFis;
    String alamat;
	String cariNama;
	
	int tekanan;
	int gula;
	int detak;
	int hemo;
	String penyakitpilih;
	String penyakitpilih2;
	String penyakitpilih3;
	String penyakitpilih4;
	String saranpilih;
	String saranpilih2;
	String saranpilih3;
	String saranpilih4;
	
	String namaBapak;
	String namaIbu;
	String namaKakak;
	String namaAdik;
	String kelPilih;
	int jmlKakak;
	int jmlAdik;
	
	String lapas;
	String sel;
	String viewLapas;
	
	int indeks;
	
	public static void main(String[] args) {
        penjara a = new penjara();
		
		a.runThis();
		
    }
	
    void runThis(){
		try {
		
        int pilihan=0;
        boolean y = true;
		do{
            System.out.println("                Program Penjara                 ");
            System.out.println("======================================================");
            System.out.println("1.    Tambah Data");
            System.out.println("2.    Ubah Data");
            System.out.println("3.    Lihat Data");
            System.out.println("4.    Keluar");
            System.out.println("======================================================");
            System.out.print("Masukkan Pilihan    :   ");
            pilihan = Integer.parseInt(in.readLine());
			
            switch (pilihan){
                case 1:
					input();
                    break;
				case 2:
                    edit();
                    break;
                case 3:
                    cetak();
                    break;
                case 4:
                    y = false;
                    System.out.println("======================================================");
                    System.out.println("Terimakasih Telah Menggunakan Program ini !!!");
                    System.out.println("======================================================");
            }
			
		}while(pilihan != 4);	
		}	catch (Exception e) {
            
			System.out.println(e);
			
			}
	}
	
	void input(){
		try {
		
					System.out.println("======================================================");
					System.out.println("Data Diri ");
					System.out.println("======================================================");
						
						System.out.print("Masukkan No Narapidana    :  ");
                        indeks = Integer.parseInt(in.readLine());
                        System.out.print("Masukkan Nama             :  ");
                        namaPelaku = in.readLine();
                        System.out.print("Masukkan Tanggal Lahir    :  ");
                        tglPelaku = in.readLine();
                        System.out.print("Masukkan Tempat Lahir     :  ");
                        tmptPelaku = in.readLine();
                        System.out.print("Masukkan Jenis Kelamin    :  ");
                        jenisKel = in.readLine();
						System.out.print("Masukkan Golongan Darah   :  ");
                        golDar = in.readLine();
						System.out.print("Masukkan Tinggi Badan     :  ");
                        tinggi = in.readLine();
						System.out.print("Masukkan Berat Badan      :  ");
                        berat = in.readLine();
						System.out.print("Masukkan Warna Kulit      :  ");
                        warnaKul = in.readLine();
						System.out.print("Masukkan Jenis Rambut     :  ");
                        jenisRamb = in.readLine();
						System.out.print("Masukkan Ciri Fisik       :  ");
                        ciriFis = in.readLine();
                        System.out.print("Masukkan Alamat           :  ");
                        alamat = in.readLine();
                        System.out.println("======================================================");
						
						input.insertData(namaPelaku, tglPelaku, tmptPelaku, jenisKel, golDar, tinggi, berat, warnaKul, jenisRamb, ciriFis, alamat);
						
					System.out.println("======================================================");
					System.out.println("Riwayat Kejahatan ");
					System.out.println("======================================================");
					
					System.out.println("======================================================");
					System.out.print("Apakah napi merupakan residivis ? (yes/no) :   ");
					residivis = in.readLine();
					System.out.println("======================================================");
		
					if(residivis.equalsIgnoreCase("yes")){
						
						System.out.print("Jumlah riwayat kejahatan sebelumnya : ");
						int jmlKejahatan = Integer.parseInt(in.readLine());
						if (jmlKejahatan > 1){
							
							for(i = 0; i<jmlKejahatan; i++){
								
								System.out.println("Kejahatan - "+(i+1));
								System.out.print("Riwayat Kejahatan             :  ");
								isiKejahatan = in.readLine();
							}
							
						}
						else{
							
							System.out.print("Riwayat Kejahatan             :  ");
							isiKejahatan = in.readLine();
							
						}
						
					}
					else{
						
						System.out.print("Riwayat Kejahatan             :  ");
						isiKejahatan = in.readLine();
						
					}
					
					input.insertData2(isiKejahatan);
					
					System.out.println("======================================================");
					System.out.println("Riwayat Kesehatan ");
					System.out.println("======================================================");
					
					System.out.println("======================================================");
					System.out.print("Apakah napi memiliki riwayat penyakit sebelumnya (yes/no) :   ");
					sakitSebelumnya = in.readLine();
					System.out.println("======================================================");
		
					if(sakitSebelumnya.equalsIgnoreCase("yes")){
						
						System.out.print("Jumlah riwayat penyakit sebelumnya : ");
						int jmlKesehatan = Integer.parseInt(in.readLine());
						if (jmlKesehatan > 1){
							
							for(i = 0; i<jmlKesehatan; i++){
								
								System.out.println("Penyakit - "+(i+1));
								System.out.print("Riwayat Penyakit             :  ");
								isiKesehatan = in.readLine();
							}
							
						}
						else{
							
							System.out.print("Riwayat Penyakit             :  ");
							isiKesehatan = in.readLine();
							
						}
						
					}
					else{
						
						System.out.print("");
						
					}				
					
					input.insertData3(isiKesehatan);
					
					System.out.println("======================================================");
					System.out.println("Data Keluarga ");
					System.out.println("======================================================");
					
                        System.out.print("Nama Bapak                :  ");
                        namaBapak = in.readLine();
						System.out.print("Nama Ibu                  :  ");
                        namaIbu = in.readLine();
						
								System.out.print("Apakah narapidana memiliki kakak ? (yes/no) : ");
								saranpilih2 = in.readLine();
								
								if(saranpilih2.equalsIgnoreCase("yes")){
									
									System.out.print("Jumlah kakak : ");
									jmlKakak = Integer.parseInt(in.readLine());
									if (jmlKakak > 1){
							
									for(i = 0; i<jmlKakak; i++){
								
									System.out.println("Kakak - "+(i+1));
									System.out.print("Nama Kakak                 :  ");
									namaKakak = in.readLine();
									}
							
									}
									
								else{
									
									System.out.print("Nama Kakak                 :  ");
									namaKakak = in.readLine();
									
								}
									
								}
								else{
									
									System.out.print("");
									
								}
								
								System.out.print("Apakah narapidana memiliki adik ? (yes/no) : ");
								saranpilih3 = in.readLine();
								
								if(saranpilih3.equalsIgnoreCase("yes")){
									
									System.out.print("Jumlah adik : ");
									jmlAdik = Integer.parseInt(in.readLine());
									if (jmlAdik > 1){
							
									for(i = 0; i<jmlAdik; i++){
								
									System.out.println("Adik - "+(i+1));
									System.out.print("Nama Adik                 :  ");
									namaAdik = in.readLine();
									}
							
									}
									
								else{
									
									System.out.print("Nama Adik                 :  ");
									namaAdik = in.readLine();
									
								}
									
								}
								else{
									
									System.out.print("");
									
								}
						
                        System.out.println("======================================================");
						
						input.insertData4(namaBapak,namaIbu,namaKakak,namaAdik);
						
					System.out.println("======================================================");
					System.out.println("Data Kepenjaraan ");
					System.out.println("======================================================");
					
						System.out.print("Lapas                :  ");
                        lapas = in.readLine();
						System.out.print("Sel Nomer            :  ");
                        sel = in.readLine();
						
						input.insertData5(lapas,sel);
		//runThis();
	
		}	catch (Exception e) {
            
			System.out.println(e);
			
			}
		
	}
	
	void edit(){
		try{
		
		System.out.println("======================================================");
        System.out.print("Ubah data berdasarkan nama    :   ");
        cariNama = in.readLine();
		System.out.print("Masukkan No Narapidana   		:   ");
        indeks = Integer.parseInt(in.readLine());
        System.out.println("======================================================");
        
		boolean retval = namaPelaku.contains(cariNama);
		
		if (retval == true){
			
					System.out.println("======================================================");
					System.out.println("Data Diri ");
					System.out.println("======================================================");
					
                        System.out.print("Masukkan Nama             :  ");
                        namaPelaku = in.readLine();
                        System.out.print("Masukkan Tanggal Lahir    :  ");
                        tglPelaku = in.readLine();
                        System.out.print("Masukkan Tempat Lahir     :  ");
                        tmptPelaku = in.readLine();
                        System.out.print("Masukkan Jenis Kelamin    :  ");
                        jenisKel = in.readLine();
						System.out.print("Masukkan Golongan Darah   :  ");
                        golDar = in.readLine();
						System.out.print("Masukkan Tinggi Badan     :  ");
                        tinggi = in.readLine();
						System.out.print("Masukkan Berat Badan      :  ");
                        berat = in.readLine();
						System.out.print("Masukkan Warna Kulit      :  ");
                        warnaKul = in.readLine();
						System.out.print("Masukkan Jenis Rambut     :  ");
                        jenisRamb = in.readLine();
						System.out.print("Masukkan Ciri Fisik       :  ");
                        ciriFis = in.readLine();
                        System.out.print("Masukkan Alamat           :  ");
                        alamat = in.readLine();
                        System.out.println("======================================================");
						
					System.out.println("======================================================");
					System.out.println("Riwayat Kejahatan ");
					System.out.println("======================================================");
					
					System.out.println("======================================================");
					System.out.print("Apakah napi merupakan residivis ? (yes/no) :   ");
					residivis = in.readLine();
					System.out.println("======================================================");
		
					if(residivis.equalsIgnoreCase("yes")){
						
						System.out.print("Jumlah riwayat kejahatan sebelumnya : ");
						int jmlKejahatan = Integer.parseInt(in.readLine());
						if (jmlKejahatan > 1){
							
							for(i = 0; i<jmlKejahatan; i++){
								
								System.out.println("Kejahatan - "+(i+1));
								System.out.print("Riwayat Kejahatan             :  ");
								isiKejahatan = in.readLine();
							}
							
						}
						else{
							
							System.out.print("Riwayat Kejahatan             :  ");
							isiKejahatan = in.readLine();
							
						}
						
					}
					else{
						
						System.out.print("Riwayat Kejahatan             :  ");
						isiKejahatan = in.readLine();
						
					}
					
					System.out.println("======================================================");
					System.out.println("Riwayat Kesehatan ");
					System.out.println("======================================================");
					
					System.out.println("======================================================");
					System.out.print("Apakah napi memiliki riwayat penyakit sebelumnya (yes/no) :   ");
					sakitSebelumnya = in.readLine();
					System.out.println("======================================================");
		
					if(sakitSebelumnya.equalsIgnoreCase("yes")){
						
						System.out.print("Jumlah riwayat penyakit sebelumnya : ");
						int jmlKesehatan = Integer.parseInt(in.readLine());
						if (jmlKesehatan > 1){
							
							for(i = 0; i<jmlKesehatan; i++){
								
								System.out.println("Penyakit - "+(i+1));
								System.out.print("Riwayat Penyakit             :  ");
								isiKesehatan = in.readLine();
							}
							
						}
						else{
							
							System.out.print("Riwayat Penyakit             :  ");
							isiKesehatan = in.readLine();
							
						}
						
					}
					else{
						
						System.out.print("");
						
					}				
					
					System.out.println("======================================================");
					System.out.println("Data Keluarga ");
					System.out.println("======================================================");
					
                        System.out.print("Nama Bapak                :  ");
                        namaBapak = in.readLine();
						System.out.print("Nama Ibu                  :  ");
                        namaIbu = in.readLine();
						
								System.out.print("Apakah narapidana memiliki kakak ? (yes/no) : ");
								saranpilih2 = in.readLine();
								
								if(saranpilih2.equalsIgnoreCase("yes")){
									
									System.out.print("Jumlah kakak : ");
									jmlKakak = Integer.parseInt(in.readLine());
									if (jmlKakak > 1){
							
									for(i = 0; i<jmlKakak; i++){
								
									System.out.println("Kakak - "+(i+1));
									System.out.print("Nama Kakak                 :  ");
									namaKakak = in.readLine();
									}
							
									}
									
								else{
									
									System.out.print("Nama Kakak                 :  ");
									namaKakak = in.readLine();
									
								}
									
								}
								else{
									
									System.out.print("");
									
								}
								
								System.out.print("Apakah narapidana memiliki adik ? (yes/no) : ");
								saranpilih3 = in.readLine();
								
								if(saranpilih3.equalsIgnoreCase("yes")){
									
									System.out.print("Jumlah adik : ");
									jmlAdik = Integer.parseInt(in.readLine());
									if (jmlAdik > 1){
							
									for(i = 0; i<jmlAdik; i++){
								
									System.out.println("Adik - "+(i+1));
									System.out.print("Nama Adik                 :  ");
									namaAdik = in.readLine();
									}
							
									}
									
								else{
									
									System.out.print("Nama Adik                 :  ");
									namaAdik = in.readLine();
									
								}
									
								}
								else{
									
									System.out.print("");
									
								}
						
                        System.out.println("======================================================");
						
					System.out.println("======================================================");
					System.out.println("Data Kepenjaraan ");
					System.out.println("======================================================");
					
						System.out.print("Lapas                :  ");
                        lapas = in.readLine();
						System.out.print("Sel Nomer            :  ");
                        sel = in.readLine();
						
						
						dataDiri a = new dataDiri(namaPelaku, tglPelaku, tmptPelaku, jenisKel, golDar, tinggi, berat, warnaKul, jenisRamb, ciriFis, alamat);
						dataD.set(indeks,a);
						
						riwayatKejahatan b = new riwayatKejahatan(isiKejahatan);
						dataJ.set(indeks, b);
						
						riwayatKesehatan c = new riwayatKesehatan(isiKesehatan);
						dataS.set(indeks, c);
						
						dataKeluarga d = new dataKeluarga(namaBapak,namaIbu,namaKakak,namaAdik);
						dataK.set(indeks, d);
						
						dataKepenjaraan e = new dataKepenjaraan(lapas,sel);
						dataL.set(indeks, e);
			
		}else{
			
			System.out.println("Data dengan nama " +cariNama +" tidak ada");
			
		}
		//runThis();
		
		}	catch (Exception e) {
            
			System.out.println(e);
			
			}
	}
	void cetak(){
		try{
			
		System.out.println("======================================================");
        System.out.print("Lihat data berdasarkan Lapas    :   ");
        viewLapas = in.readLine();
        System.out.println("======================================================");
			
			boolean retval = lapas.contains(viewLapas);
		
			if (retval == true){
					int index = 0;
					System.out.println("======================================================");
					System.out.println("Data Diri");
					System.out.println("======================================================");
                
                    for (dataDiri a : input.getAll()) {
                        System.out.println("Narapidana atas nama " + (namaPelaku));
                        System.out.println("Nama                :   " + a.getNamaPelaku());
                        System.out.println("Tanggal Lahir       :   " + a.getTglPelaku());
                        System.out.println("Tempat Lahir        :   " + a.getTmptPelaku());
						System.out.println("Jenis Kelamin       :   " + a.getJenisKel());
                        System.out.println("Golongan Darah      :   " + a.getGolDar());
                        System.out.println("Tinggi Badan        :   " + a.getTinggi());
                        System.out.println("Berat Badan         :   " + a.getBerat());
                        System.out.println("Warna Kulit         :   " + a.getWarnaKul());
                        System.out.println("Jenis Rambut        :   " + a.getJenisRamb());
                        System.out.println("Ciri Fisik          :   " + a.getCiriFis());
                        System.out.println("Alamat              :   " + a.getAlamat());
                        System.out.println("======================================================");
                    }
					
					for (riwayatKejahatan a : input.getAll2()) {
						System.out.println("======================================================");
						System.out.println("Riwayat Kejahatan");
						System.out.println("======================================================");
						System.out.println("Narapidana atas nama " + (namaPelaku));
						System.out.println("Riwayat Kejahatan    :   " + isiKejahatan);
					}
					
					for (riwayatKesehatan a : input.getAll3()) {
						System.out.println("======================================================");
						System.out.println("Riwayat Kesehatan");
						System.out.println("======================================================");
						System.out.println("Narapidana atas nama " + (namaPelaku));
						System.out.println("Riwayat Kesehatan    :   " + isiKesehatan);
					}
					
					for (dataKeluarga a : input.getAll4()) {
						System.out.println("======================================================");
						System.out.println("Data Keluarga");
						System.out.println("======================================================");
						System.out.println("Narapidana atas nama " + (namaPelaku));
						System.out.println("Nama Bapak    :   " + a.getNamaBapak());
						System.out.println("Nama Ibu    :   " + a.getNamaIbu());
						System.out.println("Nama Kakak    :   " + a.getNamaKakak());
						System.out.println("Nama Adik    :   " + a.getNamaAdik());
					}
					
		//runThis();
	
			}else{
				
				System.out.println("Lapas " + lapas +" Tidak ada");
				
			}
		}catch (Exception e) {
            
		System.out.println(e);
			
		}
	}
}
