package Inheritance;

class P{
    int a =10;
    void display()
    {
        System.out.println("Parent Class");
    }

}
class Single extends P
{
    int b =20;
    void show()
    {
        System.out.println("Child Class");
    }
};

public class SingleInheritance {

    public static void main(String[] args){
            Single obj = new Single();

        System.out.println(obj.b);
        obj.show();
        System.out.println(obj.a); //a is inherited through Single
        obj.display();
    }

};
