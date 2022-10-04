public class VariablePractice {
	public static void main(String[] args) {
        // 1台目の車インスタンス生成
        Car car1 = new Car("トント", 1234, 10.0);
        // 2台目の車インスタンス生成
        Car car2 = new Car("ファット", 6789);
        // 2台の車を走行させる
        car1.run(7.0);
        car2.run(7.0);
        // 2台の車の情報を出力
        car1.showInfo();
        car2.showInfo();
        
     // ロボット総生産数の表示
        System.out.println("ロボット総生産数：" + Robot2.getTotal());
        // 5体のロボットオブジェクトを作成
        // （6体目は保留）
        Robot2[] robots = {
                new Robot2("RX"),
                new Robot2("PZ"),
                new Robot2("SS"),
                new Robot2("FG"),
                new Robot2("VC"),
                null
        };
        // ロボット総生産数の表示
        System.out.println("ロボット総生産数：" + Robot2.getTotal());
        // 6体目のロボットオブジェクトを作成
        robots[5] = new Robot2("SUPER-Z");
        // ロボット総生産数の取得
        System.out.println("ロボット総生産数：" + Robot2.getTotal());
        System.out.println();
        // 6体のロボットの情報を表示
        for(int i = 0; i < robots.length; i++) {
            robots[i].introduce();
        }
    }

}

class Car {
	private String type;
	private int number;
	private double gasoline;
	
	public Car(String type, int number, double gasoline) {
		this.type = type;
		this.number = number;
		this.gasoline = gasoline;
	}
	
	public Car(String type, int number) {
		this(type, number, 5.0);
	}
	
	public void run(double runGasoline ) {
		if(runGasoline >= gasoline) {
			System.out.println("ナンバー" + number+ "の" + type + "はガソリン不足のため走行できません");
		} else {
			System.out.println("ナンバー" + number + "の" + type +
                    "はガソリン" + runGasoline + "リットル分走行しました");
            // 走行分だけガソリンを減らす
            gasoline -= runGasoline;
		}
	}
	
	public void showInfo() {
		System.out.println("車種：" + type + "ナンバー：" + number + "ガソリン：" + gasoline);
	}
}

class Robot2 {
	private int id;
	private String  name;
	private static int total;
	
	public Robot2(String name) {
		this.name = name;
		
		total ++;
		this.id = total;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public void introduce() {
        System.out.println("ID：" + id + " NAME：" + name);
    }
}
