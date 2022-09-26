
public class VariablePractice {
	public static void main(String[] args) {
		int price;
		price = 130; 
		
		int num = 6;
		
		int allNum = price * num;
		
		System.out.println(price);
		
		System.out.println(num);
		
		System.out.println(allNum);
		
		// 5 と 6 と 7 を足した合計に 8 を掛けた値は？
        System.out.println((5 + 6 + 7)* 8);
        // 7 と 8 を足した値を 5 で割った値に、
        // 6 から 4 を引いた値に 2 を掛けた値を足した値は？
        System.out.println((7 + 8)/ 5 + (6 - 4)* 2);
        // 1000 を 7 で割ったあまりは？
        System.out.println(1000 % 7);
        // 6 を 5 で割った値を、さらに 2 で割った正確な値は？
        System.out.println(6.0 / 5 / 2);
        // アルファベットの大文字 'A' に 32 を足した文字は？
        System.out.println( (char)('A' + 32) );
        
        // short型の変数 s1 を宣言し、65 を代入してください。
        short s1 = 65;
        
        // s1 の値を出力してください。
        System.out.println(s1);
        
        // byte型の変数 b を宣言し、変数 s1 の値を代入してください。
        byte b = (byte)s1;
        
        // b の値を出力してください。
        System.out.println(b);
        
        // char型の変数 c を宣言し、変数 b の値を代入してください。
        char c = (char)b;
        
        // c の値を出力してください。
        System.out.println(c);
        
        // short型の変数 s2 を宣言し、変数 s1 と b を足した値を代入してください。
        short s2 = (short)(s1 + b);
        
        // s2 の値を出力してください。
        System.out.println(s2);
        
        
        
     // 整数変数の宣言と初期化
        int value = 12;        // ←値を変更しながら実行
        System.out.println("value：" + value);
        // if文の開始
        if (value % 2 == 0) {
        	System.out.println("偶数です");	
        } else {
        	System.out.println("奇数です");
        }
        if (value % 3 == 0) {
        	System.out.println("3の倍数です");
        } 
        if (value % 4 == 0) {
        	System.out.println("4の倍数です");
        }
        if (value % 5 == 0) {
        	System.out.println("5の倍数です");
        }
	}	

}
