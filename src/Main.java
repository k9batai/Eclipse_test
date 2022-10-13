public class Main {
	public static void main(String[ ] args){String[ ] a = new String[3];
		Salaryman taro = new Salaryman("太郎", 30, 175.5, 30, 60);
		//Humanクラスのメソッド
		taro.selfIntroduce( );
		//Salarymanクラスのメソッド
		int income = taro.getIncome( );
		System.out.println("収入は" + income + "です");
    }
}  

class Human{
    private String name;
    private int age;
    private double height;
    public Human( ){
        System.out.println("引数なしコンストラクタが呼ばれました！");
    }
    public Human(String n, int a, double h){
        this( );
        System.out.println("引数ありコンストラクタが呼ばれました！");
        name = n;
        age = a;
        height = h;
    }
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }
    public void setHeight(double h){
        height = h;
    }
    public void selfIntroduce( ){
        System.out.println("私の名前は" + name + "です");
        System.out.println("私の年齢は" + age + "です");
        System.out.println("私の身長は" + height + "です");
    }
}

class Salaryman extends Human{
    private int salary;
    private int bonus;
    public Salaryman( ){
        System.out.println("Salarymanクラスの引数なしコンストラクタが呼ばれました！");
    }
    public Salaryman(String n, int a, double h, int s, int b){
        System.out.println("Salarymanクラスの引数ありコンストラクタが呼ばれました！");
            setName(n);
            setAge(a);
            setHeight(h);
            salary = s;
            bonus = b;
        }
    public int getIncome( ){
        return salary * 12 + bonus * 2;
    }
}
