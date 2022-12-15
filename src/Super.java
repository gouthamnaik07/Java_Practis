class P
{
    int a = 20;
    P()
    {
        System.out.println("Parent Constructor");
    }
    void Dis()
    {
        System.out.println("Parent");
    }
}

class Cc extends P
{
    /* super() implicitly called by JVM  */
    int a = 40;

    Cc()
    {
        System.out.println("Child Constructor");
    }
    void Dis()
    {
        System.out.println("Child");
        System.out.println(a);
        System.out.println(super.a);
        super.Dis();
    }
}



public class Super {

    public static void main(String[] args)
    {
        Cc obj = new Cc();
        obj.Dis();

    }

}
