package Abtractions;

abstract class Father {
    Father() {
        System.out.println("I'm a lion");
    }

    abstract void walk();

    public void walked() {
        System.out.println("Hello there Animal is here");
    }

}

class Chld1 extends Father {
    Chld1() {
        System.out.println("I'm horse");
    }

    @Override
    void walk() {
//        super.walk();
        System.out.println("Horse here");
    }
}

class Chld2 extends Chld1 {

    Chld2() {
        System.out.println("I'm a chicken");
    }

    @Override
    void walk() {
//        super.walk();
        System.out.println("chicken here");
    }
}

public class first {
    public static void main(String[] args) {
        Chld2 ch = new Chld2();
ch.walked();
    }
}
