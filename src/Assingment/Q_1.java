package Assingment;

/*
    Keywords:
        Class, initialization, object, instance, No Argument Constructor, Parameterized Constructor
        Memory Locations
 */
public class Q_1 {
    double mark1;
    double mark2;
    double mark3;
    String s1;
    boolean b1;
    char c1;
    byte oi;

    Q_1() {
        this.mark1 = 10;
        this.mark2 = 20;
        this.mark3 = 0;
    }


    Q_1(double mark1, double mark2) {
        this.mark1 =mark1;
        this.mark2 =mark2;
    }

    Q_1(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public static void main(String[] args) {
        Q_1 obj1 = new Q_1();       //  Object initialization
//        Q_2 obj5 = new Q_1();       //  Object initialization
//        Q_1 obj4 = new Q_2();       //
        Q_1 obj2 = new Q_1(76, 98, 56);
        Q_1 obj3 = new Q_1(20, 80);



/* ctrl + shift + /
   memory locations

   obj1
         mark1= 10;
         mark2 = 20;
         mark3 = 0;


    obj2
        mark1= 76;
        mark2 = 98;
        mark3 = 56;

    obj3
       mark1= 20;
       mark2 = 80;
*/

        System.out.println(obj2.mark2);         //  98
        System.out.println(obj2.mark3);         //  56
        System.out.println(obj1.mark2);         // 20
        System.out.println(obj3.mark1);         // 10
        System.out.println(obj3.mark3);         // 0
        System.out.println(obj3.mark2);         // 80

    }
}

class Child1 extends Father {

}