public class Exercise1 {
	public static void main( String[] args )
    {
        Dog2 MyDog = new Dog2();

        MyDog.SetName( "ぽち" );
        MyDog.ShowProfile();
    }
}

class Dog2
{
    private String Name;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
    }
}
