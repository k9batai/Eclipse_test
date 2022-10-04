public class Main {
    public static void main(String[] args) {
        // 投手オブジェクトの生成
        Pitcher p = new Pitcher("山田", 99, 0.09, 2.13);
        // 投手の紹介
        p.introduce();
        
        
     // Magazineクラスのオブジェクトを生成
        Magazine magazine = new Magazine("東京Runner", 650, "上野彩");
        // 雑誌の内容紹介メソッドの呼び出し
        magazine.show();
    }
}
// 野球選手クラス
class BaseballPlayer {
    // 選手名
    protected String name;
    // 背番号
    protected int uniformNumber;
    // 打率
    protected double battingAverage;
}

class Pitcher extends BaseballPlayer {
	private double era;
	
	public Pitcher(String name, int uniformNumber, double battingAverage, double era) {
		this.name = name;
        this.uniformNumber = uniformNumber;
        this.battingAverage = battingAverage;
        this.era = era;
	}
	
	public void introduce() {
		System.out.println("選手名：" + name);
	    System.out.println("背番号：" + uniformNumber);
	    System.out.println("打率　：" + battingAverage);
	    System.out.println("防御率：" + era);
	}
}


//Bookクラス
class Book {
 // タイトル
 private String title;
 // 価格
 private int price;
 // コンストラクタ
 public Book(String title, int price) {
     this.title = title;
     this.price = price;
 }
 // タイトル取得メソッド
 public String getTitle() {
     return title;
 }
 // 価格取得メソッド
 public int getPrice() {
     return price;
 }
}

class Magazine extends Book {
	private String coverPersonName;
	
	public Magazine(String title, int price, String coverPersonName ) {
		super(title, price);
		this.coverPersonName = coverPersonName;
	}
	
	public void show() {
        System.out.println(getTitle() + "絶賛発売中！！");
        System.out.println("定価" + getPrice() + "円");
        System.out.println("今回の表紙：" + coverPersonName + "さん");
    }
}