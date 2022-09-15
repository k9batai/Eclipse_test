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
        
        x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );

        System.out.println("和 " + ( x + y ) );
        System.out.println("差 " + ( x - y ) );
        System.out.println("積 " + ( x * y ) );
        System.out.println("商 " + ( x / y ) );
        System.out.println("余り " + ( x % y ) );
        
        x = Integer.parseInt( br.readLine() );
        y = Integer.parseInt( br.readLine() );

        System.out.println( "平均値=" + ( ( x + y ) / 2 ) );
        
        System.out.println( "あなたの年齢は？" );
        int age = Integer.parseInt( br.readLine() );

        System.out.println( "生まれてから今まで、およそ " + ( age * 365 ) + "日です" );
    }
}