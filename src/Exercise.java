import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise {
    public static void main(String[] args) throws Exception {
    	
    	BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int max_value = 0;

		for( int i = 0 ; i < 10 ; i++ )
		{
		    int value = Integer.parseInt( br.readLine() );

		    if( value > max_value )
		        max_value = value;
		}

		System.out.println( "最大値=" + max_value );
	}
}
