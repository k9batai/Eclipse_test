class Animal
{
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
}

class Cat extends Animal
{
    public void Sleep()
    {
        System.out.println( "スースー" );
    }
}

public class Exercise7
{
    public static void main( String[] args )
    {
        Cat MyCat = new Cat();

        MyCat.Name = "たま";
        MyCat.Age = 3;
        MyCat.ShowProfile();
        MyCat.Sleep();
    }
}