package Threading;

class Single extends Thread{
    public void run()
    {
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}

public class SingleThread {
    public static void main(String[] args) {
        Single t = new Single();
        t.start();

    }
}
