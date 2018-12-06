import java.util.Scanner;
class cetak {
	
	Scanner input = new Scanner (System.in);
	
	
	public static void main (String [] args){
		
		cetak a = new cetak();
		
		a.runThis();
		
	}
	
	void runThis(){
		
		for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
		
		System.out.println();

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
	}
}