
public class Test {
	public static void main(String[] args) {
		// 変数namesに、配列を代入してください
	    String[] names1 = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
	    
	    // インデックス番号が0の要素を出力してください
	    System.out.println(names1[0]);
	    
	    names1[2] = "子犬";
	    
	    // インデックス番号が2の要素を出力してください
	    System.out.println(names1[2]);
	    
	    String[] names2 = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
	    
	    // for文を用いて、「私の名前は◯◯です」と出力してください
	    for (int i = 0; i < names2.length; i++) {
	    	System.out.println("私の名前は" + names2[i] + "です");
	    }	
	      
	    for (String name: names2) {
	    	System.out.println("私の名前は" + name + "です");  
	    }
	    
	    // 変数numbersに、与えられた数字の配列を代入してください
	    int[] numbers = {1, 4, 6, 9, 13, 16};
	    
	    int oddSum = 0;
	    int evenSum = 0;
	    
	    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
	    for (int number: numbers) {
	      if (number % 2 == 0) {
	        evenSum += number;
	      } else {
	        oddSum += number;
	      }
	    }

	    System.out.println("奇数の和は" + oddSum + "です");
	    System.out.println("偶数の和は" + evenSum + "です");
	}
}
