public class Main {
    public static void main(String[] args) {
    	// 3匹の動物たちを表すAnimal配列型変数animalsの宣言と
        // 配列オブジェクトの生成
        Animal2[] animals = new Animal2[3];
        // 動物たち配列変数の各要素に、順番に犬・猫・鳥
        // オブジェクトを生成・代入
        animals[0] = new Dog2();
        animals[1] = new Cat2();
        animals[2] = new Bird();
        // forループを使って動物たち配列変数を順にみていき、
        // 各動物の歌うsingメソッドの呼び出し
        for(int i = 0; i < animals.length; i++) {
            animals[i].sing();
        }
    }
}
// 動物クラス
abstract class Animal2 {
    public abstract void sing();
}
//犬クラス
class Dog2 extends Animal2 {
 public void sing() {
     System.out.println("わんわん");
 }
}
//猫クラス
class Cat2 extends Animal2 {
 public void sing() {
     System.out.println("にゃーにゃー");
 }
}
//鳥クラス
class Bird extends Animal2 {
 public void sing() {
     System.out.println("ぴよぴよ");
 }
}