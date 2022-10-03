class Main {
	public static void main(String[] args) {
        // シェフオブジェクトの生成
        Chef chef = new Chef();
        // 食材オブジェクトの生成
        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();
        // シェフがフルコースを調理します
        System.out.println("1品目は" + chef.cook(egg, cheese) + "です");
        System.out.println("2品目は" + chef.cook(rice, egg) + "です");
        System.out.println("3品目は" + chef.cook(rice, cheese) + "です");
        System.out.println("4品目は" + chef.cook(milk, egg) + "です");
        
        // Squareクラスのオブジェクトを作成
        Square square = new Square(4.5, 2.8);
        // 四角形の情報を出力
        square.inform();
        // 面積の表示
        System.out.println("この四角形の面積は" + square.getArea() + "です。");
        // 幅を3.0増加させる
        square.addWidth(3.0);
        System.out.println();
        // 四角形の情報を出力
        square.inform();
        // 面積の表示
        System.out.println("この四角形の面積は" + square.getArea() + "です。");
    }
}


//各種食材クラス
class Egg{}
class Rice{}
class Milk{}
class Cheese{}
//Chefクラス
class Chef {
 // 調理メソッド
 public String cook(Egg egg, Cheese cheese) {
     return "スクランブルエッグ";
 }
 // 調理メソッド
 public String cook(Rice rice, Egg egg) {
     return "オムライス";
 }
 // 調理メソッド
 public String cook(Rice rice, Cheese cheese) {
     return "リゾット";
 }
 // 調理メソッド
 public String cook(Milk milk, Egg egg) {
     return "プディング";
 }
}

class Square {
	// 幅
    private double width;
    // 高さ
    private double height;
 // コンストラクタ
    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }
 // 情報出力メソッド
    public void inform() {
        System.out.println("この四角形の幅は" + width + "、高さは" +
                    height + "です。");
    }
    // 面積算出メソッド
    public double getArea() {
        return width * height;
    }
    // 幅増加メソッド
    public void addWidth(double delta) {
        width += delta;
    }
}

