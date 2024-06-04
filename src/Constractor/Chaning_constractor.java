package Constractor;
abstract class Animal {
    Animal(){
        System.out.println("I'm a lion");
    }

    abstract void walk();
    public void walked() {
        System.out.println("Hello there Animal is here");
    }

}
class horse extends Animal {
    horse(){
        System.out.println("I'm horse");
    }
    @Override
    void walk() {
//        super.walk();
        System.out.println("Horse here");
    }
}
class chicken extends horse {

    chicken(){
        System.out.println("I'm a chicken");
    }
    @Override
    void walk() {
//        super.walk();

        System.out.println("chicken here");
    }
}
public class Chaning_constractor {
    public static void main(String[] args) {
        chicken ch = new chicken();

    }
}
