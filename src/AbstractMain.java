abstract class Aaa
{
    abstract void display();
}

abstract class Bbb extends Aaa
{
    void display()
    {
        System.out.println("Abstract Method in Aaa");
    }
}

class Ccc extends Bbb{
    void show()
    {
        System.out.println("Show method in Ccc");
    }
}


public class AbstractMain {
    public static void main(String args[])
    {
        Ccc obj = new Ccc();
        obj.display();
        obj.show();
    }
}
