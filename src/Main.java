public class Main{
	public static void main(String args[ ]) {
        Human taro = new Human( );
        taro.setName("太郎");
        taro.setAge(30);
        taro.setHeight(175.5);  
       
        taro.selfIntroduce( );
    }
}  

class Human {
    private String name;        //フィールド
    private int age;           //フィールド
    private double height;     //フィールド
    
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