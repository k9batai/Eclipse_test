public class ForBasicPractice {
    public static void main(String[] args) {
        // for文の開始
    	for (int i = 21; i <= 29; i++) {
    		for (int j = 3; j <=9; j++) {
    			if (i % j == 0) {
    				System.out.println(i + "は" + j + "の倍数です");
    			}
    		}
    	}
    	
    	 // 山の段数を表す変数
        int level = 5;
        // for文の開始
        for(int i = 0; i < level; i++) {
            for(int j = 0; j < level - i - 1; j++) {
                System.out.print("　");
            }
            for(int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("■");
            }
            System.out.println();
        }
    }
}