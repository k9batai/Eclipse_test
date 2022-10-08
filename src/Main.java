public class Main{
	public static void main(String args[ ]) {
        Human taro = new Human( );
        taro.name = "太郎";            //taroの名前
        taro.age = 30;                 //taroの年齢
        taro.height = 175.5;           //taroの身長
       
        taro.selfIntroduce( );
    }
}  

class Human {
    String name;        //フィールド
    int age;           //フィールド
    double height;     //フィールド
    
    void selfIntroduce( ){
        System.out.println("私の名前は" + name + "です");
        System.out.println("私の年齢は" + age + "です");
        System.out.println("私の身長は" + height + "です");
    }
}