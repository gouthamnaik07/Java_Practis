package Inheritance;

class Pp{
    void diss()
    {
        System.out.println("Parent Method");
    }

}

class Ch extends Pp{
    void diss()
    {
        super.diss();
        System.out.println("Child method");
    }
}

// over-rided - method name ,parameters , return type
//Run time polymorphism
public class MethodOverriding {

    public static void main(String[] args)
    {
            Ch obj = new Ch();
            obj.diss();

            Pp obj2 = new Pp();
            obj2.diss();
    }

}
