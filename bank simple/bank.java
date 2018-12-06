class bank{
public static void main(String[] args){
	rekening ppk = new rekening();
	rekening ppk2 = new rekening();
	ppk.getNama();
	ppk.getNoRek();
	ppk.setSaldo();
	ppk.getSaldo();
	ppk.tabung();
	ppk.tarik();
	ppk.setJenisKel();
	ppk.getJenisKel();
	ppk2.getNama();
	ppk2.getNoRek();
	ppk2.setSaldo();
	ppk2.getSaldo();
	ppk2.tabung();
	ppk2.tarik();
	ppk2.setJenisKel();
	ppk2.getJenisKel();
	ppk.lihat();
	ppk2.lihat();
}
}