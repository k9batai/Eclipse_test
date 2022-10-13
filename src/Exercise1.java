public class Exercise1 {
	public static void main( String[] args )
    {
        Dog2 MyDog = new Dog2("秋田犬");
        Dog2 MyDog2 = new Dog2("秋田犬");

        MyDog.SetName( "ぽち" );
        MyDog.SetAge( 3 );

        MyDog2.SetName( "たま" );
        MyDog2.SetAge( 6 );
        
        MyDog.ShowProfile();
        MyDog2.ShowProfile();
    }
}

class Dog2
{
    private String Name;
    private int Age;
    private String  Kind;
    
    public Dog2( String kd )
    {
        Kind = kd;
    }

    public void SetName( String nm )
    {
        Name = nm;
    }
    
    public void SetAge( int ag )
    {
        Age = ag;
    }

    public void ShowProfile()
    {
        System.out.println( Kind +"で名前は、" + Name + "、" + Age + "歳です。" );
    }
}
