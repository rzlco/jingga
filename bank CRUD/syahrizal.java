public class syahrizal {
    
    int no;
    private String nama;
    private double saldo;

    public syahrizal(int no, String nama, double saldo) {
        this.no = no;
        this.nama = nama;
        this.saldo = saldo;
    }
    

    syahrizal() {
        
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
