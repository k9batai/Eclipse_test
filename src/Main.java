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

}