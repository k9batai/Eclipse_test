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
            System.out.print( "硬貨の種類は?" );
            int kind = Integer.parseInt( br.readLine() );
            System.out.print( "硬貨の枚数は?" );
            int count = Integer.parseInt( br.readLine() );

            MyCase.AddCoins( kind, count );
        }

        System.out.println( "500円は" + MyCase.GetCount( 500 ) + "枚" );
        System.out.println( "100円は" + MyCase.GetCount( 100 ) + "枚" );
        System.out.println( "50円は" + MyCase.GetCount( 50 ) + "枚" );
        System.out.println( "10円は" + MyCase.GetCount( 10 ) + "枚" );
        System.out.println( "5円は" + MyCase.GetCount( 5 ) + "枚" );
        System.out.println( "1円は" + MyCase.GetCount( 1 ) + "枚" );
        System.out.println( "総額は" + MyCase.GetAmount() + "円" );
    }
}