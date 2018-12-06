public class control {
    
    double uts;
    double uas;
    double quiz;
    String nama;
    String nim;

    public control (String nama, String nim, double uts, double uas, double quiz) {
        this.nama = nama;
        this.nim = nim;
        this.uts = uts;
        this.uas = uas;
        this.quiz = quiz;
    }

	
	public String getNama() {
        return nama;
    }
	

    public void setNama(String nama) {
        this.nama = nama;
    }
	
	public String getNim() {
        return nim;
    }
	

    public void setNim(String nim) {
        this.nim = nim;
    }
	
	public double getUts() {
        return uts;
    }
	
    public void setUts(double uts) {
        this.uts = uts;
    }
	
	public double getUas() {
        return uts;
    }
	
    public void setUas(double uas) {
        this.uas = uas;
    }
	
	public double getQuiz() {
        return quiz;
    }
	
    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }
    
}