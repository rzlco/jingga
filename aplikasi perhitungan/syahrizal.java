import java.util.Scanner;
class syahrizal {
	
	int nilai,angka,masuk;
	int baris,a,bil,sum,pilih;
	
	Scanner input = new Scanner (System.in);
	
	
	public static void main (String [] args){
		
		syahrizal a = new syahrizal();
		
		a.runThis();
		
	}
	
	void runThis(){
	do{
        System.out.println("SELAMAT DATANG DI APLIKASI PERHITUNGAN");
        System.out.println(" ____________________________________");
        System.out.println("| [1].Mencetak angka 0..10 10..0     |");
        System.out.println("| [2].Mencetak angka n               |");
        System.out.println("| [3].Mencetak n bil. genap/ganjil   |");
        System.out.println("| [4].Sigma total, genap, ganjil     |");
        System.out.println("| [5].Mencetak fibonacci             |");
        System.out.println("| [6].Mencetak faktorial             |");
        System.out.println("| [7].Mencetak prima                 |");
        System.out.println("| [8].Keluar                         |");
        System.out.println("|____________________________________|");
        System.out.print("Pilih 1-8 : ");
		pilih = input.nextInt();
        System.out.println("");
        System.out.println("======================================");
        switch(pilih)
        {
            case 1 : cetak1();
			break;
            case 2 : cetak2();
			break;
            case 3 : ganjil();
			break;
            case 4 : sigma();
			break;
			case 5 : fibonacci();
			break;
			case 6 : faktorial();
			break;
			case 7 : prima();
			break;
            case 8 : exit();
			break;
        }
       }
	   
	   while(pilih!=5);	
		
	}
	
	void cetak1(){
		
		int i = 1;
		while (i <= 10 ){
            System.out.println(i);
			i++;
        }
		
		System.out.println();

		i = 10;
        while ( i > 0 ){
            System.out.println(i);
			i--;
        }
	}
	
	void cetak2(){
		
		System.out.print("Masukkan bilangan : ");
		masuk = input.nextInt();
		
		int i = 1; 
		while (i <= masuk){
            System.out.println(i);
			i++;
        }
		
		System.out.println();
		
		i = masuk; 
        while (i > 0){
            System.out.println(i);
        i--;
		}
	}
	
	void ganjil(){
		
	System.out.print("Angka : ");
	angka = input.nextInt();
	
	if (angka >=1){
		
		
		baris = 1;
		while(baris<=angka)
		{
			angka = angka % 2;
			if(angka == 0){
				
					System.out.println("is Genap");
				
			}
			else{
					System.out.println("is Ganjil");
			}
			baris++;
		}
	
	}
	
	else{
		
		System.out.println("Inputan harus bilangan asli");
		
	}

	}
	
	void sigma(){
		
		sum = 0;
		System.out.println("Menentukan sigma total, sigma ganjil, sigma genap");
		System.out.print("Menentukan sigma total, masukkan bilangan : ");
		bil = input.nextInt();
		
		a = 1; 
		while(a<=bil){
			
			sum = sum + a;
			if(a!=bil){
				
				System.out.print(a+ "+"); 
			}
			else{
				
				System.out.print(a);
				
			}
			
			System.out.println("="+sum);
			a++;
		}
			
			
		System.out.println("Menentukan sigma total, sigma ganjil, sigma genap");
		System.out.print("Menentukan sigma genap, masukkan bilangan : ");
		bil = input.nextInt();
		
			int sum1 = 0;
				a = 1;
				while(a<=bil){
					
					if(a % 2 == 0){
						
						sum1 = sum1+a;
							if(((bil-1)==a) || (a == bil)){
								
								System.out.print(a);
								
							}
							else{
								
								System.out.print(a+"+");
								
							}
						
					}
					
					System.out.println(" = "+sum1);
					a++;
				}
				
				
				System.out.println("Menentukan sigma total, sigma ganjil, sigma genap");
			System.out.print("Menentukan sigma ganjil, masukkan bilangan : ");
			
			bil = input.nextInt();
				int sum2 = 0;
					for( a = 1; a<=bil;a++){
						
						if(a % 2 == 1){
							
							sum2 = sum2 + a;
								if(((bil+1)==a)||(a==bil)){
									
									System.out.print(a);
								}
						}
						else{
							
							System.out.print(a+ "+");
							
						}
						
					}
					System.out.println("="+sum2);
			}
			
		
	
	void fibonacci(){
		
		 int a,b,hasil=0,c;
			Scanner input = new Scanner (System.in);
			System.out.print ("Masukan deret fibonacci  : ");
			c = input.nextInt ();
			System.out.print ("Masukan angka awal  : ");
			b = input.nextInt ();
			int i=1; 
					while(i<=c){            
					a=b;
					b=hasil;
					System.out.print(hasil+" ");
					hasil=a+b;
					i++;
					}
		
	}
	
	void faktorial(){
		int faktorial,faktorial2 = 1,value = 1,limit;
        
        System.out.println("Masukkan nilai faktorial : ");
		limit=input.nextInt();
		
        System.out.print(limit+"! : ");
		faktorial=limit;
		
        if(limit>0){
			
			value=1;
            while(value<=limit){
				System.out.print(faktorial);
				if(value<limit){
					System.out.print("x");
				}else{
						System.out.print(" = ");
						System.out.println(faktorial2);
				}
				faktorial2 = faktorial2*faktorial;faktorial=(faktorial-1);
				value++;
			}
        }else{
			System.out.println("ERROR");
			}
    }
	
	void prima(){
		
	System.out.print("Angka : ");
	angka = input.nextInt();
	
	for (int i = 2; i < angka; i++){
			boolean isPrima = true;
			
			for (int j = 2; j < i; j++){
				if(i%j == 0){
					isPrima = false;
					break;
			}
		}
	
		if(isPrima == true){
			System.out.println(i+" is Prima");
		}
		else{
			System.out.println(i+" is not Prima");
		}
		}
	}
	
	 void exit(){
		 System.out.println("Danke!");
		 System.exit(0);
	}

}