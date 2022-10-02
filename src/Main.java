class Main {
    public static void main(String[] args) {
        //インスタンス化

        Car car = new Car(70,10); 		//燃料70Lℓ、燃費10km/Lを設定
        car.run(50);			//50km走行する
        car.dispFuelGauge();    	//燃料計を表示
    }
}

class Car{
    //フィールド
    private int fuel;           //燃料
    private int consumption;    //燃費

    //コンストラクタ（初期値を設定）
    Car(int fuel,int consumption){
        this.fuel = fuel;
        this.consumption = consumption;
    }

    //メソッド
    //運転
    public void run(int mileage){
        this.fuel -= mileage / consumption;
    }

    //燃料計の表示
    public void dispFuelGauge(){
        System.out.println("残量：" + this.fuel + "L");

    }
}