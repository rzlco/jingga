public class dataKepenjaraan {
    
	String lapas;
	String sel;

    public dataKepenjaraan (String lapas, String sel) {
    this.lapas = lapas;
    this.sel = sel;
    }

	public String getLapas() {
        return lapas;
    }
	
	public String getSel() {
        return sel;
    }
	
    public void setLapas(String lapas) {
        this.lapas = lapas;
    }
	
	public void setSel(String sel) {
        this.sel = sel;
    }
    
}