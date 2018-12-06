package education;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author putuguna
 * @website www.putuguna.com 
 */
public class DeretFibonacci {
    public static void main(String[] args) {
        temukanDeretFibonacci(10);
    }
    
    public static void temukanDeretFibonacci(int angka){
        
        //variable utk menampung dua angka penjumlahan
        int angkaPertama = 0;
        int angkaKedua = 1;
        
        //list utk menampung angka2 hasil penjumlahan
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(angkaPertama); //simpan angka pertama
        listFibonacci.add(angkaKedua); //simpan angka kedua
        
        for (int i = 0; i < angka-2; i++) { // ini kenapa dikurang 2? Baca di postingan artikel
            
            //jumlahkan akan pertama dan angka kedua
            int hasilPenjumlahan = angkaPertama + angkaKedua;
            
            //hasil penjumlahan simpan di list
            listFibonacci.add(hasilPenjumlahan);
            
            // ganti angka pertama dan kedua sesuai dengan urutan dan hasil penjumlahan sebelumnya
            angkaPertama = angkaKedua;
            angkaKedua = hasilPenjumlahan;
        }
        
        //print deret fibonacci
        String deretFibonacci = "";
        
        for (int i = 0; i < listFibonacci.size(); i++) {
            System.out.println("Hasil Fibonacci index ke - "+ (i+1) +" == " + listFibonacci.get(i));
            deretFibonacci += listFibonacci.get(i)+ ", ";
        }
        
        System.out.println("");
        
        System.out.println("Fibonacci : " + deretFibonacci);
        
    }
   
}