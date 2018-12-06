import java.util.Scanner;
class syahrizal {
	
	Scanner input = new Scanner (System.in);
	
	
	public static void main (String [] args){
		
		syahrizal a = new syahrizal();
		
		a.runThis();
		a.meneh();
		
	}
	
	void runThis(){
		
		System.out.println("PROGRAM MANTAP");
        System.out.println(" ____________________________________");
        System.out.println("| (1).CREATE X                       |");
        System.out.println("| (2).SIGMA FACTORIAL                |");
        System.out.println("| (3).NAZI                           |");
        System.out.println("| (4).BOX WITH X                     |");
        System.out.println("| (5).RIZAL COORDINATE               |");
        System.out.println("| (6).EXIT                           |");
        System.out.println("|____________________________________|");
        System.out.print("CHOOSE FROM 1 - 6 : ");
		int menu = input.nextInt();
        System.out.println("");
        System.out.println("====================================================");
        switch(menu)
        {
            case 1 : x();
			break;
			case 2 : sigma();
			break;
			case 3 : nazi();
			break;
			case 4 : box();
			break;
			case 5 : rzl();
			break;
            case 6 : System.out.println("========THANKS FOR THE VISIT! ENJOY YOUR DAY!=======");
			break;
        }
		
	}
	
	void x(){
		
		System.out.print ("Jumlah : ");
		int sisi = input.nextInt();
		char cetak [] [] = new char [sisi][sisi];

		for (int b=0;b<sisi;b++)
		{
			for(int k=0;k<sisi;k++)
			{
				if ( b == k||b+k == sisi -1)
				{
					cetak[b] [k] = '*';
				}
				else
				{
					cetak[b] [k] =' ';
				}
				System.out.print (cetak [b] [k]);
			}
			System.out.println ();
		}
	}
	
	int nilai;
	int sum = 0; 
    int fact = 1;
	int i;
	
	public int sum(int nilai) 
    { 
         
        for (i = 1; i <= nilai; i++) { 
      
            fact *= i; 
               
            sum += fact;  
        } 
        return sum; 
    }
	
	void sigma(){
		System.out.print("Masukkan sebuah nilai : ");
		nilai = input.nextInt();
		System.out.println("= " +sum(nilai));
	}
	
	void nazi(){
		
		int x,y;
		
		for( x = 1;
					x <= 7;
					x++){
						
						for( y =1;
									y <= 7;
									y++){
										
										if( x == 4 && y == 2 || x == 4 && y == 3 || x == 4 && y == 4 || y == 4 || x == 1 && y == 5
											|| x == 1 && y == 6 || x == 1 && y == 7 || x == 4 && y == 5 || x == 4 && y == 6 || x == 4 && y == 7
											|| x == 7 && y == 1 || x == 7 && y == 2 || x == 7 && y == 3 || x == 4 && y == 1 || x== 2 && y ==1
											|| x== 1 && y ==1 || x== 3 && y ==1 || x== 5 && y ==7 || x== 6 && y ==7 || x== 7 && y ==7){
											
											System.out.print(" *");
											
										}
										else{
											
											System.out.print("  ");
											
										}
										
									}
										
						
						
						System.out.println();
					}
						
	}
	
	void box(){
		
		int x,y;
		
		for( x = 1;
					x <= 7;
					x++){
						
						for( y =1;
									y <= 7;
									y++){
										
										
										if( x == 1 && y == 1 || x == 1 && y == 2 || x == 1 && y == 3 || x == 1 && y == 4 || x == 1 && y == 5 || x == 1 && y == 6 || x == 1 && y == 7
											|| x == 2 && y == 1 || x == 3 && y == 1 || x == 4 && y == 1 || x == 5 && y == 1 || x == 6 && y == 1 || x == 7 && y == 1 
											|| x == 7 && y == 1 || x == 7 && y == 2 || x == 7 && y == 3 || x == 7 && y == 4 || x == 7 && y == 5 || x == 7 && y == 6 || x == 7 && y == 7
											|| x == 2 && y == 7 || x == 3 && y == 7 || x == 4 && y == 7 || x == 5 && y == 7 || x == 6 && y == 7 || x == 7 && y == 7 
											|| x == 2 && y == 2 || x == 3 && y == 3 || x == 4 && y == 4 || x == 5 && y == 5 || x == 6 && y == 6 
											|| x == 6 && y == 2 || x == 5 && y == 3 || x == 4 && y == 4 || x == 3 && y == 5 || x == 2 && y == 6){
											System.out.print("* ");
											
										}
										else{
											
											System.out.print("  ");
											
										}
										
									}
										
						
						
						System.out.println();
					}
						
	}
	
