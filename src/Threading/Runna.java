package Threading;

import java.util.*;

class Singles implements Runnable
{
    public void run()
    {
        int i;
        for ( i =0; i<=5; i++)
        {
            System.out.println(i);
        }
    }
}

public class Runna {

    public static void main(String[] args) {
        Singles s = new Singles();
        Thread t = new Thread();
        t.run();


    }
}
