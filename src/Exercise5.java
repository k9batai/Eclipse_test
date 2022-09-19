class Dog
{
    private String Name;
    private int Age;
    private String Kind;
    
    public Dog( String kd)
    {
    	Kind = kd;
    }

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
        System.out.println( Kind + "で名前は、" + Name + "、" + Age + "歳です。" );
    }
}

public class Exercise5
{
    public static void main( String[] args )
    {
        Dog MyDog1 = new Dog("秋田県");
       
        MyDog1.SetName( "ぽち" );
        MyDog1.SetAge( 3 );
        MyDog1.ShowProfile();
    }
}