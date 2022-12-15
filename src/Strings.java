public class Strings {
    String s = "Goallessh"; //intialization of String method 1
    String str = new String("  I am Loving Java ! . ");

    public static void main(String[] args) {
                        Strings obj = new Strings();
                        System.out.println(obj.str.length());
                        System.out.println(obj.str.toLowerCase());
                        System.out.println(obj.str.charAt(5));
                        System.out.println(obj.str.concat(obj.s));
                        System.out.println(obj.str.compareTo(obj.s));
                        System.out.println(obj.s.replace("Go","the"));
                        System.out.println(obj.s.indexOf(6));
                        System.out.println(obj.str.trim());

    }
}