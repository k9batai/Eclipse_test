
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int x = 11;
		System.out.println("x=" + x);
		
		x = 13;
		int y = 17;
		System.out.println("x=" + x + "y=" + y);
		
		x = 13 + 17;
		System.out.println(x);
		System.out.println(13*17);
		
		x = 7;
		x *= 3;
		System.out.println(x);
		
		x = 21 / 2;
		System.out.println(x);
		
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("x=" + x + ",y=" + y);
		
		x = 19;
		y = 23;
		int z = x * y;
		System.out.println(z);
		
		
	}
}
