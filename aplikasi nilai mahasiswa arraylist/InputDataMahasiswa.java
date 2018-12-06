import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<control> nilai; //variabel listmahasiswa bertipe ArrayList
    public InputDataMahasiswa() { //constructor
        nilai = new ArrayList (); //instansiasi dari variabel listmahasiswa
    }
    public void insertData(String nama, String nim, double uts, double uas, double quiz) { //method untuk memasukkan data NIM, Nama, dan Alamat ke dalam ArrayList
        control mhs = new control(nama, nim, uts, uas, quiz); //objek mhs yang bertipe mahasiswa
        nilai.add(mhs); //menambahkan data objek mhs ke dalam ArrayList listmahasiswa
    }
    public ArrayList<control> getALL() { //method untuk mengambil data yang disimpan dalam ArrayList listmahasiswa
        return nilai; //mengembalikan nilai dari variabel listmahasiswa
    }
    public void deleteData(int index) { //method untuk menghapus data di ArrayList berdasarkan index Arraynya
        nilai.remove(index);
    }
}