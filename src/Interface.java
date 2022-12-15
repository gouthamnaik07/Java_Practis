interface I{
    void Adisplay();
    void Ashow();
}
interface J{
    void Bdisplay();
    void Bshow();
}

class AB implements I,J
{
    public void Adisplay()
    {
        System.out.println("A display");
    }
    public void Ashow()
    {
        System.out.println("A show");
    }

    public void Bdisplay() {
        System.out.println("B display");
    }

   public void Bshow() {
        System.out.println("B show");
    }

}

public class Interface {

    public static void main(String args[])
    {
        AB obj = new AB();
        obj.Adisplay();
        obj.Ashow();
        obj.Bdisplay();
        obj.Bshow();
    }

}

