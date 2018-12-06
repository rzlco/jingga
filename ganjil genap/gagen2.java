import java.util.Scanner;
class genap {
	void proses(){
        System.out.println("Ganjil/Genap Program");
        Scanner input = new Scanner(System.in);
        int bil;
        int i;
        int a;
        System.out.print("Masukan Banyak Bilangan  : ");
        bil = input.nextInt();
        for (i = 1; i <= bil; i++) {
            System.out.println("Masukan Bilangan :");
            a = input.nextInt();

            if (a % 2 == 0) {
                System.out.println("Genap");
            } else if (a % 2 == 1) {
                System.out.println("Ganjil");
            }
        }
	}
}

class operasi{
public static void main(String[] args){
	genap abc = new genap();
	abc.proses();
}
}