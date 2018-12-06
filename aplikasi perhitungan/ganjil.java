import java.util.Scanner;

class GajilGenap {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int bilangan = gg.nextInt();
        if (bilangan %2 == 1){
            System.out.println("GANJIL");
        }
        else
            System.out.println("GENAP");
    }
}