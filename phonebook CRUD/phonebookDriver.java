import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;

public class phonebookDriver{
	ArrayList<phonebook> phone = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	BufferedReader inp = new BufferedReader(new
	InputStreamReader(System.in));
	
	String nama,no,email;
	
	public static void main(String [] args){
		phonebookDriver a = new phonebookDriver();
		a.menu();
	}
	
	public void menu(){
		int pilih = 0;
		do{
			System.out.println("Phonebook");
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
		nama = input.next();
		System.out.print("No Hp : ");
		no = input.next();
		System.out.print("E-mail : ");
		email = input.next();
		
		phonebook a = new phonebook(nama, no, email);
		phone.add(a);
		
	}
	
	void TampilData(){
		if(phone.size()==0){
			System.out.println("\nData tidak ada!!");
		}else
		{
			phonebook a = new phonebook(no, nama, email); 
			phone.add(a); 
			a.cetak();
		}
	}
	
	void EditData(){
		int edit = 0;
		System.out.println("Data mana yang ingin anda edit?");
		edit = input.nextInt();
		edit = edit-1;
		System.out.println("Nama :   ");
		nama = input.next();
		System.out.println("No Hp :  ");
		no = input.next();
		System.out.println("E-mail : ");
		email = input.next();
		
		phonebook a = new phonebook(no, nama, email); 
		phone.set(edit,a);
		
	}
	
	void HapusData(){
		int hapus = 0;
		System.out.println("Data mana yang ingin anda hapus?");
		hapus = input.nextInt();
		hapus = hapus-1;
		
		phonebook a = new phonebook(no, nama, email); 
		phone.remove(a);
	}
}