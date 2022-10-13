public class Exercise1 {
	public static void main( String[] args ) {
	    System.out.println( "3の2乗=" + pow2( 3 ) );
	    System.out.println( "4と9の平均=" + average( 4, 9 ) );
	}


	static int pow2( int n ) {
	    return n * n;
	}
	
	static int average(int x, int y) {
		return (x + y) / 2;
	}
}
