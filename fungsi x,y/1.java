import java.util.Scanner;
class fungsi{
public static void main (String[] asd){
	fungsi hf = new fungsi();
	hf.runThis();
}
Scanner input = new Scanner(System.in);
void runThis(){
int x=0;
int y=0;

	System.out.print("Masukkan x : ");
	x = input.nextInt();
	System.out.print("Masukkan y : ");
	y = input.nextInt();
	int f = (x*y+2*x+2*y+6);
	System.out.print("Nilai F : "+f);
}
}