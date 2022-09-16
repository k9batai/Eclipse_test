import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise {
    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int count = Integer.parseInt( br.readLine() );

		for( int i = 0 ; i < count ; i++ )
		    System.out.print( "*" );
		
		count = Integer.parseInt( br.readLine() );

		for( int i = 0, out = 0 ; i < count ; i++ )
		{
		    System.out.print( out++ );

		    if( out > 9 )
		        out = 0;
		}
		
		int sum = 0;

		while( sum <= 100 )
		    sum += Integer.parseInt( br.readLine() );

		System.out.println( "合計は " + sum );
	}
}
