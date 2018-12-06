class cthBreak{
public static void main( String args[] ){
  
  int hitung;
  for ( hitung = 1; hitung < 11; hitung++ ){
   if ( hitung == 11 ) 
    break;
   
   System.out.printf( "%d ", hitung );
  }
  
  System.out.printf( "\nDihentikan pada hitungan ke-%d\n", hitung );
 }

}
