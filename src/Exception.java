public class Exception {
    void disp()
    {
        try
        {
            //int a = 5/0;
            int b[] = new int[5];
            b[6] = 45;
        }
        catch (ArrayIndexOutOfBoundsException e)
        //catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Exception handled");
    }
}
class Except
{
    public static void main(String[] args) {
        Exception obj = new Exception();
        obj.disp();
    }
}