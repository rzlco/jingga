import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;

public class MahasiswaArrayList{
	ArrayList<String> arrnama = new ArrayList<>();
	ArrayList<String> arrnim = new ArrayList<>();
	ArrayList<String> arrkelas = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	BufferedReader inp = new BufferedReader(new
	InputStreamReader(System.in));
	
	public static void main(String [] args){
		MahasiswaArrayList a = new MahasiswaArrayList();
		a.menu();
		a.InputkanData();
		a.TampilData();
		a.EditData();
		a.HapusData();
	}
	
	public void menu(){
		int pilih = 0;
		do{
			System.out.println("=========SELAMAT DATANG=========");
			System.out.println("\n1>Inputkan Data");
			System.out.println("2>Tampil Data");
			System.out.println("3>Edit Data");
			System.out.println("4>Hapus Data");
			System.out.println("5>Keluar");
			System.out.println("Pilihan menu :   ");
				pilih = input.nextInt();
			switch(pilih){
				case 1 :
				InputkanData();
				break;
				case 2 :
				TampilData();
				break;
				case 3 :
				EditData();
				break;
				case 4 :
				HapusData();
				break;
				case 5 :
				System.exit(0);
				break;
				default :
				
				System.out.println("Maaf , inputan yang anda masukan salah");
			}
		}while(pilih !=5);
		
		}
		
	void InputkanData(){
		System.out.print("Nama : ");
		String nama = input.next();
		System.out.print("NIM : ");
		String nim = input.next();
		System.out.print("Kelas : ");
		String kelas = input.next();
		
		arrnama.add(nama);
		arrnim.add(nim);
		arrkelas.add(kelas);
		
	}
	
	void TampilData(){
		if(arrnim.size()==0){
			System.out.println("\nData tidak ada!!");
		}else
		for(int i = 0; i<arrnama.size(); i++){
			System.out.println("\n" + (i+1));
			System.out.println("Nama : " + arrnama.get(i));
			System.out.println("NIM : " + arrnim.get(i));
			System.out.println("Kelas : " + arrkelas.get(i));
		}
	}
	
	void EditData(){
		int edit = 0;
		System.out.println("Data mana yang ingin anda edit?");
		edit = input.nextInt();
		edit = edit-1;
		System.out.println("Nama :   ");
		String nama = input.next();
		System.out.println("NIM :  ");
		String nim = input.next();
		System.out.println("Kelas : ");
		String kelas = input.next();
		
		arrnama.set(edit,nama);
		arrnim.set(edit,nim);
		arrkelas.set(edit,kelas);
		
	}
	
	void HapusData(){
		int hapus = 0;
		System.out.println("Data mana yang ingin anda hapus?");
		hapus = input.nextInt();
		hapus = hapus-1;
		
		arrnama.remove(hapus);
		arrnim.remove(hapus);
		arrkelas.remove(hapus);
	}
}