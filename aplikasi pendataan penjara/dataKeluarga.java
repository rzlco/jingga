public class dataKeluarga {
    
	String namaBapak;
	String namaIbu;
	String namaKakak;
	String namaAdik;

    public dataKeluarga (String namaBapak, String namaIbu, String namaKakak, String namaAdik) {
    this.namaBapak = namaBapak;
	this.namaIbu = namaIbu;
	this.namaKakak = namaKakak;
	this.namaAdik = namaAdik;
    }

	public String getNamaBapak() {
        return namaBapak;
    }
	
	public String getNamaIbu() {
        return namaIbu;
    }
	
	public String getNamaKakak() {
        return namaKakak;
    }
	
	public String getNamaAdik() {
        return namaAdik;
    }
	
    public void setNamaBapak(String namaBapak) {
        this.namaBapak = namaBapak;
    }
	
	public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }
	
	public void setNamaKakak(String namaKakak) {
        this.namaKakak = namaKakak;
    }
	
	public void setNamaAdik(String namaAdik) {
        this.namaAdik = namaAdik;
    }
    
}