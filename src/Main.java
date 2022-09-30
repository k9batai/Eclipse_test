public class Main {

    public static void main(String[] args) {
    	int addNum = add(5, 2);
    	System.out.println("答えは" + addNum + "です");
    	
    	boolean b = divide5(21);
    	if(b) {
    		System.out.println("割り切れます。");
    	} else {
    		System.out.println("割り切れません。");
    	}
    	
    	String[] arrays1 = {"a", "b", "c"};
		System.out.println(getFirstString(arrays1));
 
		String[] arrays2 = {};
		System.out.println(getFirstString(arrays2));
		
		int num1 = 2;
		int num2 = 3;
 
		Calculation calc = new Calculation();
		Calculation value = calc.calcMethod(num1, num2);
 
		System.out.println("足し算：" + value.add);
		System.out.println("掛け算：" + value.mul);

    }

    private static int add(int num1, int num2) {
        int addAns = num1 + num2;
        return addAns;
    }
    
    private static boolean divide5(int num1) {
    	int ans = num1 % 5;
    	if(ans == 0) {
    		return true;
    	}
    	return false;
    }
    
    private static String getFirstString(String[] arrays) {
    	if(arrays == null || arrays.length == 0) {
    		return null;
    	}
    	return arrays[0];
    }

}

class Calculation {
	int add;
	int mul;
 
	public Calculation calcMethod(int num1, int num2) {
		Calculation calc = new Calculation();
		calc.add = num1 + num2;
		calc.mul = num1 * num2;
 
		return calc;
	}
}