import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinCase
{
    private int Yen500 = 0;
    private int Yen100 = 0;
    private int Yen50 = 0;
    private int Yen10 = 0;
    private int Yen5 = 0;
    private int Yen1 = 0;

    public void AddCoins( int kind, int count )
    {
        switch( kind )
        {
            case 500:
                Yen500 += count;
                break;
            case 100:
                Yen100 += count;
                break;
            case 50:
                Yen50 += count;
                break;
            case 10:
                Yen10 += count;
                break;
            case 5:
                Yen5 += count;
                break;
            case 1:
                Yen1 += count;
                break;
        }
    }

    public int GetCount( int kind )
    {
        switch( kind )
        {
            case 500:
                return Yen500;
            case 100:
                return Yen100;
            case 50:
                return Yen50;
            case 10:
                return Yen10;
            case 5:
                return Yen5;
            case 1:
                return Yen1;
        }

        return 0;
    }
    
    public int GetCount()
    {
        return Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1;
    }

    public int GetAmount( int kind )
    {
        switch( kind )
        {
            case 500:
                return Yen500 * 500;
            case 100:
                return Yen100 * 100;
            case 50:
                return Yen50 * 50;
            case 10:
                return Yen10 * 10;
            case 5:
                return Yen5 * 5;
            case 1:
                return Yen1 * 1;
        }

        return 0;
    }
    
    public int GetAmount()
    {
        return ( Yen500 * 500 ) + ( Yen100 * 100 )
                + ( Yen50 * 50 ) + ( Yen10 * 10 )
                + ( Yen5 * 5 ) + Yen1;
    }
}

public class Exercise6
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        CoinCase MyCase = new CoinCase();

        for( int i = 0 ; i < 10 ; i++ )
        {
            System.out.print( "???????????????????" );
            int kind = Integer.parseInt( br.readLine() );
            System.out.print( "???????????????????" );
            int count = Integer.parseInt( br.readLine() );

            MyCase.AddCoins( kind, count );
        }

        System.out.println( "500??????" + MyCase.GetCount( 500 ) + "??????" + MyCase.GetAmount( 500 ) + "???" );
        System.out.println( "100??????" + MyCase.GetCount( 100 ) + "???" + MyCase.GetAmount( 100 ) + "???" ) ;
        System.out.println( "50??????" + MyCase.GetCount( 50 ) + "???" + MyCase.GetAmount( 50 ) + "???" );
        System.out.println( "10??????" + MyCase.GetCount( 10 ) + "???" + MyCase.GetAmount( 10 ) + "???" );
        System.out.println( "5??????" + MyCase.GetCount( 5 ) + "???" + MyCase.GetAmount( 5 ) + "???" );
        System.out.println( "1??????" + MyCase.GetCount( 1 ) + "???" + MyCase.GetAmount( 1 ) + "???" );
        System.out .println("?????????" + MyCase.GetCount() + "???");
        System.out.println( "?????????" + MyCase.GetAmount() + "???" );
    }
}