import java.util.ArrayList;

public class InputData{
	
	ArrayList<dataDiri> dataD ;
	ArrayList<riwayatKejahatan> dataJ ;
	ArrayList<riwayatKesehatan> dataS ;
	ArrayList<dataKeluarga> dataK ;
	ArrayList<dataKepenjaraan> dataL ;
	
	public InputData(){
		
		dataD = new ArrayList();
		dataJ = new ArrayList();
		dataS = new ArrayList();
		dataK = new ArrayList();
		dataL = new ArrayList();
		
	}
	
	public void insertData(String namaPelaku, String tglPelaku, String tmptPelaku, String jenisKel, String golDar, String tinggi, String berat, String warnaKul, String jenisRamb, String ciriFis, String alamat){
		
		dataDiri a = new dataDiri(namaPelaku, tglPelaku, tmptPelaku, jenisKel, golDar, tinggi, berat, warnaKul, jenisRamb, ciriFis, alamat);
		dataD.add(a);
		
	}
	
	public void setData(String namaPelaku, String tglPelaku, String tmptPelaku, String jenisKel, String golDar, String tinggi, String berat, String warnaKul, String jenisRamb, String ciriFis, String alamat){
		
		dataDiri a = new dataDiri(namaPelaku, tglPelaku, tmptPelaku, jenisKel, golDar, tinggi, berat, warnaKul, jenisRamb, ciriFis, alamat);
		dataD.set(0, a);
		
	}
	
	public void insertData2(String isiKejahatan){
		
		riwayatKejahatan a = new riwayatKejahatan(isiKejahatan);
		dataJ.add(a);
		
	}
	
	public void setData2(String isiKejahatan){
		
		riwayatKejahatan a = new riwayatKejahatan(isiKejahatan);
		dataJ.set(0, a);
		
	}
	
	public void insertData3(String isiKesehatan){
		
		riwayatKesehatan a = new riwayatKesehatan(isiKesehatan);
		dataS.add(a);
		
	}
	
	public void setData3(String isiKesehatan){
		
		riwayatKesehatan a = new riwayatKesehatan(isiKesehatan);
		dataS.set(0, a);
		
	}
	
	public void insertData4(String namaBapak, String namaIbu, String namaKakak, String namaAdik){
		
		dataKeluarga a = new dataKeluarga(namaBapak,namaIbu,namaKakak,namaAdik);
		dataK.add(a);
		
	}
	
	public void setData4(String namaBapak, String namaIbu, String namaKakak, String namaAdik){
		
		dataKeluarga a = new dataKeluarga(namaBapak,namaIbu,namaKakak,namaAdik);
		dataK.set(0, a);
		
	}
	
	public void insertData5(String lapas, String sel){
		
		dataKepenjaraan a = new dataKepenjaraan(lapas,sel);
		dataL.add(a);
		
	}
	
	public void setData5(String lapas, String sel){
		
		dataKepenjaraan a = new dataKepenjaraan(lapas,sel);
		dataL.set(0, a);
		
	}
	
	public ArrayList<dataDiri> getAll(){
		
		return dataD;
		
	}
	
	public ArrayList<riwayatKejahatan> getAll2(){
		
		return dataJ;
		
	}
	
	public ArrayList<riwayatKesehatan> getAll3(){
		
		return dataS;
		
	}
	
	public ArrayList<dataKeluarga> getAll4(){
		
		return dataK;
		
	}
	
	public ArrayList<dataKepenjaraan> getAll5(){
		
		return dataL;
		
	}
	
	public void deleteData(int index){
		
		dataD.remove(index);
		
	}
	
}