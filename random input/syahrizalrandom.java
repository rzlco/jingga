import java.util.Scanner;
import java.util.Random;

class syahrizalrandom {
	
	Random getRandom = new Random();
    Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		syahrizalrandom a = new syahrizalrandom();
		
		a.runThis();
	
	}
	
	void runThis(){
        // TODO code application logic here
         int i;
        //System.out.print("Masukkan banyak jumlah data :\t");
        int N=100;
        FrekuensiKemunculanData(N);
     
    }
	
    void FrekuensiKemunculanData(int N){
    int i,Frekuensi,Angka,AngkaSelanjutnya;
    Scanner input=new Scanner(System.in);
    int [] A=new int[N+1];
	
    for(i=0;i<N;i++){

        A[i]=getRandom.nextInt(101);
    
	}
    //Pengurutan Data
    for(i=0;i<N;i++){
        for(int j=i+1;j<N;j++){
            if(A[j]<A[i]){
               int temp=A[i];
               A[i]=A[j];
               A[j]=temp;
            }
        }
    }
	
    Frekuensi=1;
    i=0;
        System.out.println("");    
        System.out.println("Kemunculan Data");
        System.out.println("");
        System.out.println("Nilai"+"\t	Kemunculan");
    while(i <N){
        Angka=A[i];
        AngkaSelanjutnya =A[i+1];
        if (Angka == AngkaSelanjutnya){ 
           Frekuensi = Frekuensi+1;
        }
        else{ 
            System.out.println(""+Angka+"\t\t:"+Frekuensi);
            Frekuensi = 1;
        }
    i = i + 1;
    }
	//modus
		int[] tabelFrekuensi = new int[N];
 
        // seluruh tabelFrekuensi nilai awalnya adalah 0 (nol)
        for (i=0; i<N; i++) {
            tabelFrekuensi[i] = 0;
        }
 
        // tampung
        for (i=0; i<A.length; i++) {
            tabelFrekuensi[A[i]]++;
        }
 
        // cari nilai modus
        int nilaiModus = 0;
        for (i=0; i<N; i++) {
            if (tabelFrekuensi[i] > nilaiModus) {
                nilaiModus = i;
            }
        }
 
        System.out.println("\nMuncul Tebanyak Angka : " + nilaiModus);
        System.out.println("Angka " + nilaiModus + " muncul sebanyak " + tabelFrekuensi[nilaiModus] + " kali");
	
  }

}
