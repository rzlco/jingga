import java.util.Scanner;
public class HitungNilai{
public static void main(String[] asd){
	HitungNilai hn = new HitungNilai();
	hn.runThis();
}
Scanner input = new Scanner(System.in);
void runThis(){
	System.out.print("Masukkan nilai : ");
	int nilai = input.nextInt();
	if (nilai>=80){
		System.out.print("maka indeks = A");
	}
	else if ((nilai>=70) && (nilai<80)){
		System.out.print("maka indeks = B");
	}
	else if ((nilai>=60) && (nilai<70)){
		System.out.print("maka indeks = C");
	}
	else if ((nilai>=50) && (nilai<60)){
		System.out.print("maka indeks = D");
	}
	else{
		System.out.print("maka indeks = E");
	}
}
}