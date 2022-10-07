public class VariablePractice {
	public static void main(String[] args) {
		System.out.println("一回目：引数1つで呼ぶ");
        variableArgs("A");
        System.out.println("二回目：引数2つで呼ぶ");
        variableArgs("A","B");
        System.out.println("三回目：引数3つで呼ぶ");
        variableArgs("A","B","C");
        
        variableArgs2(1, "Apple");
        System.out.println();
        variableArgs2(2, "Apple","Banana");
        System.out.println();
        variableArgs2(3, "Apple","Banana","Orange");
        System.out.println();
    }
	
	 //可変長引数をもつメソッドの定義
    public static void variableArgs(String... str) {
        for(String s : str) {
            System.out.println(s);
        }
    }
    
    public static void variableArgs2(int num, String... str){
        System.out.println("Stringの引数の数：" + num + "個" );
        for(String s : str){
            System.out.println(s);
        }
    }
    
  //明確に引数を指定したメソッドの定義
    public static void variableArgs2(int num, String str){
        System.out.println("引数を明確に定義したメソッドがよびだされました");
    }

}

