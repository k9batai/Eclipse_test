class Dog
{
    private String Name;
    private int Age;

    public void SetName( String nm )
    {
        Name = nm;
    }
    
    public void SetAge( int ag)
    {
    	Age = ag;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
}

public class Exercise5
{
    public static void main( String[] args )
    {
        Dog MyDog1 = new Dog();
        Dog MyDog2 = new Dog();

        MyDog1.SetName( "ぽち" );
        MyDog1.SetAge( 3 );
        MyDog2.SetName("ジョン");
        MyDog2.SetAge(4);
        MyDog1.ShowProfile();
        MyDog2.ShowProfile();
    }
}