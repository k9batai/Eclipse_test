public class Exercise1 {
	public static void main( String[] args )
    {
        Dog2 MyDog = new Dog2();

        MyDog.SetName( "ぽち" );
        MyDog.SetAge( 3 );
        MyDog.ShowProfile();
    }
}

class Dog2
{
    private String Name;
    private int Age;

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
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
}
