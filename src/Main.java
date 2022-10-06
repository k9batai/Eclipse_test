public class Main{
    public static void main(String[ ] args){
        int i = (int)(Math.random( ) * 6) + 1;  // キャストする
        System.out.println("ランダムに生成した数値は : " + i + "です");
        
        String str = "100";
        int a = Integer.parseInt(str); //文字列の"100"を整数の100に変換
        int ans = a + 20; //i はstrの表す文字列と同じ意味の数値が入っている
        System.out.println("足し算の結果 : " + ans);
        
        printHello();
        String msg = "こんにちは、Java";
        printMessage(msg);  // メソッドの呼び出し
    }
    
    static void printHello( ){
        String msg = "メソッドが呼ばれました";
        System.out.println(msg);
    }
    
    static void printMessage(String greeting){
        System.out.println("メソッドから出力 : " + greeting);
    }
}