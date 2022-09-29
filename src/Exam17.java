
public class Exam17 {
	public static void main(String[] args) {
		int number1 = 25;
		int number2 = 2;
		String operator = "/";
		
		System.out.print(number1 + operator + number2 + "=");
		System.out.println(number1 / (double)number2);
		
		int price = 980;
		int tax_rate = 8;
		
		System.out.println( (int)(price + (price * tax_rate * 0.01) ) );
	}

}
