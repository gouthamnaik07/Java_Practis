package Inheritance;

class A //parent
{
    int a = 80;
    void show()
    {
        System.out.println("Im the parent ie the biggest and oldest");
    }
}
class B extends A //Child
{
    int b = 50;

    void display()
    {
        System.out.println("Im b and Im the father of c and my father is A");
    }
}

class C extends B //Grand Child
{
    int c = 20;
    void ethul()
    {
        System.out.println("Im the smallest c");
    }
}
public class MultilevelInheritance {

    public static void main(String args[])
    {
        System.out.println("First object will be created and then all the calls are made");
        C ob = new C();
        System.out.println(ob.c);
        ob.ethul();
        System.out.println(ob.b);
        ob.display();
        System.out.println(ob.a);
        ob.show();

    }

}
