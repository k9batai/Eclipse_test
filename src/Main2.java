
public class Main2 {
	public static void main(String[] args) {
		Robot exRobot = new Robot();
		exRobot.color = "青";
		System.out.println(exRobot.color);
	}
}

class Robot {
	String color;
	
	public void hello() {
		System.out.println("こんにちは");
	}
	
	public void getColor() {
		System.out.println(this.color);
	}
}

