package inheritance;

class Father {
    void area(int a) {
        System.out.println("The  father");
    }
}


class Child1 extends Father {
    void area(int a) {
        System.out.println(" A :  " + a);
    }
}

class Child2 extends Father {
    void area(int a, int b) {
        System.out.println("A : " + a);
        System.out.println("B : " + b);

    }
}

public class Hierarchial_Inheritance {
    public static void main(String arg[]) {
//     They print the Father :
//            Father obj = new Father();
//            obj.area(32);

        // They print both print methode
        Child2 obj =new Child2();
        obj.area(90);
        obj.area(98,2);
    }
}


