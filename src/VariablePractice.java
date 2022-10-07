public class VariablePractice {
	public static void main(String[] args) {
		System.out.println("一回目：引数1つで呼ぶ");
        variableArgs("A");
        System.out.println("二回目：引数2つで呼ぶ");
        variableArgs("A","B");
        System.out.println("三回目：引数3つで呼ぶ");
        variableArgs("A","B","C");
    }
	
	 //可変長引数をもつメソッドの定義
    public static void variableArgs(String... str) {
        for(String s : str) {
            System.out.println(s);
        }
    }

}

