package Constractor;

public class parameterized_constructor {
    String n;
    String p;
    String o;
    String r;
    String m;

    parameterized_constructor() {
        n = "Iphone";
        p = "intel 17 v3";
        o = "android 1.0 ";
        r = "16gb ram";
        m = "256 gb";
    }

    void print(){
        System.out.println("Name : " +n);
        System.out.println("Proccessor : "+p);
        System.out.println("Operating system : " + o);
        System.out.println("Ram : "+r );
        System.out.println("memory : "+m);
    }
    public static void main (String arg[]){
        parameterized_constructor obj = new parameterized_constructor ();
        obj.print();
    }
}
