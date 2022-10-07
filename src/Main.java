public class Main{
	public static void main(String[ ] args){
        // 戻り値、引数リストのあるメソッドの呼び出し
        String returnString = mojiretuRenketu("Hello, Java.", 3);
        System.out.println("mojiretuRenketuの結果 : " + returnString);
        // 引数があり、戻り値のないメソッドの呼び出し
        printMessage("こんにちは、Javaの勉強は進んでいますか？");
        // 引数がなく、戻り値があるメソッドの呼び出し
        int returnVal = getCount( );
        System.out.println("getCountの結果" + returnVal);
        // 引数も戻り値もないメソッドの呼び出し
        printHello( );
        
        for( int i = 1; i < 20; i++ ){
            int ans = executeCalcSigma(i);
            System.out.println(ans);
        }
    }
    static String mojiretuRenketu(String str, int i){
        String ret = "";
        for(int j = 0; j < i; j++){
            ret += str;
        }
        return ret;
    }
    static void printMessage(String str){
        System.out.println("メッセージは「" + str + "」です");
    }
    static int getCount( ){
        int i = 0;
        for(int j = 0; j < 10; j++){
            i += j;
        }
        return i;
    }
    static void printHello( ){
        System.out.println("Hello");
    }
    
    static int executeCalcSigma(int i){
        int ans = 0;
        for(int j = i; j != 0; j--){
            ans += j;
        }
        return ans;
    }
}