	void rzl(){
		
		int x,y;
		
		for( x = 1;
					x <= 8;
					x++){
						
						for( y =1;
									y <= 36;
									y++){
										
										
										if( x == 1 && y == 1 || x == 1 && y == 2 || x == 1 && y == 3 || x == 1 && y == 4
											|| x == 2 && y == 1 || x == 3 && y == 1 || x == 4 && y == 1 || x == 5 && y == 1 || x == 6 && y == 1 || x == 7 && y == 1 || x == 8 && y == 1
											|| x == 2 && y == 4
											|| x == 4 && y == 3 || x == 3 && y == 4 || x == 4 && y == 2 || x == 4 && y == 4
											|| x == 5 && y == 1 || x == 6 && y == 2 || x == 7 && y == 3 || x == 8 && y == 4
											
											|| x == 1 && y == 6 || x == 2 && y == 6 || x == 3 && y == 6 || x == 4 && y == 6 || x == 5 && y == 6 || x == 6 && y == 6 || x == 7 && y == 6 || x == 8 && y == 6
											
											|| x == 1 && y == 8 || x == 1 && y == 9 || x == 1 && y == 10 || x == 1 && y == 11 || x == 1 && y == 12 || x == 1 && y == 13 || x == 1 && y == 14
											|| x == 2 && y == 14 || x == 3 && y == 13 || x == 4 && y ==12 || x == 5 && y == 11 || x == 6 && y == 10 || x == 7 && y == 9 || x == 8 && y == 8
											|| x == 8 && y == 9 || x == 8 && y == 10 || x == 8 && y == 11 || x == 8 && y == 12 || x == 8 && y == 13 || x == 8 && y == 14
											
											|| x == 8 && y ==16 || x == 7 && y ==17 || x == 6 && y ==18 || x == 5 && y ==19 || x == 4 && y ==20 || x == 3 && y ==21 || x == 2 && y ==22 || x == 1 && y ==23
											|| x == 2 && y == 24 || x == 3 && y == 25 || x == 4 && y == 26 || x == 5 && y == 27 || x == 6 && y == 28 || x == 7 && y == 29 || x == 8 && y == 30
											|| x == 5 && y == 20 || x == 5 && y == 21 || x == 5 && y == 23 || x == 5 && y == 24 || x == 5 && y == 25 || x == 5 && y == 26 || x == 5 && y == 22
											
											|| x == 8 && y == 32 || x == 7 && y == 32 || x == 6 && y == 32 || x == 5 && y == 32 || x == 4 && y == 32 || x == 3 && y == 32 || x == 2 && y == 32 || x == 1 && y == 32
											|| x == 8 && y == 33 || x == 8 && y == 34 || x == 8 && y == 35 || x == 8 && y == 36
 											){
											System.out.print(" *");
											
										}
										else{
											
											System.out.print("  ");
											
										}
										
									}
										
						
						
						System.out.println();
					}
						
	}
	
	void meneh(){
		
		String anyar;
			System.out.println("");
			System.out.print("Run Again ? [y/n] : ");
				anyar = input.next();
			System.out.println("");
			
				if (anyar.equalsIgnoreCase("y")){
				runThis();
				meneh();
				} 
				else if(anyar.equalsIgnoreCase("n")){
				System.out.println("Keluar");
				
				}
		
		}

}