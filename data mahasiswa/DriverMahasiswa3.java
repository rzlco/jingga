import java.util.Scanner;
import java.util.ArrayList;

class DriverMahasiswa3{

	Scanner in = new Scanner(System.in);
	
	ArrayList<Mahasiswa> arrMhs = new ArrayList<>();
	
	public static void main(String[] args){
	
		DriverMahasiswa3 dm = new DriverMahasiswa3();
		dm.runThis();
	
	}
	
	void runThis(){
	
		inputData();
		viewData();
	
	}
	
	void viewData(){
	
	System.out.println("Data Mahasiswa");
	
	for (int a = 0; a < arrMhs.size(); a++){
	
		String nama = arrMhs.get(a).getNama();
		int nim = arrMhs.get(a).getNim();
		String asalsekolah = arrMhs.get(a).getAsalSekolah();
		String alamatasal = arrMhs.get(a).getAlamatAsal();
		String alamatsekarang = arrMhs.get(a).getAlamatSekarang();
		System.out.println((a+1) + ".\tNim : " + nim);
		System.out.println("\tNama : " + nama);
		System.out.println("\tAsal Sekolah : " + asalsekolah);
		System.out.println("\tAlamat Asal : " + alamatasal);
		System.out.println("\tAlamat Sekarang : " + alamatsekarang);
	
	}
	
	}
	
	void inputData(){
		
		System.out.print("Masukkan jumlah data : ");
		int dat = in.nextInt();
		
		for(int i=0; i< dat; i++){
	
		System.out.println("Masukkan Data Mahasiswa Ke "+(i+1));
		System.out.print("NIM : ");
		int nim = in.nextInt();
		System.out.print("Nama : ");
		String nama = in.next();
		System.out.print("Asal Sekolah : ");
		String asalsekolah = in.next();
		System.out.print("Alamat Asal : ");
		String alamatasal = in.next();
		System.out.print("Alamat Sekarang : ");
		String alamatsekarang = in.next();
		Mahasiswa mhs = new Mahasiswa(nim, nama, asalsekolah, alamatasal, alamatsekarang);
		arrMhs.add(mhs);
	
	}
	}

}