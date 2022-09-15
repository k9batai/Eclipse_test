import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2
{
    public static void main( String[] args ) throws IOException
    {
    	BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );

		int score1 = Integer.parseInt( br.readLine() );
		int score2 = Integer.parseInt( br.readLine() );
		
		if( ( score1 >= 60 && score2 >= 60 )
		        || ( ( score1 + score2 ) >= 130 )
		        || ( ( score1 + score2 ) >= 100 && ( score1 >= 90 || score2 >= 90 ) ) )
		    System.out.println( "合格" );
		else
		    System.out.println( "不合格" );
		
		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );

		if( x < y && ( x % 2 ) == 0 && ( y % 2 ) == 0 )
		    System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

		if( x == y && x < 0 )
		    System.out.println( "xとyは等しく、かつ、負の数である。" );

		if( x < y || ( x % 2 ) == 0 )
		    System.out.println( "xはyより小さい、または、xは偶数である。" );

		if( ( x <= 10 || x >= 100 ) && ( y >= 10 && y <= 100 ) )
		    System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

		if( ! ( x < 0 && y < 0 ) )
		    System.out.println( "xもyも負の数である、ではない。" );
		
		System.out.println( "お好きな寿司を選んでください" );
		System.out.println( "1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら" );

		int sushi = Integer.parseInt( br.readLine() );

		switch( sushi )
		{
		    case 1:
		        System.out.println( "何か良いことがあります。" );
		        break;
		    case 2:
		        System.out.println( "驚くほど良いことがあります。" );
		        break;
		    case 3:
		        System.out.println( "ちょっと良いことがあります。" );
		        break;
		    case 4:
		        System.out.println( "とても良いことがあります。" );
		        break;
		    case 5:
		        System.out.println( "そこそこ良いことがあります。" );
		        break;
		}
		
		System.out.println( "何月ですか？" );
		int month = Integer.parseInt( br.readLine() );

		switch( month )
		{
		    case 2:
		        System.out.println( "28日です" );
		        break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		        System.out.println( "30日です" );
		        break;
		    case 1:
		    case 3:
		    case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		        System.out.println( "31日です" );
		        break;
		    default:
		        System.out.println( "入力が間違っています" );
		        break;
		}
	}
}