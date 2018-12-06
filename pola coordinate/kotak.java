class kotak{
	
	int x,y;

	public static void main(String [] args){
		
		kotak a = new kotak();
		
		a.runThis();
	
	}
	
	void runThis(){
		
		for( x = 1;
					x <= 7;
					x++){
						
						for( y =1;
									y <= 7;
									y++){
										
										
										if( x == 1 && y == 1 || x == 1 && y == 2 || x == 1 && y == 3 || x == 1 && y == 4 || x == 1 && y == 5 || x == 1 && y == 6 || x == 1 && y == 7
											|| x == 2 && y == 1 || x == 3 && y == 1 || x == 4 && y == 1 || x == 5 && y == 1 || x == 6 && y == 1 || x == 7 && y == 1 
											|| x == 7 && y == 1 || x == 7 && y == 2 || x == 7 && y == 3 || x == 7 && y == 4 || x == 7 && y == 5 || x == 7 && y == 6 || x == 7 && y == 7
											|| x == 2 && y == 7 || x == 3 && y == 7 || x == 4 && y == 7 || x == 5 && y == 7 || x == 6 && y == 7 || x == 7 && y == 7 
											|| x == 2 && y == 2 || x == 3 && y == 3 || x == 4 && y == 4 || x == 5 && y == 5 || x == 6 && y == 6 
											|| x == 6 && y == 2 || x == 5 && y == 3 || x == 4 && y == 4 || x == 3 && y == 5 || x == 2 && y == 6){
											System.out.print("* ");
											
										}
										else{
											
											System.out.print("  ");
											
										}
										
									}
										
						
						
						System.out.println();
					}
						
	}

}