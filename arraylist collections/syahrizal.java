import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class syahrizal{
	
	ArrayList<Integer> dftNama = new ArrayList<>();
	ArrayList<String> dftNamaa = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	int idx = 0;

public static void main(String[] asd){
	syahrizal a = new syahrizal();
	a.menu();
	a.lagi();
	
}

public void runThis(){
	
	
	System.out.print("Masukkan jumlah data : ");
		int dat = input.nextInt();
		
		for(int i=0; i< dat; i++){
		
		System.out.print("Masukkan angka " +(i+1) + " : ");
		int angka = input.nextInt();
		
		dftNama.add(angka);
		}
	
	Collections.sort(dftNama);
	System.out.println();	
	System.out.println("Descending :");
	do{
		System.out.println("Angka Ke " + (idx+1) + " : " + dftNama.get(idx));
		idx++;
	}
	while(idx < dftNama.size());


	Collections.sort(dftNama, Collections.reverseOrder());
		
	idx = 0;
	System.out.println();
	System.out.println("Ascending :");
	do{
		
		System.out.println("Angka Ke " + (idx+1) + " : " + dftNama.get(idx));
		idx++;
	}
	while(idx < dftNama.size());
	
}

public void setring(){
	
	
	System.out.print("Masukkan jumlah data : ");
		int dat = input.nextInt();
		
		for(int i=0; i< dat; i++){
		
		System.out.print("Masukkan Nama " +(i+1) + " : ");
		String namaa = input.next();
		
		dftNamaa.add(namaa);
		}
	
	Collections.sort(dftNamaa);
	System.out.println();	
	System.out.println("Descending :");
	do{
		System.out.println("Nama Ke " + (idx+1) + " : " + dftNamaa.get(idx));
		idx++;
	}
	while(idx < dftNamaa.size());


	Collections.sort(dftNamaa, Collections.reverseOrder());
		
	idx = 0;
	System.out.println();
	System.out.println("Ascending :");
	do{
		
		System.out.println("Nama Ke " + (idx+1) + " : " + dftNamaa.get(idx));
		idx++;
	}
	while(idx < dftNamaa.size());
	
}

public void menu(){
	
	System.out.println("Menu :");
	System.out.println("1. Angka");
	System.out.println("2. Nama");
	System.out.println("3. Exit");
	System.out.print("Pilih 1-3 : ");
	int pilih = input.nextInt();
	
		switch (pilih){
		case 1:
		runThis();
		break;
		case 2:
		setring();
		break;
		case 3:
		System.out.println("Exit");
		break;
	}
	
}

public void lagi(){
	
	String warn;
	System.out.print("Jalankan Lagi ? [y/n] : ");
	warn = input.next();
	System.out.println("");
	if (warn.equalsIgnoreCase("y")){
		menu();
	} 
	else if(warn.equalsIgnoreCase("n")){
	System.out.println("Exit");
	}
	
}

}