import java.util.*;
import java.util.Random;

class jurnal3string {
	ArrayList<Integer> arrlist = new ArrayList<>();
	ArrayList<String> contoh = new ArrayList<>();
	Random getRandom = new Random();
	public static void main(String[] args) {
    	jurnal3string ar = new jurnal3string();
    	ar.runThis();
	}
	void runThis() {
    	IsiNilai();
    	TampilArray();
	}
	void IsiNilai() {
    	int jml = 0;
		System.out.println("Pengisian Nilai");
    	while (jml < 100) {
        	System.out.println("Nilai ke " + (jml + 1) + " : ");
        	int inputan = getRandom.nextInt(101);
        	System.out.println(inputan);
        	arrlist.add(inputan);
			contoh.add("String ke : " + (jml + 1));
			System.out.println(contoh.get(jml));
        	jml++;
    	}
	}
	public void TampilArray() {
    	int a = 0;
    	int arrMax = arrlist.size();
    	while (a < arrMax) {
        	int nilai = arrlist.get(a);
        	a++;
    	}
	}
}