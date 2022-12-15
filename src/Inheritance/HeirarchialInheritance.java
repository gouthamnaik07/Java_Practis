package Inheritance;

class Aa
{
    int a= 50;

    void dis()
    {
        System.out.println("i have 2 daughters and accesed by Ab and Ac");
    }
}

class Ab extends Aa
{
    int b =20;

    void ok()
    {
        System.out.println("Its okay");
    }
}

class Ac extends Aa
{
    int c =30;

    void ik()
    {
        System.out.println("it all good");
    }
}

public class HeirarchialInheritance {

    public static void main(String[] args)
    {
        Ab obj1 = new Ab();
        Ac obj2 = new Ac();

        System.out.println(obj1.a);
        obj1.dis();
        System.out.println(obj1.b);
        obj1.ok();
        System.out.println(obj2.a);
        obj2.dis();
        System.out.println(obj2.c);
        obj2.ik();
    }
}
