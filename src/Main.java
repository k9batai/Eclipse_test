public class Main {
    public static void main(String[] args) {
        // Magazineクラスのオブジェクトを生成
        Magazine magazine = new Magazine("東京Runner", 650, "上野彩");
        // 雑誌の内容紹介メソッドの呼び出し
        magazine.show();
    }
}
// Bookクラス
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

