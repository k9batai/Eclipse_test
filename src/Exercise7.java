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

class Dog1 extends Animal
{
    public void Run()
    {
        System.out.println( "トコトコ" );
    }
}

public class Exercise7
{
    public static void main( String[] args )
    {
        Cat MyCat = new Cat();
        Dog1 MyDog = new Dog1();

        MyCat.Name = "たま";
        MyCat.Age = 3;
        MyDog.Name = "ぽち";
        MyDog.Age = 4;
        MyCat.ShowProfile();
        MyDog.ShowProfile();
        MyCat.Sleep();
        MyDog.Run();
    }
}