import java.util.Collections;
import java.util.ArrayList;
class syahrizal{
ArrayList<String> dftNama = new ArrayList<String>();

public static void main(String[] asd){
	syahrizal a = new syahrizal();
	a.runThis();
	
}

public void runThis(){
	dftNama.add("Bejo");
	dftNama.add("Tono");
	dftNama.add("Joko");
	dftNama.add("Susan");
	String x = "Tini";
	dftNama.add(x);
	
	Collections.sort(dftNama);
		
	int idx = 0;
	do{
		System.out.println((idx+1) + ". Nama     : " + dftNama.get(idx));
		idx++;
	}
	while(idx < dftNama.size());


	Collections.sort(dftNama, Collections.reverseOrder());
		
	idx = 0;
	do{
		System.out.println((idx+1) + ". Nama     : " + dftNama.get(idx));
		idx++;
	}
	while(idx < dftNama.size());
	
}

}