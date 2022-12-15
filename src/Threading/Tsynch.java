package Threading;

import java.io.*;

class Exm {
    //synchronized void disl()
    void disl() {
        Thread g = Thread.currentThread();
        synchronized (this) {
            for (int i = 0; i <= 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(g.getName() + " " + i);
                } catch (Exception e) {

                }
            }
        }
    }
}

class T extends Thread {
    Exm e;

    T(Exm e) {
        this.e = e;
    }

    public void run() {
        e.disl();
    }
}

public class Tsynch {
    public static void main(String args[]) {
        Exm ex = new Exm();
        T t1 = new T(ex);
        T t2 = new T(ex);
        T t3 = new T(ex);
        t1.start();
        t2.start();
        t3.start();
    }
}
