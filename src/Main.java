import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String inputStr = scan.next();//ここでコンソールに入力したものを取得
    System.out.println("コンソールに入力された文字は、「" + inputStr + "」です。");
  }

}