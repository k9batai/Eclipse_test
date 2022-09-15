public class Exercise {
    public static void main(String[] args) throws Exception {
    	for( int i = 0 ; i < 10 ; i++ )
    	    System.out.print( "SPAM" );
    	
    	for( int i = 1 ; i <= 9 ; i++ )
    	    System.out.print( ( 3 * i ) + " " );
    	
    	int x = 1;

    	for( int n = 1 ; n <= 8 ; n++ ) {
    	    x *= 2;
    	    System.out.println( "2の" + n + "乗=" + x );
    	}
    	
    	x = 1;
    	for( int i = 2 ; i <= 7 ; i++ )
    	    x *= i;

    	System.out.println( x );
    	
    	
    }
}
