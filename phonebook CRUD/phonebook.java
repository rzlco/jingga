public class phonebook {
    
    private String nama;
	private String no;
	private String email;

    public phonebook(String nama,String email,String no) {
        this.no = no;
        this.nama = nama;
        this.email = email;
    }
    

    phonebook() {
        
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
	public void cetak(){ 
    System.out.println("Informasi");  
    System.out.println("Nama           : " + getNama());
    System.out.println("No Hp          : " + getNo());
    System.out.println("E-mail         : " + getEmail());      
  }
    
}
