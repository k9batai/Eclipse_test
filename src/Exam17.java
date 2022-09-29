
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
		
		int price2 = 9260;
		int discount_rate = 33;
		char day_of_week = '土';
		int day_of_month = 1;
		
		if (day_of_week == '土') {
			System.out.println(discount_rate *= 1.2);
		} else if (day_of_week == '土' && (day_of_month == 5 || day_of_month == 15 || day_of_month == 25) ){
			System.out.println(discount_rate *= 1.5);
		}
		
		//変数宣言
	     int money = 3000;
	     int meal_price = 2300;
	     int current_money = money - meal_price;
	     
	     //宣言した変数を利用して表示
	     System.out.println("残金は" + current_money + "円です");
	 
	     //条件分岐
	     if(current_money >= money * 0.6){
	        System.out.println("残金には余裕があります");
	     }else if(current_money >= money * 0.3){
	        System.out.println("残金が少なくなっています");
	     }else{
	        System.out.println("残金があと少しです");
	     }
	     
	     int[] numbers = {10,18,33,92,47};
	     int result = 1;
	     int power = 3;
	     for(int i = 0; i < numbers.length; i++) {
	    	 result = 1;
	    	 for(int j = 0; j < power; j++) {
	    		 result *= numbers[i];
	    	 }
	    	 System.out.println(result + " ");
	     }
		
		
		
		
		
	}

}
