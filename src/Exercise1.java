import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        String  s = br.readLine();
        System.out.println( s );
        
        int x = Integer.parseInt( br.readLine() );
        System.out.println( x );
        
        x = Integer.parseInt( br.readLine() );

        System.out.println( x );
        System.out.println( x * x );
        System.out.println( x * x * x );
    }
}