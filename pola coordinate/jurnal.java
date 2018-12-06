import java.util.Scanner;

public class jurnal{
	int baris;
	int kolom;
	int masuk;
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	jurnal a = new jurnal();
	
	a.runThis();
	
	}
	
	void runThis(){
		
	System.out.print("Ketinggian : ");
	masuk = input.nextInt();
	
	if (masuk >=1){
		
		
		baris = 1;
		while(baris<=masuk)
		{
			
			
			
			kolom = 1;
			while(kolom<=baris)
			{
				
				 
				
					System.out.print(kolom);
					kolom++;
			}
		System.out.println();
		baris++;
		}
	
	}
	
	else{
		
		System.out.println("Inputan harus bilangan asli");
		
	}

	}
}