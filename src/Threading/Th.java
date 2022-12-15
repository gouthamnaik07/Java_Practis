package Threading;

class Tp extends Thread
{
    public void run()
    {
        Thread t = currentThread();
        System.out.println("Thread Status "+t.isAlive());
        for(int i=0; i<=5; i++)
        {
            try{
                t.sleep(1000);
            }
            catch (Exception e)
            {

            }
            System.out.println(i);
        }
    }
}

public class Th {
    public static void main(String[] args) {
        Tp t1 = new Tp();
        Tp t2 = new Tp();
        System.out.println("ID = "+t1.getId());
        System.out.println("Name of thread is "+t1.getName());
        t1.setName("Gotham");
        System.out.println("Name of thread is "+t1.getName());
        System.out.println("Priority of thread is "+t1.getPriority());
        t1.setPriority(1);
        System.out.println("Changed priority "+ t1.getPriority());
        t1.start();
        try{
            t1.join();
        }
        catch (Exception e)
        {

        }
        System.out.println("Thread 1 Status "+t1.isAlive());
        t2.start();
    }
}
