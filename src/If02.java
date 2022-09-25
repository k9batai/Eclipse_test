
public class If02 {
	public static void main(String[] args) {
		hello("ジョン", 30);
		dog("ぽち");
	}
	
	public static void hello(String name, int age) {
		// "Hello World"を、"Hello Java"に書き換えてください
		System.out.println(name + "です" + age + "歳です。");
	}
	
	public static void dog(String name) {
		System.out.println("愛犬の名前は" + name + "です");
	}
}
