import java.util.Scanner;
class gagen{

Scanner input = new Scanner(System.in);
public static void main (String[] asd){

	gagen baru = new gagen();
	baru.runThis();
	
}
void runThis(){
int angka;

	System.out.print("Masukkan angka : ");
	angka = input.nextInt();
	
	if((angka%2)==0){
		System.out.print("Genap");
	}
	else{
		System.out.print("Ganjil");
}
}
}