public class Constructors {
    String name;
    int a;
    Constructors()
    {
        //Default Constructors
        name = "abc";
        a =560;
    }
    Constructors(String str,int n)
    {
        //Parameterized Constructors
        name = str;
        a = n;
    }
    //Constructors have no return type

    public static void main(String[] args)
    {
        Constructors def = new Constructors();
        Constructors par = new Constructors("rajesh",890);

        System.out.println(def.name);
        System.out.println(def.a);

        System.out.println(par.name);
        System.out.println(par.a);

    }
}
