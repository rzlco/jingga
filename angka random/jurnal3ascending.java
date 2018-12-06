import java.util.*;
import java.util.Random;

class jurnal3ascending {
	ArrayList<Integer> arrlist = new ArrayList<>();
	Random getRandom = new Random();
	public static void main(String[] args) {
    	jurnal3ascending ar = new jurnal3ascending();
    	ar.runThis();
	}
	void runThis() {
    	IsiNilai();
    	TampilArray();
	}
	void IsiNilai() {
    	int jml = 5;
		System.out.println("Pengisian Nilai");
    	while (jml > 0) {
        	System.out.println("Nilai ke " + (jml + 1) + " : ");
        	int inputan = getRandom.nextInt(101);
        	System.out.println(inputan);
        	arrlist.add(inputan);
        	jml--;
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