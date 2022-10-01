public class Main {
    public static void main(String[] args) {
        // Employeeクラスのオブジェクトを作成
        Employee employee = new Employee();
        // Employeeオブジェクトに社員番号と社員名をセット
        employee.setDate(1234, "山田");
        // Employeeオブジェクトの社員番号を出力
        System.out.println("社員番号：" + employee.getId());
        // Employeeオブジェクトの社員名を出力
        System.out.println("社員名：" + employee.getName());
        
        // 1匹目のペットオブジェクトの生成
        Pet2 pet1 = new Pet2();
        
        // 1匹目のペットデータを設定
        pet1.setType("犬");
        pet1.setName("コタロー");
        pet1.setAge( (byte)2 );
        pet1.setGender(true);
        
        // 2匹目のペットオブジェクトの生成
        Pet2 pet2 = new Pet2();

        // 2匹目のペットのデータを設定
        pet2.setType("猫");
        pet2.setName("ミー");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        // 2匹のペットの紹介文を取得し、表示する
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());
    }
}

class Employee {
	private int id;
	private String name;
	
	public void setDate(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}

class Pet2 {
	private String type;
	private String name;
	private byte age;
	private boolean gender;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String getIntroduction() {
        String tmp;
        tmp = type + "の" + name + "は";
        if(gender) {
            tmp += "メス";
        } else {
            tmp += "オス";
        }
        tmp += "で" + age + "歳です。";
        return tmp;
    }
}