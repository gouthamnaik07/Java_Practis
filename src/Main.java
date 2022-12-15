import java.util.Scanner;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class A{
     //A obj = new A();
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
     int a = sc.nextInt(); //Instance variable
     static float b = 25; //static variable
     double c = sc.nextDouble();

     public static void main(String[] args){
         A obj = new A();//creation of object to call instance variable
         System.out.println(obj.a);
         System.out.println(obj.name);
         System.out.println(b);
         System.out.println(obj.c);

     }


}