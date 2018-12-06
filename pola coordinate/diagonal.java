import java.util.Scanner;

class diagonal{
	int baris;
	int kolom;
	int space,space2;
	int masuk;
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	diagonal a = new diagonal();
	
	a.runThis();
	a.runThis2();
	
	}
	
	void runThis(){
		
	System.out.print("Ketinggian : ");
	masuk = input.nextInt();
	
	if (masuk >=1){
		
		
		for(baris = 1 ; baris<=masuk ; baris++)
		{
			
			for(space = masuk ; space>=baris; space--){
				
				System.out.print(" ");
				
			}
			
			for(kolom = baris ; kolom<=baris ; kolom++)
			{
				
				System.out.println("*");
			
			}
			
			System.out.println(" ");
		}
	
	}
	
	else{
		
		System.out.println("Inputan harus bilangan asli");
		
	}

	}
	
	void runThis2(){
		
	System.out.print("Ketinggian : ");
	masuk = input.nextInt();
	
	if (masuk >=1){
		
		
		for(baris = 1 ; baris<=masuk ; baris++)
		{
			
			for(space = masuk ; space>=kolom; space--){
				
				System.out.print(" ");
				
			}
			
			
			for(kolom = baris ; kolom<=baris ; kolom++)
			{
				
				System.out.println("*");
			
			
			}
			
			
			
			System.out.println(" ");
		}
	}
	
	else{
		
		System.out.println("Inputan harus bilangan asli");
		
	}

	}
	
}