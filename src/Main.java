public class Main{
    public static void main(String[ ] args){
    	 returnTest(2); // メソッドの呼び出し。問題のない引数
         returnTest(-1);    // メソッドの呼び出し。問題のある引数
         
         int times = 10;
         String msg = "こんにちは、Java";
         // メソッドの呼び出し
         printMessage(msg, times);
         
         int i = 10;
         executeCalcSigma(i);    // メソッドを呼び出し 
         executeCalcSigma(30);  // 別の引数でメソッドを呼び出し
         
         int ret, data = 10;
         ret = max(data, 30);
         System.out.println("戻り値は : " + ret);
    }
    
    static void returnTest(int i){
        System.out.println("メソッドが呼ばれました。引数は" + i + "です");
        if(i < 0){    // まず、引数に問題がないか検査
            System.out.println("\t引数の値は０以上にしてください");
            return;       // ここでメソッドを終了
        }
        System.out.println("\t問題のない引数");
        return;       // return を省略せずに記述
    }
    
    static void printMessage(String str, int i){
        for(int j = 0; j < i; j++){
            System.out.println(str);
        }
    }
    
    static void executeCalcSigma(int i){
        int ans = 0;
        for(int j = i; j != 0; j--){
            ans += j;
        }
        System.out.println("答えは : " + ans +"です");
    }
    
    static int max(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }
}