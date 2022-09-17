import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
    	int     values[] = new int[10];
    	int     cnt, sum;

    	for( cnt = 0, sum = 0 ; cnt < 10 && sum <= 100 ; cnt++ )
    	{
    	    values[cnt] = Integer.parseInt( br.readLine() );
    	    sum += values[cnt];
    	}

    	for( int i = 0 ; i < cnt ; i ++ )
    	    System.out.print( "\n" + values[i] );
    	
    	int value = Integer.parseInt( br.readLine() );

    	int binary[] = new int[16];

    	for( int i = 15 ; i >= 0 ; i--, value /= 2 )
    	    binary[i] = value % 2;

    	for( int i = 0 ; i < 16 ; i++ )
    	    System.out.print( binary[i] );
    }
    
    
}