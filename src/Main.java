public class Main {
    public static void main(String[] args) {
        // 投手オブジェクトの生成
        Pitcher p = new Pitcher("山田", 99, 0.09, 2.13);
        // 投手の紹介
        p.introduce();
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

