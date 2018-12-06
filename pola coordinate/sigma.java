import java.util.Scanner;
class sigma {
	
	int nilai;
	int sum = 0; 
    int fact = 1;
	int i;
	
	Scanner input = new Scanner (System.in);
	
	
	public static void main (String [] args){
		
		sigma a = new sigma();
		
		a.runThis();
		
	}
	
	public int sum(int nilai) 
    { 
         
        for (i = 1; i <= nilai; i++) { 
      
            fact *= i; 
               
            sum += fact;  
        } 
        return sum; 
    }
	
	void runThis(){
		System.out.print("Masukkan sebuah nilai : ");
		nilai = input.nextInt();
		System.out.println("= " +sum(nilai));
	}
}