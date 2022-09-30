
public class Main2 {
	public static void main(String[] args) {
		Robot exRobot = new Robot();
		exRobot.color = "青";
		System.out.println(exRobot.color);
		exRobot.hello();
		exRobot.getColor();
		
		Robot exRobot2 = new Robot();
		exRobot2.color = "赤";
		exRobot2.getColor();
		
		Robot exRobot3 = new Robot();
		exRobot3.color = "黄色";
		exRobot3.getColor();
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

