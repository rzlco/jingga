class nazi{
	
	int x,y;

	public static void main(String [] args){
		
		nazi a = new nazi();
		
		a.runThis();
	
	}
	
	void runThis(){
		
		for( x = 1;
					x <= 7;
					x++){
						
						for( y =1;
									y <= 7;
									y++){
										
										if( x == 4 && y == 2 || x == 4 && y == 3 || x == 4 && y == 4 || y == 4 || x == 1 && y == 5
											|| x == 1 && y == 6 || x == 1 && y == 7 || x == 4 && y == 5 || x == 4 && y == 6 || x == 4 && y == 7
											|| x == 7 && y == 1 || x == 7 && y == 2 || x == 7 && y == 3 || x == 4 && y == 1 || x== 2 && y ==1
											|| x== 1 && y ==1 || x== 3 && y ==1 || x== 5 && y ==7 || x== 6 && y ==7 || x== 7 && y ==7){
											
											System.out.print(" *");
											
										}
										else{
											
											System.out.print("  ");
											
										}
										
									}
										
						
						
						System.out.println();
					}
						
	}

}