public class Main{
	public static void main(String args[ ]) {
        Human taro = new Human( );
        taro.name = "太郎";            //taroの名前
        taro.age = 30;                 //taroの年齢
        taro.height = 175.5;           //taroの身長
        System.out.println(taro.name);
        System.out.println(taro.age);
        System.out.println(taro.height);
    }
}  

class Human {
    String name;        //フィールド
    int age;           //フィールド
    double height;     //フィールド
}