public class Main {
	 public static void main(String[ ] args){
	        //基本データ型のデータを宣言
	        int a = 10;
	        //オブジェクトを宣言
	        MyObject obj = new MyObject( );
	        //それぞれの変数を渡す
	        foo(a, obj);
	        System.out.println(a);
	        System.out.println(obj.x);
	    }
	    public static void foo(int a, MyObject obj){
	        //基本データ型のデータを変更
	        a++;
	        //オブジェクト内のデータを変更
	        obj.x++;
	    }
}  

class MyObject {
    public int x = 20;
}
