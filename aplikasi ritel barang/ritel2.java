class ritel{
public static void main(String[] args){
	barang brg1 = new barang();
	barang brg2 = new barang();
	brg1.inputData();
	brg2.inputData();
	
	brg1.jualStock(33);
	brg2.jualStock(45);
	
	brg1.viewData();
	brg2.viewData();
}
}