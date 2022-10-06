public class Main{
    public static void main(String[ ] args){
    	 returnTest(2); // メソッドの呼び出し。問題のない引数
         returnTest(-1);    // メソッドの呼び出し。問題のある引数
         
         int times = 10;
         String msg = "こんにちは、Java";
         // メソッドの呼び出し
         printMessage(msg, times);
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
}